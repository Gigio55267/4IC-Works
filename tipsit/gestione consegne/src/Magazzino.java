
import java.util.concurrent.atomic.AtomicInteger;

public class Magazzino {

    private Dato[] pacchi;
    private int pacchiTotali;
    AtomicInteger pacchiRichiesti;
    AtomicInteger pacchiRiuscite;
    AtomicInteger pacchiFalliti;

    public Magazzino(Dato[] dato, int pacchiTotali) {
        this.pacchi = dato;
        this.pacchiTotali = pacchiTotali;
        this.pacchiRichiesti = new AtomicInteger(0);
        this.pacchiRiuscite = new AtomicInteger(0);
        this.pacchiFalliti = new AtomicInteger(0);
    }

    public boolean prendere() {
        this.pacchiRichiesti.incrementAndGet();
        if (this.getPacchiRichiesti() <= this.getPacchiTotali()) {
            pacchiRiuscite.incrementAndGet();
            return true;
        }
        pacchiFalliti.incrementAndGet();
        return false;

    }

    public int getPacchiTotali() {
        return this.pacchiTotali;
    }

    public int getPacchiRichiesti() {
        return pacchiRichiesti.get();
    }

    public int getPacchiRiuscite() {
        return pacchiRiuscite.get();
    }

    public int getPacchiFalliti() {
        return pacchiFalliti.get();
    }

    public Dato[] getPacchi() {
        return this.pacchi;
    }
}
