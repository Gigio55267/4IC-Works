
public class Passioni<T> {

    private boolean isFull(T[] c) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null) {
                return false;
            }
        }
        return true;
    }

    public <T> Boolean inserisciNuovoElemento(T e, T[] arr, int pos) {
        Passioni p = new Passioni<>();
        T a1;
        T a2;
        if (!p.isFull(arr)) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[pos] == null) {
                    arr[pos] = e;
                } else {
                    a1 = arr[pos];

                }
            }

        }
        return true;
    }
}
