package dosmatricesgrandes;
import java.util.Scanner;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo
 */
public class Main {
    private static int filas;
    private static int columnas;
    private static int[][] matrizA;
    private static int[][] matrizB;
    private static int[][] resultadoSecuencial;
    private static int[][] resultadoParalelo;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        solicitarDimensionesMatrices();
        inicializarMatrices();
        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> ejecutarMultiplicacionSecuencial();
                case 2 -> ejecutarMultiplicacionParalela();
                case 3 -> ResultadosTiempo.mostrarTiempos();
                case 4 -> {
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        }
    }
    private static void solicitarDimensionesMatrices() {
        System.out.println("=== Configuración de las matrices ===");
        System.out.print("Ingrese el número de filas para las matrices: ");
        filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas para las matrices: ");
        columnas = scanner.nextInt();
        System.out.println("Las matrices serán de " + filas + "x" + columnas);
    }  
    private static void mostrarMenu() {
        System.out.println("\n========== MENÚ PRINCIPAL ==========");
        System.out.println("1. Ejecutar multiplicación secuencial");
        System.out.println("2. Ejecutar multiplicación paralela con 4 hilos");
        System.out.println("3. Mostrar tiempos de ejecución");
        System.out.println("4. Salir");
        System.out.println("=====================================");
        System.out.print("\nSeleccione una opción: ");
    }
    private static void inicializarMatrices() {
        System.out.println("\nGenerando matrices aleatorias de " + filas + "x" + columnas + "...");
        matrizA = MatrizUtil.generarMatrizAleatoria(filas, columnas);
        matrizB = MatrizUtil.generarMatrizAleatoria(filas, columnas);
        System.out.println("Matrices generadas exitosamente.");
        MatrizUtil.imprimirMatriz(matrizA, "A");
        MatrizUtil.imprimirMatriz(matrizB, "B");
    }
    private static void ejecutarMultiplicacionSecuencial() {
        System.out.println("\nIniciando multiplicación secuencial...");
        long inicio = System.currentTimeMillis();
        resultadoSecuencial = MultiplicadorSecuencial.multiplicar(matrizA, matrizB); 
        long fin = System.currentTimeMillis();
        long tiempo = fin - inicio;
        ResultadosTiempo.guardarTiempoSecuencial(tiempo);
        System.out.println("✅ Multiplicación secuencial completada.");
        System.out.println("Tiempo tomado: " + tiempo + " ms");
        MatrizUtil.imprimirMatriz(resultadoSecuencial, "Resultado Secuencial");
    }
    private static void ejecutarMultiplicacionParalela() {
        System.out.println("\nIniciando multiplicación paralela con 4 hilos...");
        long inicio = System.currentTimeMillis();
        try {
            resultadoParalelo = MultiplicadorParalelo.multiplicar(matrizA, matrizB);
            long fin = System.currentTimeMillis();
            long tiempo = fin - inicio;
            ResultadosTiempo.guardarTiempoParalelo(tiempo);
            System.out.println("✅ Multiplicación paralela completada.");
            System.out.println("Tiempo tomado: " + tiempo + " ms");
            MatrizUtil.imprimirMatriz(resultadoParalelo, "Resultado Paralelo");
            // Verificar que ambos resultados son iguales
            if (resultadoSecuencial != null && 
                MatrizUtil.compararMatrices(resultadoSecuencial, resultadoParalelo)) {
                System.out.println("✅ Verificación: Los resultados secuencial y paralelo son idénticos.");
            }
        } catch (InterruptedException e) {
            System.out.println("❌ Error en la multiplicación paralela: " + e.getMessage());
        }
    }
}