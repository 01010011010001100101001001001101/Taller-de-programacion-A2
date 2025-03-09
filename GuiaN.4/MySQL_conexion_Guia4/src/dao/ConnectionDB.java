package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo
 */
public class ConnectionDB {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/crud_taller_programación?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "9rB@n28v#4Sx!Lz1";
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException ex) {
            throw new SQLException("Driver JDBC no encontrado", ex);
        }
    }
}