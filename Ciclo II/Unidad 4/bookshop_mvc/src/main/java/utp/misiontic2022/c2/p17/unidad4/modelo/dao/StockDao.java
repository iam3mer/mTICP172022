package utp.misiontic2022.c2.p17.unidad4.modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import utp.misiontic2022.c2.p17.unidad4.modelo.vo.Stock;

import utp.misiontic2022.c2.p17.unidad4.util.JDBCUtilities;

public class StockDao {

    public void guardar(Stock stock) throws SQLException {
        String sql = "INSERT INTO stock (id_book,amount) VALUES ("+stock.getId_book()+","+stock.getAmount()+");";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
        ) {
            stmt.executeUpdate(sql);
        } 
    }
    
    public void delete(int id_book) throws SQLException {
        String sql = "DELETE FROM stock WHERE id_book = "+id_book+";";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
        ) {
            stmt.executeUpdate(sql);
        }
    }
}
