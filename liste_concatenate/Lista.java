
public class Lista<T> {

    //stracture wrapping 
    private class Nodo {

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
    private Nodo testa;

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
    public T extract(int i){
        if (i < 0 || i >= this.lenght()) new IndexOutOfBoundsException();
        Nodo ext = this.testa;
        for (int j = 0; j < i; j++) {
            ext = ext.getsuccessivo();
        }
        return ext.getDato();
    }
}
