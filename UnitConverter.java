import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        // TODO: Uno studente implementa la logica di interazione con l'utente
     
        int scelta = 2;
        int valore = 0;
        double risultato = 0;   
        

         System.out.println("Inserisci la funzione desiderata: \n" +
                "1. Converti Km in Migliaia\n" +
                "2. Converti Celsius in Farenheit\n" +
                "3. Converti Kg in Libbre\n" +
                "4. Converti Litri in Galloni\n" +
                "5. Converti Euro in Dollari");
        try {
            scelta=scanner.nextInt();
        } catch (Exception e) {
            System.err.println("Errore nell'inserimento del valore");
            throw new RuntimeException(e);

        }
        switch (scelta) {
            case 1:
                risultato = convertiKmInMiglia(valore);
                break;
            case 2:
                risultato = convertiCelsiusInFahrenheit(valore);
                break;
            case 3:
                risultato = convertiKgInLibbre(valore);
                break;
            case 4:
                risultato = convertiLitriInGalloni(valore);
                break;
            case 5:
                risultato = convertiEuroInDollari(valore);
                break;
            default:
                System.out.println("Scelta non valida!");
                break;
        }

        System.out.println("Risultato della conversione: " + risultato);
        
        scanner.close();
    }

    // TODO: Ogni studente implementa una di queste funzioni nei propri branch
    public static double convertiKmInMiglia(double km) {
        return 0; // Da implementare
    }

    public static double convertiCelsiusInFahrenheit(double celsius) {
        return 0; // Da implementare
    }

    public static double convertiKgInLibbre(double kg) {
        return 0; // Da implementare
    }

    public static double convertiLitriInGalloni(double litri) {
        return 0; // Da implementare
    }

    public static double convertiEuroInDollari(double euro) {
        return 0; // Da implementare
    }
}
