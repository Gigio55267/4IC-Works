
import java.util.concurrent.atomic.AtomicInteger;

public class Nastro {

    private Piatto[] piatto;
    private AtomicInteger piattiPresi;
    private AtomicInteger numeroClienti;
    private int guadagnato;
    private Cuochi c = new Cuochi();

    public Nastro() {
        this.piatto = c.inizializazione(20);
        this.piattiPresi = new AtomicInteger();
        this.numeroClienti = new AtomicInteger();
        this.guadagnato = 0;
    }

    public void rimuoviPiatto(){
        for (int i = 0; i < piatto.length; i++) {
            
        }
    }

    public void setPiatto(Piatto[] piatto) {
        this.piatto = piatto;
    }

    public Piatto[] getPiatto() {
        return piatto;
    }

    public void setPiattiPresi(AtomicInteger piattiPresi) {
        this.piattiPresi = piattiPresi;
    }

    public AtomicInteger getPiattiPresi() {
        return piattiPresi;
    }
    
    public int getGuadagnato() {
        return guadagnato;
    }

    public void setGuadagnato(int guadagnato) {
        this.guadagnato = guadagnato;
    }
}