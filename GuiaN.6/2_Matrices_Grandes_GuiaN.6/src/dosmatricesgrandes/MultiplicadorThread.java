package dosmatricesgrandes;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo
 */
public class MultiplicadorThread implements Runnable {
    private final int[][] matrizA;
    private final int[][] matrizB;
    private final int[][] resultado;
    private final int inicioFila;
    private final int finFila;
    public MultiplicadorThread(int[][] matrizA, int[][] matrizB, int[][] resultado,
                             int inicioFila, int finFila) {
        this.matrizA = matrizA;
        this.matrizB = matrizB;
        this.resultado = resultado;
        this.inicioFila = inicioFila;
        this.finFila = finFila;
    }
    @Override
    public void run() {
        for (int i = inicioFila; i < finFila; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                int suma = 0;
                for (int k = 0; k < matrizB.length; k++) {
                    suma += matrizA[i][k] * matrizB[k][j];
                }
                resultado[i][j] = suma;
            }
        }
    }
}