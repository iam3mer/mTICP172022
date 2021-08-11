package utp.misiontic2022.c2.p17.unidad4.controlador;

import utp.misiontic2022.c2.p17.unidad4.modelo.vo.Book;
import utp.misiontic2022.c2.p17.unidad4.modelo.dao.BookDao;
import utp.misiontic2022.c2.p17.unidad4.modelo.dao.SaleDao;
import utp.misiontic2022.c2.p17.unidad4.modelo.vo.Stock;
import utp.misiontic2022.c2.p17.unidad4.modelo.dao.StockDao;
import utp.misiontic2022.c2.p17.unidad4.modelo.vo.BookStock;
import utp.misiontic2022.c2.p17.unidad4.modelo.dao.BookStockDao;

import java.sql.SQLException;
import java.util.ArrayList;

public class Controlador {
    private final BookDao bookDao;
    private final StockDao stockDao;
    private final SaleDao saleDao;
    private final BookStockDao bookstockDao;

    public Controlador() {
        this.bookDao = new BookDao();
        this.stockDao = new StockDao();
        this.saleDao = new SaleDao();
        this.bookstockDao = new BookStockDao();
    }

    public Book createBook(String title, String isbn, int year) throws SQLException {
        Book book = null;
        int band = 0;

        try {
            band = bookDao.validarISBN(isbn);
        } catch (Exception e) {
            System.err.println(e);
        }
        
        if (band == -1) {
            book = new Book();

            book.setTitle(title);
            book.setIsbn(isbn);
            book.setYear(year);

            try {
                book = bookDao.save(book);
            } catch (Exception e) {
                System.err.println(e);
            } 
        }
        return book;
    }

    public Book readBook(String isbn) throws SQLException {
        Book book = bookDao.read(isbn);
        return book;
    }
    
    public ArrayList<Book> findAllBooks() throws SQLException {
        return bookDao.allBooks();
    }  

    public Book updateBook(String isbn, String title, int year) throws SQLException {
        boolean update;

        Book book = new Book();

        book.setTitle(title);
        book.setIsbn(isbn);
        book.setYear(year);

        update = bookDao.update(book);

        return book;
    }

    public boolean deleteBook(String isbn) throws SQLException {
        boolean delete = false;

        int band = bookDao.validarISBN(isbn);

        if (band != -1) {
            if (saleDao.validarVenta(isbn) == false) {
                 int id_book = bookDao.read(isbn).getId();
                 delete = bookDao.delete(isbn);
                 if (delete) {
                     stockDao.delete(id_book);
                 }
            }
        }
        
        return delete;
    }
    
    public boolean deleteBook(int idBook) throws  SQLException {
        boolean delete = false;
        
        if(saleDao.validarVenta(idBook) == false) {
            delete = bookDao.delete(idBook);
            if (delete) {
                stockDao.delete(idBook);
            }
        }
        return delete;
    }

    public void createStock(String isbn, int amount) throws SQLException {
        int id_book = readBook(isbn).getId();
        createStock(id_book, amount);
    }

    public void createStock(int id_book, int amount) throws SQLException {
        Stock stock = new Stock();

        stock.setId_book(id_book);
        stock.setAmount(amount);

        stockDao.save(stock);
    }

    public ArrayList<BookStock> consultarCatalogoVenta() throws SQLException {
        return bookstockDao.consultarCatalogoDisponible();
    } 

    public boolean venderLibro(String isbn, int amount) throws SQLException {
        boolean venta = false;

        int id_book = bookDao.read(isbn).getId();
        
        int stock = stockDao.consultarStock(id_book);

        if (stock >= amount) {
            int auxV = saleDao.vender(id_book, amount);

            if (auxV > 0) {
                stockDao.update(id_book, amount);
            }

            venta = true;
        }
        return venta;
    }
}
