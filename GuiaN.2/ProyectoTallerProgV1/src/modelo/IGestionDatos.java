/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */

public interface IGestionDatos {
    boolean agregarRegistro(RegistroUsuario reg);
    boolean borrarRegistro(String id);
    boolean editarRegistro(RegistroUsuario reg);
    RegistroUsuario buscar(String id);
}
