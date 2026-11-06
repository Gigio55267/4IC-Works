
import java.util.Iterator;

public class Stack<T> implements Iterable<T> {

    private final ListaDouble<T> stack;

    @Override
    public Iterator<T> iterator() {
        return new Iteratore();
    }

    private class Iteratore implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return peek()!=null;
        }

        @Override
        public T next() {
            return pop();
        }

    }

    public Stack() {
        this.stack = new ListaDouble<>();
    }

    public void push(T element) {
        this.stack.insert(element, 0);
    }

    public T peek() {
        if (this.stack.getLenght() == 0) {
            return null;
        } else {
            return this.stack.extract(0);
        }
    }

    public boolean isempty() {
        return this.stack.getLenght() == 0;
    }

    public T pop() {
        T aux = this.peek();
        if (aux != null) {
            this.stack.remove(0);
        }
        return aux;
    }
}
