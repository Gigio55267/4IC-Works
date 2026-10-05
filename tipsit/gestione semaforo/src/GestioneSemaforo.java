
public class GestioneSemaforo extends Thread {

    private Semaforo s;

    public GestioneSemaforo(Semaforo s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            s.cambiastato();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.getLogger(GestioneSemaforo.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }

        }
    }

}
