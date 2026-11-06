
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class Coda<T> implements Iterable<T>{
    private final ListaDouble<T> queue;

    @Override
    public Iterator<T> iterator() {
        return new Iteratore(this);
    }

    private class Iteratore implements Iterator<T>{

        private Coda<T> c;

        public Iteratore(Coda c){
            this.c = c;
        }
        @Override
        public boolean hasNext() {
            return !c.isempty();
        }

        @Override
        public T next() {
            return c.dequeque();
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
    public void doSometings(Consumer<T> h ){
        this.forEach(e-> h.accept(e));
    }
}