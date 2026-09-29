
public class Passioni<T extends Classificabile> {

    private Classificabile[] top = new Classificabile[5];

    private boolean isFull(T[] c) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null) {
                return false;
            }
        }
        return true;
    }

    public boolean inserisciNuovoElemento(T elemento, int posizione) {
        if (posizione < 0 || posizione >= top.length) {
            return false;
        }

        boolean rimosso = top[top.length - 1] != null;

        for (int i = top.length - 1; i > posizione; i--) {
            top[i] = top[i - 1];
        }

        top[posizione] = elemento;

        return rimosso;
    }

    public void rimuoviElemento(int posizione) {
        if (posizione >= top.length || posizione < 0) {
            System.out.println("posizione non valida");
        }
        for (int i = posizione; i < top.length - 1; i++) {
            top[i] = top[i + 1];
        }
        top[top.length - 1] = null;
    }

    public void PrimoClassificabile(T[] arr) {
        for (T t : arr) {
            if (t != null) {
                System.out.println("primo elemento classificabile: " + t);
                return;
            }
        }
    }

    public int cercaElemento(T elemento) {
        return cercaElemento(elemento, 0);
    }

    private int cercaElemento(T elemento, int index) {
        if (index >= top.length) {
            return -1;
        }

        if (top[index] != null && top[index].equals(elemento)) {
            return index + 1;
        }

        return cercaElemento(elemento, index + 1);
    }

}
