package productorconsumidor;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo
 */
public class HistorialResultados {
    private static List<String> resultados = new ArrayList<>(); 
    public static void agregarResultado(int original, int resultado) {
        resultados.add(String.format("%d x 2 = %d", original, resultado));
    } 
    public static void mostrarHistorial() {
        if (resultados.isEmpty()) {
            System.out.println("No hay resultados en el historial.");
            return;
        }
        System.out.println("\n📜 Historial de resultados:");
        resultados.forEach(System.out::println);
    }
}
