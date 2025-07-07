package eserciziojframe;



public class Professore extends Persona {
    private String dipartimento;
    private String codiceFiscale;

    public Professore(String nome, String cognome, String dipartimento, String codiceFiscale) {
        super(nome, cognome);
        this.dipartimento = dipartimento;
        this.codiceFiscale = codiceFiscale;
    }

    public String toString() {
        return "Professore:\nNome: " + nome + "\nCognome: " + cognome + "\nDipartimento: " + dipartimento + "\nCodice Fiscale: " + codiceFiscale;
    }
}
