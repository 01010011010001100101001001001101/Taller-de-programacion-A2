package exceptions;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo
 */
public class DAOException extends Exception {
    public DAOException(String message) {
        super(message);
    }
    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }
}