/*
 * Pueda usar esta plantilla para la carga del reto a iMaster
 * Copie las clases de los paquetes Modelo, Vista, Controlador y Util
 * No incluya los import de los archivos .java solo las clases
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// Util (No modificar)
class JDBCUtilities {
    private static final String DATABASE_LOCATION = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:"+DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
}

// Remplace en adelante por las clases de sus archivos .java

// Vista
class VistaRequerimientos {}

// Controlador
class ControladorRequerimientos {}

// Modelo
// VO
class Requerimiento_1 {}

class Requerimiento_2 {}

class Requerimiento_3 {}

// DAO
class Requerimiento_1Dao {}

class Requerimiento_2Dao {}

class Requerimiento_3Dao {}