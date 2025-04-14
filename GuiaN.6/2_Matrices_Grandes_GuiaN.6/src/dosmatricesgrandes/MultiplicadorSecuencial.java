package dosmatricesgrandes;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo
 */
public class MultiplicadorSecuencial {
    public static int[][] multiplicar(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int columnasB = matrizB[0].length; 
        int[][] resultado = new int[filasA][columnasB];
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                int suma = 0;
                for (int k = 0; k < columnasA; k++) {
                    suma += matrizA[i][k] * matrizB[k][j];
                }
                resultado[i][j] = suma;
            }
        }
        return resultado;
    }
}