public class Cuochi implements Runnable{

    public Piatto[] inizializazione(int l){
        Piatto[] p = new Piatto[l];
        for (int i = 0; i < l; i++) {
            p[i] = new Piatto();
        }
        return p;
    }

    public void addPlate(){
        Nastro n = new Nastro();
        for (int i = 0; i < n.getPiatto().length; i++) {
            if (n.getPiatto()[i] == null){
                n.getPiatto()[i] = new Piatto();
            } 
        }
    }

    public void remuvePlate(){
        Nastro n = new Nastro();
        for (int i = 0; i < n.getPiatto().length; i++) {
            if (n.getPiatto()[i] != null){
                n.getPiatto()[i] = new Piatto();
            } 
        }
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
}
