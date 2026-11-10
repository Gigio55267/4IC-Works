public class Stazione {
    ListaDouble<Convoglio> binari;

    public Stazione(Convoglio e) {
        this.binari.add(e);       
    }

    public void add(Convoglio e){
        this.binari.add(e);
    }
    
}
