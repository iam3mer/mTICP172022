package utp.misiontic2022.c2.p17.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p17.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {

        ArrayList<Requerimiento_1> registros = new ArrayList<>();
        Requerimiento_1 registro = null;

        String sql = "SELECT Nombre||' '||Primer_Apellido Lider, Cargo, COUNT(ID_Lider) '# Proyectos' "
                    +"FROM Lider l "
                    +"JOIN Proyecto p "
                    +"USING (ID_Lider) "
                    +"WHERE p.Constructora = 'Pegaso' "
                    +"GROUP BY p.ID_Lider "
                    +"ORDER BY Cargo, Lider;";

        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            while (rs.next()) {
                registro = new Requerimiento_1();
                registro.setLider(rs.getString("Lider"));
                registro.setCargo(rs.getString("Cargo"));
                registro.setProyectos(rs.getInt("# Proyectos"));

                registros.add(registro);
            }
        } 
        return registros;
    }
}