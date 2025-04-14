package simulacionmercadoguian.pkg6;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo
 */
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ClienteManager clienteManager = new ClienteManager();
    public static void main(String[] args) {
        try {
            // Configurar la consola para UTF-8 para los emojis
            System.setProperty("file.encoding", "UTF-8");
            System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        } catch (Exception e) {
            System.err.println("No se pudo configurar UTF-8: " + e.getMessage());
        }
        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            int opcion = obtenerOpcion();
            switch (opcion) {
                case 1 -> ingresarNuevoCliente();
                case 2 -> clienteManager.mostrarClientesEnEspera();
                case 3 -> clienteManager.iniciarProcesoCobro();
                case 4 -> {
                    continuar = false;
                    clienteManager.cerrar();
                    System.out.println("\n👋 Gracias por usar el sistema. ¡Hasta pronto!");
                }
                default -> System.out.println("\n❌ Opción inválida. Por favor intente nuevamente.");
            }
        }
        scanner.close();
    }
    private static void mostrarMenu() {
        System.out.println("\n[Menú Principal]");
        System.out.println("1. Ingresar nuevo cliente");
        System.out.println("2. Ver clientes en espera");
        System.out.println("3. Iniciar cobro");
        System.out.println("4. Salir");
    }
    private static int obtenerOpcion() {
        System.out.print("Seleccione una opción: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor ingrese un número válido.");
            scanner.next();
        }
        return scanner.nextInt();
    }
    private static void ingresarNuevoCliente() {
        scanner.nextLine(); // Limpiar buffer
        System.out.print("\nIngrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        clienteManager.agregarCliente(nombre);
        Cliente cliente = clienteManager.getUltimoCliente();

        boolean agregarMasProductos = true;
        while (agregarMasProductos) {
            System.out.print("\nIngrese el nombre del producto: ");
            String nombreProducto = scanner.nextLine();
            
            System.out.print("Ingrese el precio del producto (COP): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor ingrese un precio válido.");
                scanner.next();
            }
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer
            cliente.agregarProducto(new Producto(nombreProducto, precio));
            System.out.print("\n¿Desea agregar otro producto? (s/n): ");
            agregarMasProductos = scanner.nextLine().toLowerCase().startsWith("s");
        }

        System.out.println("\n✅ Cliente agregado exitosamente a la lista de espera.");
    }
}
