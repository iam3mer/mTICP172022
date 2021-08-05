package utp.misiontic2022.c2.p17.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p17.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {

        ArrayList<Requerimiento_2> registros = new ArrayList<>();
        Requerimiento_2 registro = null;

        String sql = "SELECT ID_MaterialConstruccion, Nombre_Material, Cantidad, Precio_Unidad, Cantidad * Precio_Unidad Precio_Total "
                    +"FROM MaterialConstruccion mc "
                    +"JOIN Compra c "
                    +"USING (ID_MaterialConstruccion) "
                    +"WHERE ID_Proyecto IN (14, 20, 18, 36, 45, 48, 56) "
                    +"ORDER BY ID_Proyecto, Precio_Unidad DESC;";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            while (rs.next()) {
                registro = new Requerimiento_2();

                registro.setIdmc(rs.getInt("ID_MaterialConstruccion"));
                registro.setMaterial(rs.getString("Nombre_Material"));
                registro.setCantidad(rs.getInt("Cantidad"));
                registro.setpUnidad(rs.getInt("Precio_Unidad"));
                registro.setpTotal(rs.getInt("Precio_Total"));

                registros.add(registro);
            }
        } 
        return registros;
    }
}