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
        boolean band = false;

        String sql = "DELETE FROM books WHERE isbn = '"+isbn+"';";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
        ) {
            int aux = stmt.executeUpdate(sql);
            if (aux > 0) {
                band = true;
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

        String sql = "SELECT * FROM books where isbn = '"+isbn+"';";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
        ) {
            rs = stmt.executeQuery(sql);

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
}
