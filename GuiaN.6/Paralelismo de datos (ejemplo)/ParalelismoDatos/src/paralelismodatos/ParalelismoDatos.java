
package paralelismodatos;

public class ParalelismoDatos {
    public static void main(String[] args) {
        System.out.println("Inicio en hilo: " + Thread.currentThread().getName());

        // Tarea 1: Cuadrados del 1 al 5
        Thread hilo1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                int cuadrado = i * i;
                System.out.println("Hilo 1 -> " + i + "^2 = " + cuadrado + " (Hilo: " + Thread.currentThread().getName() + ")");
                dormir();
            }
        });

        // Tarea 2: Cuadrados del 6 al 10
        Thread hilo2 = new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                int cuadrado = i * i;
                System.out.println("Hilo 2 -> " + i + "^2 = " + cuadrado + " (Hilo: " + Thread.currentThread().getName() + ")");
                dormir();
            }
        });

        // Iniciar hilos
        hilo1.start();
        hilo2.start();

        // Esperar que ambos hilos terminen antes de seguir
        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fin del programa en hilo: " + Thread.currentThread().getName());
    }

    // Método para simular que cada operación tarda un poco
    private static void dormir() {
        try {
            Thread.sleep(500); // medio segundo
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}