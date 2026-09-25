public class Passioni<T> {
    private boolean isFull(T[]c){
        for (int i = 0; i < c.length; i++) {
            if (c[i].equals(null)) {
                return false;
            }
        }
        return true;
    }
    public Boolean inserisciNuovoElemento(){
        
        return true;
    }
}
