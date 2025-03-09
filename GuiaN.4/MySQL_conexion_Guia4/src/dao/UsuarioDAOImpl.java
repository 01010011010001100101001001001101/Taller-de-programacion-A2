/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Usuario;
import exceptions.DAOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Usuario
 */

public class UsuarioDAOImpl implements UsuarioDAO {
    private final Connection connection;

    public UsuarioDAOImpl() throws SQLException {
        connection = ConnectionDB.getConnection();
    }

    @Override
    public void crear(Usuario usuario) throws DAOException {
        String sql = "INSERT INTO usuario (tipoID, nroID, nombres, correo, celular) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, usuario.getTipoID());
            ps.setString(2, usuario.getNroID());
            ps.setString(3, usuario.getNombres());
            ps.setString(4, usuario.getCorreo());
            ps.setString(5, usuario.getCelular());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new DAOException("Error al crear usuario: " + ex.getMessage(), ex);
        }
    }

    @Override
    public Usuario leer(String nroID) throws DAOException {
        String sql = "SELECT * FROM usuario WHERE nroID = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, nroID);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(
                        rs.getString("tipoID"),
                        rs.getString("nroID"),
                        rs.getString("nombres"),
                        rs.getString("correo"),
                        rs.getString("celular")
                    );
                }
                return null;
            }
        } catch (SQLException ex) {
            throw new DAOException("Error al leer usuario: " + ex.getMessage(), ex);
        }
    }

    @Override
public void actualizar(Usuario usuario) throws DAOException {
    String sql = "UPDATE usuario SET tipoID=?, nombres=?, correo=?, celular=? WHERE nroID=?";
    try (PreparedStatement ps = connection.prepareStatement(sql)) {
        ps.setString(1, usuario.getTipoID());
        ps.setString(2, usuario.getNombres());
        ps.setString(3, usuario.getCorreo());
        ps.setString(4, usuario.getCelular());
        ps.setString(5, usuario.getNroID());
        ps.executeUpdate();
    } catch (SQLException ex) {
        throw new DAOException("Error al actualizar usuario: " + ex.getMessage(), ex);
    }
}

// Método eliminar modificado
@Override
public void eliminar(String nroID) throws DAOException {
    String sql = "DELETE FROM usuario WHERE nroID=?";
    try (PreparedStatement ps = connection.prepareStatement(sql)) {
        ps.setString(1, nroID);
        int affectedRows = ps.executeUpdate();
        if (affectedRows == 0) {
            throw new DAOException("No existe usuario con ese nroID");
        }
    } catch (SQLException ex) {
        throw new DAOException("Error al eliminar usuario: " + ex.getMessage(), ex);
    }
}

    @Override
    public List<Usuario> listarTodos() throws DAOException {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                usuarios.add(new Usuario(
                    rs.getString("tipoID"),
                    rs.getString("nroID"),
                    rs.getString("nombres"),
                    rs.getString("correo"),
                    rs.getString("celular")
                ));
            }
            return usuarios;
        } catch (SQLException ex) {
            throw new DAOException("Error al listar usuarios: " + ex.getMessage(), ex);
        }
    }
}