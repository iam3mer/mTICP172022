package utp.misiontic2022.c2.p17.unidad4.controlador;

import utp.misiontic2022.c2.p17.unidad4.modelo.vo.Book;
import utp.misiontic2022.c2.p17.unidad4.modelo.dao.BookDao;

public class Controlador {
    private final BookDao bookDao;

    public Controlador() {
        this.bookDao = new BookDao();
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
                book = bookDao.save(book);
            } catch (Exception e) {
                System.err.println(e);
            } 
        }
        return book;
    }
}
