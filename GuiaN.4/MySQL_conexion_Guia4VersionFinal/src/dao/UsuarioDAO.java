package dao;
import modelo.Usuario;
import java.util.List;
/**
 *
 * @author Thomas Sanmiguel y Sebastián Revelo 
 */
public interface UsuarioDAO {
    boolean crearUsuario(Usuario usuario);
    Usuario obtenerPorId(long nroID);
    List<Usuario> obtenerTodos();
    boolean actualizarUsuario(Usuario usuario);
    boolean eliminarUsuario(long nroID);
}