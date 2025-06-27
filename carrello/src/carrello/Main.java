package carrello;

public class Main {
    public static void main(String[] args) {
        Carrello c = new Carrello();

        // Aggiunte con metodi overload
        c.aggiungiProdotto("Pane");
        c.aggiungiProdotto("Latte", 2);
        c.aggiungiProdotto("Pasta", "Penne rigate", 3);

        // Mostra il contenuto
        c.mostraCarrello();
    }
}