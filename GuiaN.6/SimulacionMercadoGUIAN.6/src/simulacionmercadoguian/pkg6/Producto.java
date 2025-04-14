package simulacionmercadoguian.pkg6;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo
 */
public class Producto {
    private String nombre;
    private double precio;
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    @Override
    public String toString() {
        return String.format("%s - $%,.0f COP", nombre, precio);
    }
}