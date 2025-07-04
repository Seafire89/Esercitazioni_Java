package esercizioclassioggetti; //PIETRO BARBAGALLO

public class Studente {
    private String nome;
    private String cognome;
    private int annoNascita;


    public Studente(String nome, String cognome, int annoNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.annoNascita = annoNascita;
    }

    // Stampa scheda con public void
    public void stampaScheda() {
        System.out.println(nome + " " + cognome + ", nato nel " + annoNascita);
    }
}
