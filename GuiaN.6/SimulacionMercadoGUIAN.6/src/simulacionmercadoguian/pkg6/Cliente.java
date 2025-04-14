package simulacionmercadoguian.pkg6;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo
 */
public class Cliente implements Runnable {
    private String nombre;
    private List<Producto> productos;
    private Cajera cajera;
    public Cliente(String nombre, Cajera cajera) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
        this.cajera = cajera;
    }
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public String getNombre() {
        return nombre;
    }
    public List<Producto> getProductos() {
        return productos;
    }
    public double getTotal() {
        return productos.stream()
                .mapToDouble(Producto::getPrecio)
                .sum();
    }
    @Override
    public void run() {
        cajera.procesarCompra(this);
    }
    @Override
    public String toString() {
        return String.format("Cliente: %s - %d productos - Total: $%,.0f COP", 
            nombre, productos.size(), getTotal());
    }
}