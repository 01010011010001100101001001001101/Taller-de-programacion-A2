package dao;
import util.ConexionBD;
import modelo.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Thomas Sanmiguel y Sebastián Revelo 
 */
public class UsuarioDAOImpl implements UsuarioDAO {
    private final Connection conexion;
    public UsuarioDAOImpl() throws SQLException {
        conexion = ConexionBD.obtenerConexion();
    }
    @Override
    public boolean crearUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario (nroID, tipoID, nombres, edad, correo, celular, semestre, carrera) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            asignarParametrosUsuario(stmt, usuario);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            manejarExcepcion(e);
            return false;
        }
    }
    @Override
    public Usuario obtenerPorId(long nroID) {
        String sql = "SELECT * FROM usuario WHERE nroID = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setLong(1, nroID);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return mapearUsuario(rs);
            }
        } catch (SQLException e) {
            manejarExcepcion(e);
        }
        return null;
    }
    @Override
    public List<Usuario> obtenerTodos() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario";
        try (Statement stmt = conexion.createStatement(); 
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                usuarios.add(mapearUsuario(rs));
            }
        } catch (SQLException e) {
            manejarExcepcion(e);
        }
        return usuarios;
    }
    @Override
    public boolean actualizarUsuario(Usuario usuario) {
        String sql = "UPDATE usuario SET tipoID=?, nombres=?, edad=?, correo=?, celular=?, semestre=?, carrera=? WHERE nroID=?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, usuario.getTipoID());
            stmt.setString(2, usuario.getNombres());
            stmt.setInt(3, usuario.getEdad());
            stmt.setString(4, usuario.getCorreo());
            stmt.setLong(5, usuario.getCelular());
            stmt.setInt(6, usuario.getSemestre());
            stmt.setString(7, usuario.getCarrera());
            stmt.setLong(8, usuario.getNroID());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            manejarExcepcion(e);
            return false;
        }
    }
    @Override
    public boolean eliminarUsuario(long nroID) {
        String sql = "DELETE FROM usuario WHERE nroID = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setLong(1, nroID);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            manejarExcepcion(e);
            return false;
        }
    }
    private Usuario mapearUsuario(ResultSet rs) throws SQLException {
        return new Usuario(
            rs.getLong("nroID"),
            rs.getString("tipoID"),
            rs.getString("nombres"),
            rs.getInt("edad"),
            rs.getString("correo"),
            rs.getLong("celular"),
            rs.getInt("semestre"),
            rs.getString("carrera")
        );
    }
    private void asignarParametrosUsuario(PreparedStatement stmt, Usuario usuario) throws SQLException {
        stmt.setLong(1, usuario.getNroID());
        stmt.setString(2, usuario.getTipoID());
        stmt.setString(3, usuario.getNombres());
        stmt.setInt(4, usuario.getEdad());
        stmt.setString(5, usuario.getCorreo());
        stmt.setLong(6, usuario.getCelular());
        stmt.setInt(7, usuario.getSemestre());
        stmt.setString(8, usuario.getCarrera());
    }
    private void manejarExcepcion(SQLException e) {
        System.err.println("Error de SQL: " + e.getMessage());
    }
}