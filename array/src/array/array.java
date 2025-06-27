package array;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // 1. Creiamo l'array con 5 nomi
        String[] nomi = {"Luca", "Maria", "Giulia", "Marco", "Elena"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero da 0 a 4 per stampare il nome corrispondente:");
        
        while (true) {
        	
        try {
            int indice = scanner.nextInt(); // 2. Chiediamo all'utente il numero
            String nome = nomi[indice];     // 3. Tentiamo di accedere all'indice
            System.out.println("Nome trovato: " + nome);
        } catch (ArrayIndexOutOfBoundsException e) {
            // 4. Se l'indice non è valido, gestiamo l'errore
            System.out.println("Errore: inserisci un numero tra 0 e 4.");
        } catch (Exception e) {
            // Per qualsiasi altro errore (es. l'utente scrive lettere)
            System.out.println("Errore: input non valido. Inserisci solo numeri.");
            scanner.nextLine();
        } 
         
         
        }

        scanner.close(); // chiudiamo lo scanner una sola volta, alla fine
    }
}

