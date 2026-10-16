
public class SourtedList<T extends Comparable<T>> extends Lista<T> {

    public void insert(T dato) {
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
        }else {
            this.testa = n;
        }
    }

    public static void main(String[] args) {
        SourtedList<String> d = new SourtedList<>();
        d.insert("aa");
        d.insert("cc");
        d.insert("bb");
        d.insert("dd", 2);
        System.out.println(d.extract(1));
        d.stampaLista();
    }
}
