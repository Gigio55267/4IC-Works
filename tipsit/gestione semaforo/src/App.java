
public class App {

    public static void main(String[] args) throws Exception {
        Semaforo semaforo = new Semaforo();
        Macchine macchine = new Macchine(semaforo);
        GestioneSemaforo gestioneSemaforo = new GestioneSemaforo(semaforo);
        macchine.start();
        gestioneSemaforo.start();
    }
}
