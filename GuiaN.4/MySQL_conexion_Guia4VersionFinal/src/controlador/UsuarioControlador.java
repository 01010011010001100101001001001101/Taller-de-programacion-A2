package controlador;
import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
import modelo.Usuario;
import java.util.List;
/**
 *
 * @author Thomas Sanmiguel y Sebastián Revelo 
 */
public class UsuarioControlador {
    private final UsuarioDAO usuarioDAO;
    public UsuarioControlador() throws Exception {
        this.usuarioDAO = new UsuarioDAOImpl();
    }
    public boolean crearUsuario(Usuario usuario) {
        return usuarioDAO.crearUsuario(usuario);
    }
    public Usuario obtenerUsuario(long nroID) {
        return usuarioDAO.obtenerPorId(nroID);
    }
    public List<Usuario> obtenerTodosUsuarios() {
        return usuarioDAO.obtenerTodos();
    }
    public boolean actualizarUsuario(Usuario usuario) {
        return usuarioDAO.actualizarUsuario(usuario);
    }
    public boolean eliminarUsuario(long nroID) {
        return usuarioDAO.eliminarUsuario(nroID);
    }
}