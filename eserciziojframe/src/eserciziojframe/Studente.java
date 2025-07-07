package eserciziojframe;


public class Studente extends Persona {
    private int annoNascita;
    private String matricola;

    public Studente(String nome, String cognome, int annoNascita, String matricola) {
        super(nome, cognome);
        this.annoNascita = annoNascita;
        this.matricola = matricola;
    }

    public String toString() {
        return "Studente:\nNome: " + nome + "\nCognome: " + cognome + "\nAnno di nascita: " + annoNascita + "\nMatricola: " + matricola;
    }
}
