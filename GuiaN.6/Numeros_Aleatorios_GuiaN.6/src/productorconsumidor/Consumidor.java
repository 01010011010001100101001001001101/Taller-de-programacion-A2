package productorconsumidor;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo
 */
public class Consumidor implements Runnable {
    private final BufferCompartido buffer;
    private volatile boolean ejecutando = true;
    public Consumidor(BufferCompartido buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        while (ejecutando) {
            try {
                int numero = buffer.consumir();
                int resultado = numero * 2;
                System.out.println("[" + Thread.currentThread().getName() + "] Leyó número: " + numero + " → Resultado: " + resultado);
                HistorialResultados.agregarResultado(numero, resultado);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
    public void detener() {
        ejecutando = false;
    }
}
