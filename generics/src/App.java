import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Passioni[] arr=new Passioni[5];
        Cinematografico p =new Cinematografico(2020, "nomereg", "piero","paola", "titolo");
        Musicale m = new Musicale("nOMEARTISTA", 0, "");
        Letterario l= new Letterario("hitler", 1938, "1938/45", "the fascism");
        Passioni pas = new Passioni<>();
        pas.inserisciNuovoElemento(p, 3,arr);
        System.out.println(Arrays.toString(arr));
        pas.rimuoviElemento(3, arr);
        System.out.println(Arrays.toString(arr));
    }
}