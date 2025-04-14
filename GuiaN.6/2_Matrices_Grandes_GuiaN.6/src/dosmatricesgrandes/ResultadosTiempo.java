package dosmatricesgrandes;
/**
 *
 * @author Thomas Sanmiguel y Sebastian Revelo
 */
public class ResultadosTiempo {
    private static long tiempoSecuencial = -1;
    private static long tiempoParalelo = -1; 
    public static void guardarTiempoSecuencial(long tiempo) {
        tiempoSecuencial = tiempo;
    }  
    public static void guardarTiempoParalelo(long tiempo) {
        tiempoParalelo = tiempo;
    }  
    public static void mostrarTiempos() {
        System.out.println("\n📊 Tiempos de ejecución:");
        if (tiempoSecuencial != -1) {
            System.out.println("Secuencial: " + tiempoSecuencial + " ms");
        } else {
            System.out.println("Secuencial: No ejecutado aún");
        }
        if (tiempoParalelo != -1) {
            System.out.println("Paralela (4 hilos): " + tiempoParalelo + " ms");
        } else {
            System.out.println("Paralela: No ejecutada aún");
        }
    }
}