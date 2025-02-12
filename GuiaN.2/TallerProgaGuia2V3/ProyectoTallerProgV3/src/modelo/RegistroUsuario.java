/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */



public class RegistroUsuario implements IGestionDatos {

    // Ajusta la ruta si tu archivo se encuentra en otra ubicación
    private static final String FILE_NAME = "src/data/usuarios.txt";

    private String id;
    private String nombre;
    private int edad;

    // Constructor principal
    public RegistroUsuario(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor vacío (opcional)
    public RegistroUsuario() {
    }

    @Override
    public boolean agregarRegistro(RegistroUsuario reg) {
        List<RegistroUsuario> usuarios = leerRegistros();
        usuarios.add(reg);
        return escribirRegistros(usuarios);
    }

    @Override
    public boolean borrarRegistro(String id) {
        List<RegistroUsuario> usuarios = leerRegistros();
        boolean eliminado = usuarios.removeIf(u -> u.getId().equals(id));
        if (eliminado) {
            return escribirRegistros(usuarios);
        }
        return false;
    }

    @Override
    public boolean editarRegistro(RegistroUsuario reg) {
        List<RegistroUsuario> usuarios = leerRegistros();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId().equals(reg.getId())) {
                usuarios.set(i, reg);
                return escribirRegistros(usuarios);
            }
        }
        return false;
    }

    @Override
    public RegistroUsuario buscar(String id) {
        List<RegistroUsuario> usuarios = leerRegistros();
        for (RegistroUsuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    /**
     * Deja el archivo completamente vacío (para cuando se desee eliminar todos los datos).
     */
    public void borrarTodo() {
        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "rw")) {
            raf.setLength(0);  // Deja el archivo en blanco
        } catch (IOException e) {
            System.out.println("Error al limpiar el archivo: " + e.getMessage());
        }
    }

    /**
     * Retorna la lista completa de usuarios leyendo directamente el archivo.
     * Útil para mostrar todos los registros en una interfaz gráfica.
     */
    public List<RegistroUsuario> listarRegistros() {
        return leerRegistros();
    }

    // -------------------------------------------------------------------------
    // Métodos privados de lectura y escritura
    // -------------------------------------------------------------------------
    private List<RegistroUsuario> leerRegistros() {
        List<RegistroUsuario> usuarios = new ArrayList<>();
        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "r")) {
            String linea = raf.readLine(); // Leemos la primera línea (todo está en una sola línea)
            if (linea != null && !linea.isBlank()) {
                // Separamos cada usuario por ", "
                String[] partes = linea.split(", ");
                for (String parte : partes) {
                    // Ejemplo de parte: "ID1: 1030000062 Usuario1: Juan Edad1: 15"
                    String[] datos = parte.split(" ");
                    if (datos.length == 6) {
                        String parseId = datos[1];
                        String parseNombre = datos[3];
                        int parseEdad = Integer.parseInt(datos[5]);
                        usuarios.add(new RegistroUsuario(parseId, parseNombre, parseEdad));
                    } else {
                        System.out.println("Formato de datos incorrecto: " + parte);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer usuarios: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir la edad: " + e.getMessage());
        }
        return usuarios;
    }

    private boolean escribirRegistros(List<RegistroUsuario> usuarios) {
        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "rw")) {
            raf.setLength(0);  // Limpiamos el archivo

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < usuarios.size(); i++) {
                RegistroUsuario u = usuarios.get(i);
                int index = i + 1; // Para ID1, Usuario1, Edad1...
                sb.append(String.format("ID%d: %s Usuario%d: %s Edad%d: %d",
                        index, u.getId(),
                        index, u.getNombre(),
                        index, u.getEdad()));

                if (i < usuarios.size() - 1) {
                    sb.append(", ");
                }
            }
            raf.writeBytes(sb.toString());
            return true;
        } catch (IOException e) {
            System.out.println("Error al escribir usuarios: " + e.getMessage());
            return false;
        }
    }

    // -------------------------------------------------------------------------
    // Getters, Setters, toString()
    // -------------------------------------------------------------------------
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad;
    }
}
