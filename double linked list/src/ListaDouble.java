
import java.util.Iterator;

public class ListaDouble<T> implements Iterable<T> {

    private int lenght = 0;

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public Nodo getTesta() {
        return testa;
    }

    public Nodo getCoda() {
        return coda;
    }

    protected class Nodo {

        private T dato;
        private Nodo successivo;
        private Nodo precedente;

        //costuttore per ultimo valore della lista 
        public Nodo(T dato, Nodo precedente) {
            this.dato = dato;
            this.successivo = null;
            this.precedente = precedente;
        }

        //costruttore per il primo valore della lista
        public Nodo(T dato) {
            this.dato = dato;
            this.successivo = null;
            this.precedente = null;
        }

        //costruttore per lista con dato successivo 
        public Nodo(T dato, Nodo successivo, Nodo precedente) {
            this.dato = dato;
            this.successivo = successivo;
            this.precedente = precedente;
        }

        public T getDato() {
            return this.dato;
        }

        public void setDato(T dato) {
            this.dato = dato;
        }

        public Nodo getsuccessivo() {
            return this.successivo;
        }

        public void setSuccessivo(Nodo successivo) {
            this.successivo = successivo;
        }

        public Nodo getprecedente() {
            return this.precedente;
        }

        public void setprecedente(Nodo precedente) {
            this.precedente = precedente;
        }

    }
    protected Nodo testa;
    protected Nodo coda;

    public ListaDouble() {
        this.testa = null;
        this.coda = null;
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
        if (i < 0 || i >= this.getLenght()) {
            throw new IndexOutOfBoundsException();
        }
        if (i < this.getLenght() / 2) {
            Nodo ext = this.testa;
            for (int j = 0; j < i; j++) {
                ext = ext.getsuccessivo();
            }
            return ext.getDato();
        } else {
            Nodo ext = this.coda;
            for (int j = 0; j < this.getLenght() - i - 1; j++) {
                ext = ext.getprecedente();
            }
            return ext.getDato();
        }
    }

    public void insert(T dato, int i) {

        if (i < 0 || i > this.getLenght()) {
            throw new IndexOutOfBoundsException();
        } else if (this.getLenght() == 0) {
            Nodo n = new Nodo(dato);
            this.testa = n;
            this.coda = n;

        } else if (i == 0) {
            Nodo n = new Nodo(dato, this.testa, null);
            this.testa.setprecedente(n);
            this.testa = n;
        } else if (i == this.getLenght()) {
            Nodo n = new Nodo(dato, this.coda);
            this.coda.setSuccessivo(n);
            this.coda = n;
        } else if (i < (this.getLenght() / 2)) {
            Nodo prec = this.testa;
            Nodo succ = prec.getsuccessivo();
            for (int j = 0; j < i - 1; j++) {
                prec = prec.getsuccessivo();
                succ = succ.getsuccessivo();
            }
            Nodo n = new Nodo(dato, succ.getsuccessivo(), prec.getprecedente());
            succ.setSuccessivo(n);
            prec.setprecedente(n);
        } else if (i > (this.getLenght() / 2)) {
            Nodo prec = this.coda;
            Nodo succ = coda.getprecedente();
            for (int j = 0; j < i - 1; j++) {
                prec = prec.getprecedente();
                succ = succ.getprecedente();
            }
            Nodo n = new Nodo(dato, succ.getsuccessivo(), prec.getprecedente());
            succ.setSuccessivo(n);
            prec.setprecedente(n);
        }
        this.setLenght(this.getLenght() + 1);
    }

    public void add(T dato) {
        this.insert(dato, this.lenght());
    }

    public void remuve(int index) {
        if (index < 0 || index > this.getLenght()) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            this.testa = this.testa.getsuccessivo();
            this.testa.setprecedente(null);
        } else if (index < this.getLenght() / 2) {
            Nodo scan = this.testa;
            for (int i = 0; i < index - 1; i++) {
                scan.getsuccessivo();
            }
            scan.getsuccessivo().setSuccessivo(scan.getsuccessivo().getsuccessivo());
        } else if (index > this.getLenght() / 2) {
            Nodo scan = this.coda;
            for (int i = this.getLenght() - 1; i > index + 1; i--) {
                scan.getprecedente();
            }
            scan.getprecedente().setDato(scan.getprecedente().getprecedente().getDato());
        }
        {

        }
        this.setLenght(this.getLenght() - 1);
    }

    public void stampaLista() {
        this.forEach(s -> System.out.print(s + "|"));

    }

    @Override
    public Iterator<T> iterator() {
        return new Iteratore();
    }

    protected class Iteratore implements Iterator<T> {

        private Nodo cursore;

        public Iteratore() {
            cursore = testa;
        }

        @Override
        public boolean hasNext() {
            return cursore != null;
        }

        @Override
        public T next() {
            T e = cursore.getDato();
            cursore = cursore.getsuccessivo();
            return e;
        }

    }

    public static void main(String[] args) {
        ListaDouble<Integer> ints = new ListaDouble<>();
        ints.add(5);
        ints.insert(100, 0);
        ints.add(230);

        ints.add(6);
        ints.add(192);
        System.out.println(ints.extract(2));

        ints.remuve(1);

        ints.stampaLista();
    }
}
