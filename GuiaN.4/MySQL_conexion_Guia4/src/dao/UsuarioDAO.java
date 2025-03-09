package dao;
import modelo.Usuario;
import java.util.List;
import exceptions.DAOException;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo
 */
public interface UsuarioDAO {
    void crear(Usuario usuario) throws DAOException;
    Usuario leer(String nroID) throws DAOException;
    void actualizar(Usuario usuario) throws DAOException;
    void eliminar(String nroID) throws DAOException;
    List<Usuario> listarTodos() throws DAOException;
}