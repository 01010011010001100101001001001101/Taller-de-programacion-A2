package util;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;
/**
 *
 * @author Thomas Sanmiguel y Sebastián Revelo
 */
public class Validador {
    private static final Pattern PATRON_CORREO = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
    private static final Pattern PATRON_TELEFONO = Pattern.compile("^[0-9]{7,15}$");
    private static final Pattern PATRON_NOMBRE = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]{5,100}$");
    private static final Pattern PATRON_CARRERA = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]{5,50}$");
    public static boolean validarCampoRequerido(String valor, String nombreCampo) {
        if (valor == null || valor.trim().isEmpty()) {
            mostrarError("El campo " + nombreCampo + " es obligatorio");
            return false;
        }
        return true;
    }
    public static boolean validarCorreo(String correo) {
        if (!PATRON_CORREO.matcher(correo).matches()) {
            mostrarError("Formato de correo electrónico inválido");
            return false;
        }
        return true;
    }
    public static boolean validarTelefono(String telefono) {
        if (!PATRON_TELEFONO.matcher(telefono).matches()) {
            mostrarError("El teléfono debe contener entre 7 y 15 dígitos");
            return false;
        }
        return true;
    }
    public static boolean validarNombre(String nombre) {
        if (!PATRON_NOMBRE.matcher(nombre).matches()) {
            mostrarError("El nombre debe contener entre 5 y 100 caracteres válidos");
            return false;
        }
        return true;
    }
    public static boolean validarEdad(int edad) {
        if (edad < 15 || edad > 100) {
            mostrarError("La edad debe estar entre 15 y 100 años");
            return false;
        }
        return true;
    }
    public static boolean validarSemestre(int semestre) {
        if (semestre < 1 || semestre > 10) {
            mostrarError("El semestre debe estar entre 1 y 10");
            return false;
        }
        return true;
    }
    public static boolean validarCarrera(String carrera) {
        if (!PATRON_CARRERA.matcher(carrera).matches()) {
            mostrarError("La carrera debe contener entre 5 y 50 caracteres válidos");
            return false;
        }
        return true;
    }
    public static void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error de Validación", JOptionPane.ERROR_MESSAGE);
    }
}