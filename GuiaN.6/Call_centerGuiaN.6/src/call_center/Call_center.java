
package call_center;


import java.util.*;

// Telefono
class Telefono {
    private final String numero;

    public Telefono(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
}

// Persona
class Persona {
    private final String nombre;
    private final List<Llamada> llamadas;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.llamadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarLlamada(Llamada llamada) {
        llamadas.add(llamada);
    }
}

// Llamada
class Llamada {
    private final Persona persona;
    private final Telefono telefono;
    private final int duracion; // en segundos

    public Llamada(Persona persona, Telefono telefono, int duracion) {
        this.persona = persona;
        this.telefono = telefono;
        this.duracion = duracion;
    }

    public void realizarLlamada() {
        System.out.println(persona.getNombre() + " esta llamando al " + telefono.getNumero());
        try {
            Thread.sleep(duracion * 2000);
        } catch (InterruptedException e) {
            System.out.println("Llamada interrumpida");
        }
        System.out.println("Llamada finalizada de " + persona.getNombre());
    }
}

// Runnable que simula la llamada
class LlamadaRunnable implements Runnable {
    private final Llamada llamada;

    public LlamadaRunnable(Llamada llamada) {
        this.llamada = llamada;
    }

    @Override
    public void run() {
        llamada.realizarLlamada();
    }
}

// Main para simular el call center
public class Call_center {
    public static void main(String[] args) {
        Persona p1 = new Persona("Ana");
        Persona p2 = new Persona("Luis");

        Telefono t1 = new Telefono("123-4567");
        Telefono t2 = new Telefono("987-6543");

        Llamada l1 = new Llamada(p1, t1, 3);
        Llamada l2 = new Llamada(p2, t2, 4);

        p1.agregarLlamada(l1);
        p2.agregarLlamada(l2);

        Thread hilo1 = new Thread(new LlamadaRunnable(l1));
        Thread hilo2 = new Thread(new LlamadaRunnable(l2));

        hilo1.start();
        hilo2.start();
    }
}
