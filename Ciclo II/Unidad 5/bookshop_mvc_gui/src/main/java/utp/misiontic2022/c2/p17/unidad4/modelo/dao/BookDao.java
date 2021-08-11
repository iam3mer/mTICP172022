package utp.misiontic2022.c2.p17.unidad4.modelo.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.unidad4.modelo.vo.Book;
import utp.misiontic2022.c2.p17.unidad4.modelo.vo.BookStock;
import utp.misiontic2022.c2.p17.unidad4.util.JDBCUtilities;

public class BookDao {

    public Book save(Book book) throws SQLException {

        String psql = "INSERT INTO books (title,isbn,year) VALUES (?, ?, ?)";

        try (
            Connection conn = JDBCUtilities.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(psql, Statement.RETURN_GENERATED_KEYS);
        ) {
            pstmt.setString(1, book.getTitle());
            pstmt.setString(2, book.getIsbn());
            pstmt.setInt(3, book.getYear());
            
            pstmt.executeUpdate();
            
            try (
                    ResultSet gK = pstmt.getGeneratedKeys()
                ) {
                if (gK.next()) {
                    book.setId(gK.getInt(1));
                }
            } 
        }
        
        return book;
    }

    public Book read(String isbn) throws SQLException {
        Book book = null;
        String sql = "SELECT * FROM books WHERE isbn = '"+isbn+"';";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            if (rs.next()) {
                book = new Book();

                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setIsbn(rs.getString("isbn"));
                book.setYear(rs.getInt("year"));
            }
        } 
        return book;
    }

    public boolean update(Book book) throws SQLException {
        boolean update = false;

        //String sql = "UPDATE books SET title = '"+book.getTitle()+"', year = "+book.getYear()+" WHERE isbn = '"+book.getIsbn()+"'";
        String sql = "UPDATE books SET title = '"+book.getTitle()+"', year = "+book.getYear()+" WHERE id = '"+book.getId()+"'";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
        ) {
            int band = stmt.executeUpdate(sql);
            if (band == 1) {
                update = true;
            }
        } 
        return update;
    }

    public boolean delete(String isbn) throws SQLException{
        boolean delete = false;

        String sql = "DELETE FROM books WHERE isbn = '"+isbn+"';";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
        ) {
            int aux = stmt.executeUpdate(sql);
            if (aux > 0) {
                delete = true;
            }
        } 
        return delete;
    }
    
    public boolean delete(int idBook) throws SQLException{
        boolean delete = false;

        String sql = "DELETE FROM books WHERE id = '"+idBook+"';";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
        ) {
            int aux = stmt.executeUpdate(sql);
            if (aux > 0) {
                delete = true;
            }
        } 
        return delete;
    }
    
    public int validarISBN(String isbn) throws SQLException {
        ResultSet rs = null;

        int band = -1;

        String sql = "SELECT id FROM books where isbn = '"+isbn+"';";
        
        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
        ) {
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                band = rs.getInt("id");
        } 
        return band;
        }
    }

    public int validarISBN(int idBook) throws SQLException {
        ResultSet rs = null;

        int band = -1;

        String sql = "SELECT id FROM books where id = '"+idBook+"';";
        
        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
        ) {
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                band = rs.getInt("id");
        } 
        return band;
        }
    }
    
    // Nuevo
    public ArrayList<Book> allBooks() throws SQLException{
        ArrayList<Book> books = new ArrayList<>();
        Book book = null;

        String sql = "SELECT * FROM books;";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            while (rs.next()) {
                book = new Book();

                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setIsbn(rs.getString("isbn"));
                book.setYear(rs.getInt("year"));
                
                books.add(book);
            }
        } 
        return books;
    }

}
