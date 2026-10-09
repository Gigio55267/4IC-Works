
public class Nodo<T> {

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
}
