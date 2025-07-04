package esercizioclassioggetti;  //PIETRO BARBAGALLO

public class Main {
    public static void main(String[] args) {
        // Creazione degli oggetti Studente
        Studente studente1 = new Studente("Mario", "Rossi", 2004);
        Studente studente2 = new Studente("Luca", "Bianchi", 2005);

        // Chiamata al metodo stampaScheda()
        studente1.stampaScheda();
        studente2.stampaScheda();
    }
}
