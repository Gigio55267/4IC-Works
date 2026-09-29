
public class Passioni<T> {

    private boolean isFull(T[] c) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null) {
                return false;
            }
        }
        return true;
    }

    public boolean inserisciNuovoElemento(T elemento, int posizione,T[]c) {
        if (posizione < 0 || posizione >= c.length) {
            return false;
        }

        boolean rimosso = c[c.length - 1] != null;

        for (int i = c.length - 1; i > posizione; i--) {
            c[i] = c[i - 1];
        }

        c[posizione] = elemento;

        return rimosso;
    }

    public void rimuoviElemento(int posizione, T[]c) {
        if (posizione >= c.length || posizione < 0) {
            System.out.println("posizione non valida");
        }
        for (int i = posizione; i < c.length - 1; i++) {
            c[i] = c[i + 1];
        }
        c[c.length - 1] = null;
    }

    public void PrimoClassificabile(T[] arr) {
        for (T t : arr) {
            if (t != null) {
                System.out.println("primo elemento classificabile: " + t);
                return;
            }
        }
    }

    public int cercaElemento(T elemento,T[]c) {
        return cercaElemento(elemento, 0,c);
    }

    private int cercaElemento(T elemento, int index,T[]c) {
        if (index >= c.length) {
            return -1;
        }

        if (c[index] != null && c[index].equals(elemento)) {
            return index + 1;
        }

        return cercaElemento(elemento, index + 1,c);
    }

}
