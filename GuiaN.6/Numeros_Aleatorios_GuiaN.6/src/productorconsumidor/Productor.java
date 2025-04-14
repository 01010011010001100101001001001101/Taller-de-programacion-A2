package productorconsumidor;
import java.util.Random;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo
 */
public class Productor implements Runnable {
    private final BufferCompartido buffer;
    private volatile boolean ejecutando = true;
    public Productor(BufferCompartido buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        Random random = new Random();
        while (ejecutando) {
            try {
                int numero = random.nextInt(100) + 1;
                buffer.producir(numero);
                System.out.println("[" + Thread.currentThread().getName() + "] Generó número: " + numero);
                Thread.sleep(1000);
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
