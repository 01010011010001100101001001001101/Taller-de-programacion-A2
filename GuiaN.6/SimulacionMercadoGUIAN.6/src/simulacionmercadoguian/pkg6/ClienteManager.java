package simulacionmercadoguian.pkg6;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo
 */
public class ClienteManager {
    private List<Cliente> clientesEnEspera;
    private ExecutorService executorService;
    private Cajera cajera;
    public ClienteManager() {
        this.clientesEnEspera = new ArrayList<>();
        this.cajera = new Cajera("Cajera 1");
        this.executorService = Executors.newSingleThreadExecutor();
    }
    public void agregarCliente(String nombre) {
        Cliente cliente = new Cliente(nombre, cajera);
        clientesEnEspera.add(cliente);
    }
    public Cliente getUltimoCliente() {
        if (clientesEnEspera.isEmpty()) {
            return null;
        }
        return clientesEnEspera.get(clientesEnEspera.size() - 1);
    }
    public void mostrarClientesEnEspera() {
        if (clientesEnEspera.isEmpty()) {
            System.out.println("\n📝 No hay clientes en espera.");
            return;
        }
        System.out.println("\n📝 Clientes en espera:");
        for (int i = 0; i < clientesEnEspera.size(); i++) {
            System.out.println((i + 1) + ". " + clientesEnEspera.get(i));
        }
    }
    public void iniciarProcesoCobro() {
        if (clientesEnEspera.isEmpty()) {
            System.out.println("\n⚠️ No hay clientes para procesar.");
            return;
        }
        System.out.println("\n🏁 Iniciando proceso de cobro...");
        List<Cliente> clientesAProcesar = new ArrayList<>(clientesEnEspera);
        clientesEnEspera.clear();
        for (Cliente cliente : clientesAProcesar) {
            executorService.execute(cliente);
        }
    }
    public void cerrar() {
        executorService.shutdown();
    }
}