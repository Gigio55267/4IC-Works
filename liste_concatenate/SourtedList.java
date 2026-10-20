
public class SourtedList<T extends Comparable<T>> extends Lista<T> {

    private boolean isSorted;

    public SourtedList() {
        super();
        this.isSorted = true;
    }

    public void insert(T dato) {
        if (!this.isSorted) {
            throw new RuntimeException("La lista non è ordinata");
        };
        int l = this.lenght();
        if (this.testa == null) {
            this.testa = new Nodo(dato);
            return;
        }
        Nodo scan = this.testa;
        Nodo swap = null;
        while (true) {
            if (scan == null || dato.compareTo(scan.getDato()) < 0) {
                break;
            }
            swap = scan;
            scan = scan.getsuccessivo();
        }
        Nodo n = new Nodo(dato, scan);
        if (scan != testa) {
            swap.setSuccessivo(n);
        } else {
            this.testa = n;
        }
    }

    public void swap(int i1, int i2) {
        Nodo scan= this.testa;
        
        
        for (int i = 0; i <= i1; i++) {
            scan=scan.getsuccessivo();
        }
        scan.setDato(this.extract(i2));
        for (int i = 0; i <= i2; i++) {
            scan=scan.getsuccessivo();
        }
        scan.setDato(this.extract(i1));
        //Nodo scan = this.testa;
        //Nodo scan1 = this.testa;
        //Nodo n1 = null;
        //Nodo n2 = null;
        //int l = this.lenght();
        //for (int i = 0; i < i1; i++) {
        //    scan = scan.getsuccessivo();
        //}
        //for (int i = 0; i < i2; i++) {
        //    scan1=scan1.getsuccessivo();
        //}
        //n1 =scan;
        //n2 =scan1;
        //n1.setSuccessivo(scan1.getsuccessivo());
        //n2.setSuccessivo(scan.getsuccessivo());
        //n1.getsuccessivo().setSuccessivo(scan.getsuccessivo());
        //n2.getsuccessivo().setSuccessivo(scan1.getsuccessivo());
    }

    public void sort() {
        Nodo scan = this.testa;
        int scambiati=0;
        int daScambiare=0;
        int l = this.lenght();
        for (int i = 0; i < l; i++) {
            for (int i1 = 0; i1 < l; i1++) {
            if (scan.getDato().compareTo(scan.getsuccessivo().getDato())<0 ) {
                daScambiare=i1;
                System.out.println("ciao");
                scan=scan.getsuccessivo();
            }
        }
        System.out.println(scambiati+" "+daScambiare);
        swap(scambiati, daScambiare);
        scambiati++;
        }
        

    }

    public static void main(String[] args) {
        SourtedList<Integer> d = new SourtedList<>();
        d.insert(3,0);
        d.insert(1,1);
        d.insert(5,2);
        d.insert(2,3);
        d.sort();
        // d.insert("dd", 2);
        System.out.println(d.extract(1));
        d.stampaLista();
    }
}
