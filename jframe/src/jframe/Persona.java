package jframe;

public class Persona {
    private String nome;
    private String cognome;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String toString() {
        return "Nome: " + nome + "\nCognome: " + cognome;
    }
}
