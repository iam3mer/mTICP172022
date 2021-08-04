package utp.misiontic2022.c2.p17.unidad4.controlador;

import utp.misiontic2022.c2.p17.unidad4.modelo.vo.Book;
import utp.misiontic2022.c2.p17.unidad4.modelo.vo.Stock;

import java.sql.SQLException;

import utp.misiontic2022.c2.p17.unidad4.modelo.dao.BookDao;
import utp.misiontic2022.c2.p17.unidad4.modelo.dao.SaleDao;
import utp.misiontic2022.c2.p17.unidad4.modelo.dao.StockDao;

public class Controlador {
    private final BookDao bookDao;
    private final SaleDao saleDao;
    private final StockDao stockDao;

    public Controlador() {
        this.bookDao = new BookDao();
        this.saleDao = new SaleDao();
        this.stockDao = new StockDao();
    }

    public Book createBook(String title, String isbn, int year) {
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
                book = bookDao.guardar(book);
            } catch (Exception e) {
                System.err.println(e);
            } 
        }
        return book;
    }

    public void createStock(String isbn, int amount) throws SQLException {
        int id_book = bookDao.buscarISBN(isbn).getId();
        createStock(id_book, amount);
    }

    public void createStock(int id_book, int amount)  throws SQLException {
        Stock stock = new Stock();

        stock.setId_book(id_book);
        stock.setAmount(amount);

        stockDao.guardar(stock);
    }

    public Book readBook(String isbn) throws SQLException {
        Book book = bookDao.buscarISBN(isbn);

        return book;
    }

    public boolean updateBook(String isbn, String title, int year) throws SQLException {
        boolean band;
        Book book = new Book();

        book.setTitle(title);
        book.setIsbn(isbn);
        book.setYear(year);

        band = bookDao.actualizar(book);

        return band;
    }

    public boolean deleteBook(String isbn) throws SQLException {
        boolean delete = false;

        int band = bookDao.validarISBN(isbn);

        if (band != -1) {
            if (saleDao.validarVenta(isbn) == false) {
                int id_book = bookDao.buscarISBN(isbn).getId();
                delete = bookDao.eliminar(isbn);
                if (delete) {
                    System.out.println(id_book);
                    stockDao.delete(id_book);
                }
            }
        }
        return delete;
    }

}
