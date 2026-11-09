public class Cliente implements Runnable{

    public boolean prendiPiatto(Nastro n){
        for (int j = 0; j < n.getPiatto().length; j++) {
            if (n.getPiatto()[j]!=null) {
                n.getPiatto()[j]=null;
                n.getPiattiPresi().incrementAndGet();
                return true;
            }
        }
        return false;
    }
    @Override
    public void run() {
        Nastro n = new Nastro();
        synchronized (n) {
            prendiPiatto(n);
        }
    }
    
}
