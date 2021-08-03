package utp.misiontic2022.c2.p17.unidad4.controlador;

import utp.misiontic2022.c2.p17.unidad4.modelo.vo.Book;

import java.sql.SQLException;

import utp.misiontic2022.c2.p17.unidad4.modelo.dao.BookDao;
import utp.misiontic2022.c2.p17.unidad4.modelo.dao.SaleDao;

public class Controlador {
    private final BookDao bookDao;
    private final SaleDao saleDao;

    public Controlador() {
        this.bookDao = new BookDao();
        this.saleDao = new SaleDao();
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
            if (bookDao.validarVenta(isbn) == false) {
                delete = bookDao.eliminar(isbn);
                int id_book = saleDao.consultarIDSale(isbn);
                saleDao.eliminar(id_book);
            }
        }

        return delete;
    }

}
