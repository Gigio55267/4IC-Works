
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

    public T getDato(){
        return this.dato;
    }

    public Nodo getsuccessivo(){
        return this.successivo;
    }

    public void setSuccessivo(Nodo successivo){
        this.successivo=successivo;
    }
}
