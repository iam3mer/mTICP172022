package utp.misiontic2022.c2.p17.unidad4.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utp.misiontic2022.c2.p17.unidad4.util.JDBCUtilities;

import utp.misiontic2022.c2.p17.unidad4.modelo.vo.Stock;

public class StockDao {
    
    public void save(Stock stock) throws SQLException {
        String psql = "INSERT INTO stock (id_book,amount) VALUES (?, ?)";

        try (
            Connection conn = JDBCUtilities.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(psql);
        ) {
            pstmt.setInt(1, stock.getId_book());
            pstmt.setInt(2, stock.getAmount());

            pstmt.executeUpdate();
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

    public void update(int id_book, int amount) throws SQLException {

        int amountAct = consultarStock(id_book) - amount;

        String sql = "UPDATE stock SET amount = "+amountAct+" WHERE id_book = "+id_book+";";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
        ) {
            stmt.executeUpdate(sql);
        } 
    }

    public int consultarStock(int id_book) throws SQLException {
        int amount = 0;
        String stock = "SELECT amount FROM stock s WHERE id_book = "+id_book+";";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(stock);
        ) {
            if (rs.next()) {
                amount = rs.getInt("amount");
            }
        }
        return amount;
    }
}
