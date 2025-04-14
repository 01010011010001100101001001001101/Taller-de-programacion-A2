package dosmatricesgrandes;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo
 */
public class MultiplicadorParalelo {
    private static final int NUM_HILOS = 4;
    public static int[][] multiplicar(int[][] matrizA, int[][] matrizB) throws InterruptedException {
        int filasA = matrizA.length;
        int columnasB = matrizB[0].length;
        int[][] resultado = new int[filasA][columnasB];
        Thread[] hilos = new Thread[NUM_HILOS];
        int filasPerThread = filasA / NUM_HILOS;
        for (int i = 0; i < NUM_HILOS; i++) {
            int inicioFila = i * filasPerThread;
            int finFila = (i == NUM_HILOS - 1) ? filasA : (i + 1) * filasPerThread;
            MultiplicadorThread multiplicador = new MultiplicadorThread(
                matrizA, matrizB, resultado, inicioFila, finFila
            );
            hilos[i] = new Thread(multiplicador);
            hilos[i].start();
        }
        // Esperar a que todos los hilos terminen
        for (Thread hilo : hilos) {
            hilo.join();
        }
        return resultado;
    }
}