package utp.misiontic2022.c2.p17.unidad4.modelo.dao;

import utp.misiontic2022.c2.p17.unidad4.util.JDBCUtilities;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utp.misiontic2022.c2.p17.unidad4.modelo.vo.ResumenLibro;

public class ResumenLibroDao {
    
    public ResumenLibro consultarResumenLibro(String isbn) throws SQLException {
        ResumenLibro resumenLibro = null;
        String sql = "SELECT title, amount as Inventario, Ventas FROM stock s2 JOIN (SELECT b.id as id_book, b.title, SUM(s.amount) as Ventas FROM books b, sales s WHERE b.id = s.id_book AND b.isbn = '"+ibsn+"') as book WHERE book.id_book = s2.id_book;";
    
        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            if(rs.next()) {
                resumenLibro = new ResumenLibro();
                resumenLibro.setTitle(rs.getString("title"));
                resumenLibro.setInventario(rs.getInt("Inventario"));
                resumenLibro.setVenta(rs.getInt("Ventas"));
            }
        }
        return resumenLibro;
    }
}
