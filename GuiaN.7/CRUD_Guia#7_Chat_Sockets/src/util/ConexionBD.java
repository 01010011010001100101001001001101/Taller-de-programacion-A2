package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Thomas Sanmiguel y Sebastián Revelo
 */
public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/TallerProgramación";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "9rB@n28v#4Sx!Lz1";
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Error al cargar el driver JDBC", e);
        }
    }
    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
    }
}