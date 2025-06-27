package carrello;


import java.util.ArrayList;

public class Carrello {

    private ArrayList<String> prodotti;

    public Carrello() {
        prodotti = new ArrayList<>();
    }

    // 1. Aggiungi solo nome
    public void aggiungiProdotto(String nome) {
        prodotti.add("Prodotto: " + nome);
    }

    // 2. Aggiungi nome e quantità
    public void aggiungiProdotto(String nome, int quantita) {
        prodotti.add("Prodotto: " + nome + " - Quantità: " + quantita);
    }

    // 3. Aggiungi nome, descrizione e quantità
    public void aggiungiProdotto(String nome, String descrizione, int quantita) {
        prodotti.add("Prodotto: " + nome + " - Descrizione: " + descrizione + " - Quantità: " + quantita);
    }

    // 4. Mostra contenuto del carrello
    public void mostraCarrello() {
        System.out.println("=== Contenuto del Carrello ===");
        for (String prodotto : prodotti) {
            System.out.println(prodotto);
        }
    }
}