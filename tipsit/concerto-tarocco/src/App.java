
public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("real-madrid vs juventus");

        Prenotazione prenotazione = new Prenotazione("real-madrid vs juventus", 5);
        Persona persona = new Persona("bortoletti", prenotazione);
        Persona[] p = new Persona[10];
        Thread[] t = new Thread[10];
        for (int i = 0; i < 10; i++) {
            Persona per = new Persona("" + i, prenotazione);
            p[i] = per;
            Thread tung = new Thread(per);
            t[i] = tung;
        }
        for (int i = 0; i < t.length; i++) {
            t[i].start();
        }

    }
}
