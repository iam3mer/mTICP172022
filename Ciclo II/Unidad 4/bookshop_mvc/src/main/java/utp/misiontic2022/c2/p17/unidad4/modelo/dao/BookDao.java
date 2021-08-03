package utp.misiontic2022.c2.p17.unidad4.modelo.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utp.misiontic2022.c2.p17.unidad4.modelo.vo.Book;
import utp.misiontic2022.c2.p17.unidad4.util.JDBCUtilities;

public class BookDao {

    public Book guardar(Book book) throws SQLException {

        String psql = "INSERT INTO books (title,isbn,year) VALUES (?, ?, ?)";

        try (
            Connection conn = JDBCUtilities.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(psql);
        ) {
            pstmt.setString(1, book.getTitle());
            pstmt.setString(2, book.getIsbn());
            pstmt.setInt(3, book.getYear());
            
            pstmt.executeUpdate();
        }
        
        return book;
    }

    public boolean actualizar(Book book) throws SQLException {
        boolean band = false;

        String sql = "UPDATE books SET title = '"+book.getTitle()+"', year = "+book.getYear()+" WHERE isbn = '"+book.getIsbn()+"'";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
        ) {
            stmt.executeUpdate(sql);
            band = true;
        }

        return band;
    }

    public boolean eliminar(String isbn) throws SQLException {
        boolean band;

        String sql = "DELETE FROM books WHERE isbn = '"+isbn+"';";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
        ) {

            stmt.executeUpdate(sql);
            band = true;
        } 

        return band;
    }

    public boolean validarVenta(String isbn) throws SQLException {
        boolean band = true;

        String sql = "SELECT count() as sale FROM sales s JOIN books b WHERE b.id = s.id_book AND b.isbn = '"+isbn+"';";
        
        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {

            if (rs.next()) { 
                int sale = rs.getInt("sale");
                if (sale == 0) {
                    band = false;
                }
            }
        } 

        return band;
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

    public Book buscarISBN (String isbn) throws SQLException {
        Book book = null;
        ResultSet rs = null;

        String sql = "SELECT title, isbn, year FROM books where isbn = '"+isbn+"';";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
        ) {
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                book = new Book();
                book.setTitle(rs.getString("title"));
                book.setIsbn(rs.getString("isbn"));
                book.setYear(rs.getInt("year"));
            }
        } 

        return book;
    }
}
