import java.util.Arrays;

public class DemoRischio {
    public static void main(String[] args) {
        Verificabile inventario[] = {
            new ContoBancario("IT1234", -500.0),
            new ImmagineDigitale("foto_Vacanze.jpg", 12.5),
            new PaccoSpedizione("TRK-9982", 12.0)
        };
        
        System.out.println("--- VISUALIZZAZIONE SINGOLI RISCHI ---");
        for (Verificabile v: inventario) {
            System.out.println(v.getTipo() + ": " + v.getValoreRischio());
        }
        
        System.out.println("\n--- CALCOLO RISCHIO TOTALE ---");
        double totale = GestioneRischio.calcolaRischioTotale(inventario, 0);
        System.out.println("Rischio totale: " + totale);
        
        System.out.println("\n--- RIDUZIONE DI TUTTI I RISCHI ---");
        GestioneRischio.ottimizzaTutti(inventario, 0);
        System.out.println("Nuovi rischi rivalutati: ");
        for (Verificabile v: inventario) {
            System.out.println(v.getTipo() + " -> " + v.getValoreRischio());
        }
        
        System.out.println("\n--- CALCOLO RISCHIO TOTALE RIVALUTATO ---");
        totale = GestioneRischio.calcolaRischioTotale(inventario, 0);
        System.out.println("Rischio totale: " + totale);
        
        System.out.println("\n--- VALUTAZIONE IMMAGINE ---");
        GestioneRischio.ispeziona(inventario[1]);

        System.out.println("\n--- TENTATIVO SPEDIZIONE PACCHI ---");
        PaccoSpedizione pacco1 = new PaccoSpedizione("TRK-9982", 12.0);
        System.out.println(Arrays.toString(pacco1.getSpedizionePacchi()));
    }
}
