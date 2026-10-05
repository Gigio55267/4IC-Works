
public class Macchine extends Thread {

    Semaforo sem;

    public Macchine(Semaforo sem) {
        this.sem = sem;
    }

    @Override
    public void run() {
        while (true) {
            if (sem.getColore()) {
                System.out.println("passata");}
            else {System.out.println("non passara");}
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.getLogger(Macchine.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            
        }
    }

}
