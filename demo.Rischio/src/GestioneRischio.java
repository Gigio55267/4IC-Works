public class GestioneRischio {
    public static double calcolaRischioTotale(Verificabile elementi[], int index) {
        double rischio;
        if (elementi.length-1<index) {
            rischio=0;
        }
        else{
            rischio=elementi[index].getValoreRischio() + calcolaRischioTotale(elementi, index+1);
        }
        return rischio;  // Questo è un valore Jolly. Questo return va completamente rivisto.
    }
    
    // Implementare con algoritmo RICORSIVO. Non modificare la firma
    public static void ottimizzaTutti(Verificabile elementi[], int index) {
        if (elementi.length-1<index) {
            return;
        }
        else{
            elementi[index+1].riduci();
        }
    }
    
    // NON MODIFICARE!!
    public static void ispeziona(Verificabile elemento) {
        System.out.println("GENERICO ELEMENTO CON RISCHIO ASSOCIATO: " + elemento.getValoreRischio());
    }
    
    // NON MODIFICARE!!
    public static void ispeziona(ImmagineDigitale img) {
        System.out.println("IMMAGINE DIGITALE CON RISCHIO: " + img.getValoreRischio());
    }
}
