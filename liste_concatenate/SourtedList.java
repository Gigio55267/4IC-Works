
public class SourtedList<T extends Comparable<T>> extends Lista<T> {

    @Override
    public void insert(T dato, int i) {
        int l = this.lenght();
        if (i < 0 || i > l) {
            throw new IndexOutOfBoundsException();
        }
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
        if (scan!= testa ) swap.setSuccessivo(n);
        else this.testa = n;

    }

    public static void main(String[] args) {
        SourtedList<String> d = new SourtedList<>();
        d.insert("aa", 0);
        d.insert("cc", 0);
        d.insert("bb", 0);
        System.out.println(d.extract(1));
        d.stampaLista();
    }
}
