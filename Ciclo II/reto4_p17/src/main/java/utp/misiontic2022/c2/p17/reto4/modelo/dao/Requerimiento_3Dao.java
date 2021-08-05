package utp.misiontic2022.c2.p17.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p17.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {

        ArrayList<Requerimiento_3> registros = new ArrayList<>();
        Requerimiento_3 registro = null;

        String sql = "SELECT sc.ID_Proyecto, Ciudad, Clasificacion, SUM(Precio_Total) Costo_Proyecto "
                    +"FROM (SELECT ID_Proyecto, ID_MaterialConstruccion, Cantidad * Precio_Unidad Precio_Total "
                    +"  FROM MaterialConstruccion mc "
                    +"  JOIN Compra c "
                    +"  USING (ID_MaterialConstruccion)) sc, Proyecto p "
                    +"WHERE sc.ID_Proyecto = p.ID_Proyecto AND Ciudad IN ('Sta. Rosa de Cabal', 'Pereira') "
                    +"GROUP BY Ciudad, Clasificacion, sc.ID_Proyecto "
                    +"HAVING SUM(Precio_Total) > 87000;";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            while (rs.next()) {
                registro = new Requerimiento_3();
                
                registro.setId(rs.getInt("ID_Proyecto"));
                registro.setCiudad(rs.getString("Ciudad"));
                registro.setClasificacion(rs.getString("Clasificacion"));
                registro.setCosto(rs.getInt("Costo_Proyecto"));

                registros.add(registro);
            }
        } 
        return registros;
    }
}