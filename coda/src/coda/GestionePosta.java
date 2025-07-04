package coda;

public class GestionePosta {
    public static void main(String[] args) {
        Posta ufficioPostale = new Posta();

        // Aggiungi persone
        Persona p1 = new Persona("Luca");
        Persona p2 = new Persona("Giulia");
        Persona p3 = new Persona("Marco");

        ufficioPostale.entraInCoda(p1);
        ufficioPostale.entraInCoda(p2);
        ufficioPostale.entraInCoda(p3);

        System.out.println();

        // Mostra la coda
        ufficioPostale.mostraCoda();

        System.out.println("\nProssimo da servire: " + ufficioPostale.chiEIlProssimo());

        // Servi due persone
        System.out.println("\n" + ufficioPostale.servireProssimo());
        System.out.println(ufficioPostale.servireProssimo());

        System.out.println();

        // Mostra la coda rimanente
        ufficioPostale.mostraCoda();
    }
}
