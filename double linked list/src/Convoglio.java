public class Convoglio {
    ListaDouble< ? super Vagoni> convoglio;

    public Convoglio(Locomotiva testa , Locomotiva coda) {
        convoglio.add(coda);
        convoglio.add(coda);
        convoglio.insert(testa, 0);
    }

    public void add(Vagoni e ){
        if (e.getClass().getName().equals("Locomotiva"))  throw new IllegalArgumentException("gia presente locomotiva di testa e di coda "); 
        else this.convoglio.insert(e, 1);
    }
}
