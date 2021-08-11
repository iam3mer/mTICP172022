package utp.misiontic2022.c2.p17.unidad4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.unidad4.modelo.vo.BookStock;
import utp.misiontic2022.c2.p17.unidad4.util.JDBCUtilities;

public class BookStockDao {
    public ArrayList<BookStock> consultarCatalogoDisponible() throws SQLException {
        ArrayList<BookStock> registros = new ArrayList<>();
        BookStock registro = null;

        String sql = "SELECT title, isbn, year, amount "
                    +"FROM books b "
                    +"JOIN stock s "
                    +"WHERE b.id = s.id_book "
                    +"AND amount > 0;";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            while (rs.next()) {
                registro = new BookStock();

                registro.setTitle(rs.getString("title"));
                registro.setIsbn(rs.getString("isbn"));
                registro.setYear(rs.getInt("year"));
                registro.setAmount(rs.getInt("amount"));

                registros.add(registro);
            }
        } 
        return registros;
    }
}
