package utp.misiontic2022.c2.p17.unidad4.modelo.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import utp.misiontic2022.c2.p17.unidad4.util.JDBCUtilities;

public class SaleDao {
    
    public void eliminar(int id_book) throws SQLException {
        String sql = "DELETE FROM sales WHERE id_book = "+id_book+";";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
        ) {
            stmt.executeUpdate(sql);
        } 
    }

    public int consultarIDSale(String isbn) throws SQLException {
        int id_book = 0;
        String sql = "SELECT DISTINCT id_book FROM sales s JOIN books b WHERE b.id = s.id_book AND b.isbn = '"+isbn+"';";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            if (rs.next()) {
                id_book = rs.getInt("id_book");
            }
            
        } 
        return id_book;
    }
}
