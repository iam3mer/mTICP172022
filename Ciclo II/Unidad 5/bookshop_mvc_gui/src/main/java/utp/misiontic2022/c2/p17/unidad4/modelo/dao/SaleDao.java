package utp.misiontic2022.c2.p17.unidad4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utp.misiontic2022.c2.p17.unidad4.util.JDBCUtilities;

public class SaleDao{

    public int vender(int id_book, int amount) throws SQLException {
        String sql = "INSERT INTO sales VALUES (DATETIME('now'), "+id_book+","+amount+");";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
        ) {
            return stmt.executeUpdate(sql);
        }
    }

    public boolean validarVenta(String isbn) throws SQLException {
        boolean band = true;

        String sql = "SELECT COUNT() as sale FROM sales s JOIN books b WHERE s.id_book = b.id AND b.isbn = '"+isbn+"';";

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
    
    public boolean validarVenta(int idBook) throws SQLException {
        boolean band = true;

        String sql = "SELECT COUNT() as sale FROM sales s JOIN books b WHERE s.id_book = b.id AND b.id = '"+idBook+"';";

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
}