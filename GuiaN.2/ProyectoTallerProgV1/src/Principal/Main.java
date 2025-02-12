/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import modelo.RegistroUsuario;


/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistroUsuario registro = new RegistroUsuario("1", "Ejemplo", 25);

        int opcion;
        do {
            System.out.println("\nMenú CRUD de Usuarios");
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Editar Usuario");
            System.out.println("3. Buscar Usuario");
            System.out.println("4. Eliminar Usuario");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Ingrese Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese Edad: ");
                    int edad = scanner.nextInt();

                    RegistroUsuario nuevoUsuario = new RegistroUsuario(id, nombre, edad);
                    registro.agregarRegistro(nuevoUsuario);
                    System.out.println("Usuario agregado exitosamente.");
                    break;

                case 2:
                    System.out.print("Ingrese ID del usuario a editar: ");
                    String idEditar = scanner.nextLine();
                    RegistroUsuario usuarioEditar = registro.buscar(idEditar);

                    if (usuarioEditar != null) {
                        System.out.print("Nuevo Nombre: ");
                        String nuevoNombre = scanner.nextLine();
                        System.out.print("Nueva Edad: ");
                        int nuevaEdad = scanner.nextInt();

                        usuarioEditar = new RegistroUsuario(idEditar, nuevoNombre, nuevaEdad);
                        registro.editarRegistro(usuarioEditar);
                        System.out.println("Usuario actualizado.");
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese ID del usuario a buscar: ");
                    String idBuscar = scanner.nextLine();
                    RegistroUsuario encontrado = registro.buscar(idBuscar);

                    if (encontrado != null) {
                        System.out.println("Usuario encontrado: " + encontrado);
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese ID del usuario a eliminar: ");
                    String idEliminar = scanner.nextLine();
                    if (registro.borrarRegistro(idEliminar)) {
                        System.out.println("Usuario eliminado.");
                    } else {
                        System.out.println("Error al eliminar usuario.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    // Código para borrar el archivo o limpiarlo
                    File archivo = new File("usuarios.txt");
                    try {
                        if (archivo.exists()) {
                            // Borramos todo el contenido del archivo
                            java.nio.file.Files.write(archivo.toPath(), new byte[0]);
                            System.out.println("Archivo usuarios.txt borrado exitosamente.");
                        } else {
                            System.out.println("El archivo no existe.");
                        }
                    } catch (IOException e) {
                        System.out.println("Error al manipular el archivo: " + e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}