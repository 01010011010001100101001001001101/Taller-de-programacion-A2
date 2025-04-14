package productorconsumidor;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo
 */
public class BufferCompartido {
    private Integer numero = null;
    private boolean disponible = false;
    public synchronized void producir(int valor) throws InterruptedException {
        while (disponible) {
            wait();
        }
        numero = valor;
        disponible = true;
        notify();
    }
    public synchronized int consumir() throws InterruptedException {
        while (!disponible) {
            wait();
        }
        int valor = numero;
        disponible = false;
        notify();
        return valor;
    }
}
