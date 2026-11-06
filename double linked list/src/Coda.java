
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Coda<T> implements Iterable<T>{
    private final ListaDouble<T> queue;

    @Override
    public Iterator<T> iterator() {
        return new Iteratore();
    }

    private class Iteratore implements Iterator<T>{

        @Override
        public boolean hasNext() {
            return !isempty();
        }

        @Override
        public T next() {
            return dequeque();
        }
        
    }

    public Coda() {
        this.queue = new ListaDouble<>();
    }

    public void enqueque(T element) {
        this.queue.add(element);
    }

    public boolean isempty() {
        return this.queue.getLenght() == 0;
    }

    public T dequeque() {
        if (this.isempty()) {
            throw new NoSuchElementException();
        }
        T aux = this.queue.extract(0);
        this.queue.remove(0);
        return aux;
    }
}