
import java.util.Iterator;
import java.util.function.Consumer;

public class Stack<T> implements Iterable<T> {

    private final ListaDouble<T> stack;

    @Override
    public Iterator<T> iterator() {
        return new Iteratore(this);
    }

    private class Iteratore implements Iterator<T> {
        
        private Stack<T> s;

        public Iteratore(Stack s){
            this.s = s;
        }

        @Override
        public boolean hasNext() {
            return s.peek()!=null;
        }

        @Override
        public T next() {
            return s.pop();
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

    public void doSometings(Consumer<T> c ){
        this.forEach(e-> c.accept(e));
    }
}
