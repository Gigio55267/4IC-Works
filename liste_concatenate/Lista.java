
public class Lista<T> {

    public Nodo getTesta() {
        return testa;
    }

    //stracture wrapping 
    protected class Nodo {

        private T dato;
        private Nodo successivo;

        //costuttore per ultimo valore della lista 
        public Nodo(T dato) {
            this.dato = dato;
            this.successivo = null;
        }

        //costruttore per lista con dato successivo 
        public Nodo(T dato, Nodo successivo) {
            this.dato = dato;
            this.successivo = successivo;
        }

        public T getDato() {
            return this.dato;
        }

        public Nodo getsuccessivo() {
            return this.successivo;
        }

        public void setSuccessivo(Nodo successivo) {
            this.successivo = successivo;
        }
    }

    // struttura fonadamentale per creare la lista non che primo elemento F
    protected Nodo testa;

    public Lista() {
        this.testa = null;
    }

    public int lenght() {
        int l = 0;
        Nodo scan = this.testa;
        while (scan != null) {
            l++;
            scan = scan.getsuccessivo();
        }
        return l;
    }

    public T extract(int i) {
        if (i < 0 || i >= this.lenght()) {
            throw new IndexOutOfBoundsException();
        }
        Nodo ext = this.testa;
        for (int j = 0; j < i; j++) {
            ext = ext.getsuccessivo();
        }
        return ext.getDato();
    }

    public void insert(T dato, int i) {
        if (i < 0 || i > this.lenght()) {
            throw new IndexOutOfBoundsException();
        }
        if (this.testa == null) {
            this.testa = new Nodo(dato);
        } else if (i == 0) {
            Nodo n = new Nodo(dato, this.testa);
            this.testa = n;
        } else {
            Nodo scan = this.testa;
            for (int j = 0; j < i - 1; j++) {
                scan = scan.getsuccessivo();
            }
            Nodo n = new Nodo(dato, scan.getsuccessivo());
            scan.setSuccessivo(n);
        }
    }

    public void add(T dato) {
        this.insert(dato, this.lenght());
    }

    public void remuve(int index) {
        if (index < 0 || index > this.lenght()) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            this.testa = this.testa.getsuccessivo();
        } else {
            Nodo scan = this.testa;
            for (int i = 0; i < index - 1; i++) {
                scan = scan.getsuccessivo();
            }
            scan.setSuccessivo(scan.getsuccessivo().getsuccessivo());
        }
    }

    public void stampaLista() {
        Nodo scan = this.testa;
        for (int i = 0; i < this.lenght(); i++) {
            System.out.print(scan.getDato()+" | ");
            scan=scan.getsuccessivo();
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Lista<Integer> ints = new Lista<>();
        ints.add(5);
        ints.add(230);
        ints.add(4);
        ints.insert(100, 0);
        ints.remuve(3);
        System.out.println(ints.extract(2));
    }
}
