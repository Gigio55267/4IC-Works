import java.util.NoSuchElementException;

public class Cella<T> implements Contenitore<T>{
    T elemento; 

    
    @Override
    public void inserisci(T c) {
       if (!contenitoreVuoto()){ 
        throw new  IllegalStateException("cella gia occupata");
    }
       else this.elemento=c; 
    }

    @Override
    public T rimmuovi() {
        if (contenitoreVuoto()){ 
        throw new  NoSuchElementException("cella vuota nulla da rimuovere");
    }
       else return this.elemento;
    }

    @Override
    public boolean contenitoreVuoto() {
        return this.elemento==null;
    }
    
}
