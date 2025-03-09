/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
import modelo.Usuario;
import exceptions.DAOException;
import exceptions.ValidationException;
import java.sql.SQLException;
import java.util.List;
import java.util.regex.Pattern;
/**
 *
 * @author Usuario
 */


public class UsuarioController {
    private final UsuarioDAO usuarioDAO;

    public UsuarioController() throws DAOException {
        try {
            usuarioDAO = new UsuarioDAOImpl();
        } catch (SQLException ex) {
            throw new DAOException("Error al inicializar DAO: " + ex.getMessage(), ex);
        }
    }

    public void crearUsuario(Usuario usuario) throws DAOException, ValidationException {
        validarUsuario(usuario);
        usuarioDAO.crear(usuario);
    }

    public void actualizarUsuario(Usuario usuario) throws DAOException, ValidationException {
        validarUsuario(usuario);
        usuarioDAO.actualizar(usuario);
    }

    public void eliminarUsuario(String nroID) throws DAOException {
        usuarioDAO.eliminar(nroID);
    }

    public Usuario buscarUsuario(String nroID) throws DAOException {
    Usuario usuario = usuarioDAO.leer(nroID);
    if (usuario == null) {
        throw new DAOException("Usuario no encontrado");
    }
    return usuario;
}

    public List<Usuario> listarUsuarios() throws DAOException {
        return usuarioDAO.listarTodos();
    }

    private void validarUsuario(Usuario usuario) throws ValidationException {
        if (usuario.getTipoID() == null || usuario.getTipoID().trim().isEmpty()) {
            throw new ValidationException("Tipo de ID es requerido");
        }
        if (usuario.getNroID() == null || usuario.getNroID().trim().isEmpty()) {
            throw new ValidationException("Número de ID es requerido");
        }
        if (usuario.getNombres() == null || usuario.getNombres().trim().isEmpty()) {
            throw new ValidationException("Nombres son requeridos");
        }
        if (usuario.getCorreo() == null || usuario.getCorreo().trim().isEmpty()) {
            throw new ValidationException("Correo es requerido");
        }
        if (!validarEmail(usuario.getCorreo())) {
            throw new ValidationException("Formato de correo inválido");
        }
        if (usuario.getCelular() == null || usuario.getCelular().trim().isEmpty()) {
            throw new ValidationException("Celular es requerido");
        }
        if (!validarCelular(usuario.getCelular())) {
            throw new ValidationException("Celular debe contener solo números");
        }
    }

    private boolean validarEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return Pattern.matches(regex, email);
    }

    private boolean validarCelular(String celular) {
        return Pattern.matches("\\d+", celular);
    }
}