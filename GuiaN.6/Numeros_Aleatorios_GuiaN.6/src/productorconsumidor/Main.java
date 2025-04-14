package productorconsumidor;
import java.util.Scanner;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo
 */
public class Main {
    private static Thread threadProductor;
    private static Thread threadConsumidor;
    private static Productor productor;
    private static Consumidor consumidor;
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            do {
                System.out.println("\n=== [Menú Principal] ===");
                System.out.println("-> 1. Iniciar proceso Productor/Consumidor");
                System.out.println("*  2. Ver historial de resultados");
                System.out.println("|| 3. Detener proceso Productor/Consumidor");
                System.out.println("X  4. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1 -> iniciarProceso();
                    case 2 -> HistorialResultados.mostrarHistorial();
                    case 3 -> {
                        detenerProceso();
                        System.out.println("|| Proceso Productor/Consumidor detenido");
                    }
                    case 4 -> {
                        detenerProceso();
                        System.out.println(">> ¡Hasta luego!");
                    }
                    default -> System.out.println("X  Opción no válida");
                }
            } while (opcion != 4);
        }
    }
    private static void iniciarProceso() {
        if (threadProductor != null && threadProductor.isAlive()) {
            System.out.println("!  El proceso ya está en ejecución");
            return;
        }
        System.out.println("\n>> Iniciando hilos...");
        BufferCompartido buffer = new BufferCompartido();
        productor = new Productor(buffer);
        consumidor = new Consumidor(buffer);
        threadProductor = new Thread(productor);
        threadConsumidor = new Thread(consumidor);
        threadProductor.start();
        threadConsumidor.start();
    }
    private static void detenerProceso() {
        if (productor != null) productor.detener();
        if (consumidor != null) consumidor.detener();
    }
}
