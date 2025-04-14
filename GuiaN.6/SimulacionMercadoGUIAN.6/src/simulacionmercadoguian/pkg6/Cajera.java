package simulacionmercadoguian.pkg6;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo
 */
public class Cajera {
    private final String nombre;
    public Cajera(String nombre) {
        this.nombre = nombre;
    }
    public void procesarCompra(Cliente cliente) {
        System.out.println("\n🧍 " + nombre + " atendiendo cliente: " + cliente.getNombre());
        long tiempoInicial = System.currentTimeMillis();
        for (int i = 0; i < cliente.getProductos().size(); i++) {
            Producto producto = cliente.getProductos().get(i);
            esperarXsegundos(0.5); // Simular escaneo del producto
            System.out.println("🛒 Producto " + (i + 1) + ": " + producto);
        }
        double total = cliente.getTotal();
        double tiempoFinal = (System.currentTimeMillis() - tiempoInicial) / 1000.0;
        System.out.println("💰 Total a pagar: $" + String.format("%,.0f", total) + " COP");
        System.out.println("🕒 Tiempo de atención: " + String.format("%.1f", tiempoFinal) + " segundos");
        System.out.println("✅ " + nombre + " finalizó la compra de " + cliente.getNombre());
    }
    private void esperarXsegundos(double segundos) {
        try {
            Thread.sleep((long)(segundos * 1000));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}