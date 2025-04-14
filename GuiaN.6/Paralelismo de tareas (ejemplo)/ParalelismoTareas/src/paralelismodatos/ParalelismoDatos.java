
package paralelismodatos;

public class ParalelismoDatos {
     public static void main(String[] args) {
        System.out.println("Inicio en hilo: " + Thread.currentThread().getName());

        // Tarea 1: Cargar archivos
        Thread cargarArchivos = new Thread(() -> {
            System.out.println("Cargando archivos... (Hilo: " + Thread.currentThread().getName() + ")");
            dormir();
            System.out.println("Archivos cargados.");
        });

        // Tarea 2: Procesar datos
        Thread procesarDatos = new Thread(() -> {
            System.out.println("Procesando datos... (Hilo: " + Thread.currentThread().getName() + ")");
            dormir();
            System.out.println("Datos procesados.");
        });

        // Tarea 3: Guardar resultados
        Thread guardarResultados = new Thread(() -> {
            System.out.println("Guardando resultados... (Hilo: " + Thread.currentThread().getName() + ")");
            dormir();
            System.out.println("Resultados guardados.");
        });

        // Iniciar todas las tareas en paralelo
        cargarArchivos.start();
        procesarDatos.start();
        guardarResultados.start();

        // Esperar que todas las tareas terminen
        try {
            cargarArchivos.join();
            procesarDatos.join();
            guardarResultados.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todas las tareas finalizadas (Hilo: " + Thread.currentThread().getName() + ")");
    }

    private static void dormir() {
        try {
            Thread.sleep(1000); // Simula tiempo de ejecución (1 segundo)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
