/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import modelo.Usuario;
import java.util.List;
import exceptions.DAOException;

/**
 *
 * @author Usuario
 */
public interface UsuarioDAO {
    void crear(Usuario usuario) throws DAOException;
    Usuario leer(String nroID) throws DAOException;
    void actualizar(Usuario usuario) throws DAOException;
    void eliminar(String nroID) throws DAOException;
    List<Usuario> listarTodos() throws DAOException;
}