
import java.util.concurrent.atomic.AtomicInteger;

public class Prenotazione {

    private String evento;
    private int posti;
    AtomicInteger postiRichiesti;
    AtomicInteger prenRiuscite;

    public Prenotazione(String evento, int posti) {
        this.evento = evento;
        this.posti = posti;
        this.postiRichiesti = new AtomicInteger(0);
        this.prenRiuscite = new AtomicInteger(0);
    }

    public boolean prenota() {
        this.postiRichiesti.incrementAndGet();
        if (this.getPostiRichiesti() > this.getPosti()) {
            System.out.println("vuoi più biglietti di quelli disponibili");
            return false;
        }{
            prenRiuscite.incrementAndGet();
            return true;
        }
    }

    public String getEvento() {
        return evento;
    }

    public int getPosti() {
        return posti;
    }

    public int getPostiRichiesti() {
        return postiRichiesti.get();
    }

    public int getPrenRiuscite() {
        return prenRiuscite.get();
    }
}
