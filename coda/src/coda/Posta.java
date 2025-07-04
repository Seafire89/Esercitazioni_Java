package coda;

import java.util.LinkedList;
import java.util.Queue;

public class Posta {
    private Queue<Persona> coda;

    public Posta() {
        coda = new LinkedList<>();
    }

    public void entraInCoda(Persona p) {
        coda.add(p);
        System.out.println(p.getNome() + " è entrato in coda.");
    }

    public String chiEIlProssimo() {
        Persona prossimo = coda.peek();
        return (prossimo != null) ? prossimo.getNome() : "Nessuno in coda";
    }

    public String servireProssimo() {
        Persona servito = coda.poll();
        return (servito != null) ? servito.getNome() + " è stato servito." : "Nessuno da servire.";
    }

    public void mostraCoda() {
        if (coda.isEmpty()) {
            System.out.println("La coda è vuota.");
        } else {
            System.out.println("Persone in coda:");
            for (Persona p : coda) {
                System.out.println("- " + p.getNome());
            }
        }
    }
}

