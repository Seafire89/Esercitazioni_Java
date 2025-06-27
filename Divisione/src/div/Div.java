package div;
import java.util.Scanner;

public class Div {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numeratore: ");
        int numeratore = scanner.nextInt();

        int denominatore = 0;
        boolean inputValido = false;

        // Continua a chiedere finché l'utente non inserisce un denominatore diverso da zero
        while (!inputValido) {
            System.out.print("Inserisci il denominatore: ");
            denominatore = scanner.nextInt();

            try {
                int risultato = numeratore / denominatore;
                System.out.println("Risultato: " + risultato);
                inputValido = true; // divisione riuscita, si può uscire dal ciclo
            } catch (ArithmeticException e) {
                System.out.println("Errore: inserisci un valore diverso da zero per il denominatore.");
            }
        }finally {
             
        scanner.close();
    }
}
