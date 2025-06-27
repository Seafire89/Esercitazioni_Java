package calcolatrice;

public class Main {
    public static void main(String[] args) {
        Calcolatrice calc = new Calcolatrice();

        // Somma di 2 interi
        System.out.println("Somma 2 interi: " + calc.somma(5, 3));

        // Somma di 3 interi
        System.out.println("Somma 3 interi: " + calc.somma(1, 2, 3));

        // Somma di 2 double
        System.out.println("Somma 2 double: " + calc.somma(2.5, 4.3));

        // Somma di 2 stringhe
        System.out.println("Concatenazione stringhe: " + calc.somma("uno", "due"));
    }
}