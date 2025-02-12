/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Usuario
 */


public class RegistroUsuario implements IGestionDatos {
    private static final String FILE_NAME = "src/data/usuarios.txt";
    private static final int RECORD_SIZE = 50; 

    @Override
    public boolean agregarRegistro(RegistroUsuario reg) {
        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "rw")) {
            raf.seek(raf.length()); 
            escribirRegistro(raf, reg);
            return true;
        } catch (IOException e) {
            System.out.println("Error al agregar usuario: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean borrarRegistro(String id) {
        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "rw")) {
            long pos = buscarPosicion(id, raf);
            if (pos != -1) {
                raf.seek(pos);
                raf.writeBytes(String.format("%-" + RECORD_SIZE + "s", "")); 
                return true;
            }
        } catch (IOException e) {
            System.out.println("Error al borrar usuario: " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean editarRegistro(RegistroUsuario reg) {
        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "rw")) {
            long pos = buscarPosicion(reg.getId(), raf);
            if (pos != -1) {
                raf.seek(pos);
                escribirRegistro(raf, reg);
                return true;
            }
        } catch (IOException e) {
            System.out.println("Error al editar usuario: " + e.getMessage());
        }
        return false;
    }

    @Override
    public RegistroUsuario buscar(String id) {
        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "r")) {
            long pos = buscarPosicion(id, raf);
            if (pos != -1) {
                raf.seek(pos);
                return leerRegistro(raf);
            }
        } catch (IOException e) {
            System.out.println("Error al buscar usuario: " + e.getMessage());
        }
        return null;
    }

    private long buscarPosicion(String id, RandomAccessFile raf) throws IOException {
        raf.seek(0);
        while (raf.getFilePointer() < raf.length()) {
            long pos = raf.getFilePointer();
            RegistroUsuario usuario = leerRegistro(raf);
            if (usuario != null && usuario.getId().trim().equals(id)) {
                return pos;
            }
        }
        return -1; // No encontrado
    }

    private void escribirRegistro(RandomAccessFile raf, RegistroUsuario reg) throws IOException {
        String registro = String.format("%-10s%-20s%-5d%n", reg.getId(), reg.getNombre(), reg.getEdad());
        raf.writeBytes(registro);
    }

    private RegistroUsuario leerRegistro(RandomAccessFile raf) throws IOException {
        String linea = raf.readLine();
        if (linea != null && linea.trim().length() > 0) {
            String id = linea.substring(0, 10).trim();
            String nombre = linea.substring(10, 30).trim();
            int edad = Integer.parseInt(linea.substring(30, 35).trim());
            return new RegistroUsuario(id, nombre, edad);
        }
        return null;
    }

    private String id;
    private String nombre;
    private int edad;

    public RegistroUsuario(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad;
    }
}
