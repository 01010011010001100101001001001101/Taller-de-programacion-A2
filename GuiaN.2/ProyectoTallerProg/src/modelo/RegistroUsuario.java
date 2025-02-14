package modelo;
import java.util.List;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo 
 */
public class RegistroUsuario implements IGestionDatos {
    private static final String FILE_NAME = "src/data/usuarios.txt";
    private String id;
    private String nombre;
    private int edad;
    public RegistroUsuario(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    public RegistroUsuario() {
    }
    @Override
    public boolean agregarRegistro(RegistroUsuario reg) {
        List<RegistroUsuario> usuarios = leerRegistros();
        usuarios.add(reg);
        return escribirRegistros(usuarios);
    }
    public boolean existeID(String id) {
        return leerRegistros().stream().anyMatch(u -> u.getId().equals(id));
    }
    @Override
    public boolean borrarRegistro(String id) {
        List<RegistroUsuario> usuarios = leerRegistros();
        boolean eliminado = usuarios.removeIf(u -> u.getId().equals(id));
        return eliminado && escribirRegistros(usuarios);
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
        return leerRegistros().stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    public List<RegistroUsuario> listarRegistros() {
        return leerRegistros();
    }
    public void borrarTodo() {
        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "rw")) {
            raf.setLength(0);
        } catch (IOException e) {
            System.out.println("Error al limpiar el archivo: " + e.getMessage());
        }
    }
    private List<RegistroUsuario> leerRegistros() {
        List<RegistroUsuario> usuarios = new ArrayList<>();
        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "r")) {
            String linea = raf.readLine();
            if (linea != null && !linea.isBlank()) {
                String[] partes = linea.split(", ");
                for (String parte : partes) {
                    String[] datos = parte.split(" ");
                    if (datos.length == 6) {
                        String parseId = datos[1];
                        String parseNombre = datos[3];
                        int parseEdad = Integer.parseInt(datos[5]);
                        usuarios.add(new RegistroUsuario(parseId, parseNombre, parseEdad));
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer usuarios: " + e.getMessage());
        }
        return usuarios;
    }
    private boolean escribirRegistros(List<RegistroUsuario> usuarios) {
        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "rw")) {
            raf.setLength(0);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < usuarios.size(); i++) {
                RegistroUsuario u = usuarios.get(i);
                sb.append(String.format("ID%d: %s Usuario%d: %s Edad%d: %d",
                        i + 1, u.getId(), i + 1, u.getNombre(), i + 1, u.getEdad()));
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
