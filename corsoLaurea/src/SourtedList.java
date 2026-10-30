
public class SourtedList<T extends Comparable<T>> extends Lista<T> {

    private boolean isSorted;

    public SourtedList() {
        super();
        this.isSorted = true;
    }
    @Override 
    public void insert(T element, int i) {
        this.isSorted = false;
        super.insert(element, i);
    }

    public void sortedinsert(T dato) {
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

    public void swap(int pos1, int pos2) {
        Nodo temp1 = null, temp2 = null, temp3 = this.testa;
        for (int i = 0; i < pos2; i++) {
            temp1 = temp2;
            temp2 = temp3;
            temp3 = temp3.getsuccessivo();
        }
        if (temp1 == null) {
            temp2.setSuccessivo(temp3.getsuccessivo());
            temp3.setSuccessivo(temp2);
            testa = temp3;
        } else {
            temp1.setSuccessivo(temp3);
            temp2.setSuccessivo(temp3.getsuccessivo());
            temp3.setSuccessivo(temp2);
        }
    }
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

    public void sort() {
        if (this.isSorted) {
            return;
        }
        int length = lenght();
        boolean swapped;
        int count = 0;

        do {
            swapped = false;
            for (int i = 0; i < length - count - 1; i++) {
                if (extract(i).compareTo(extract(i + 1)) > 0) {
                    swap(i, i + 1);
                    swapped = true;
                }
            }
            count++;
        } while (swapped);
        isSorted = true;
    }

    public static void main(String[] args) {
        SourtedList<Integer> d = new SourtedList<>();
        d.insert(3, 0);
        d.insert(1, 1);
        d.insert(5, 2);
        d.insert(2, 3);
        d.sort();
        // d.insert("dd", 2);
        System.out.println(d.extract(1));
        d.stampaLista();
    }

}
