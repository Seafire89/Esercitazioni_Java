package esercizioereditarietaoverride;  //PIETRO BARBAGALLO

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Anna", "Verdi");
        Studente s1 = new Studente("Luca", "Bianchi", "S12345");
        Professore prof1 = new Professore("Marco", "Neri", "Matematica");

        // Array di tipo Persona
        Persona[] persone = {p1, s1, prof1};

        // Scorriamo l’array e chiamiamo presentati()
        for (Persona persona : persone) {
            persona.presentati();
        }
    }
}
