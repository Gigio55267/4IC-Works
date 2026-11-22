
public class App {

    public static void main(String[] args) {
        Dato[] d = new Dato[150];
        d[0] = new Dato(null, null);
        Magazzino richiesta = new Magazzino(d, 150);
        Operatore persona = new Operatore("persona", richiesta);

        Operatore[] p = new Operatore[30];
        Thread[] t = new Thread[30];
        for (int i = 0; i < t.length; i++) {
            d[i]=new Dato(null, null);
        }

        for (int i = 0; i < 30; i++) {
            Operatore per = new Operatore("" + i, richiesta);
            p[i] = per;
            Thread tung = new Thread(per);
            t[i] = tung;
        }
        for (int j = 0; j < t.length; j++) {
            t[j].start();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("pacchi iniziali "+ richiesta.getPacchiTotali());
        System.out.println("pacchi assegnati " + richiesta.getPacchiRichiesti());
        System.out.println("pacchi richiesti "+ richiesta.getPacchiRichiesti());
        System.out.println("pacchi riusciti "+ richiesta.getPacchiRiuscite());
        System.out.println("pacchi falliti "+ richiesta.getPacchiFalliti());
        System.out.println("riuscita "+  ((double)richiesta.getPacchiRiuscite()/(double)richiesta.getPacchiRichiesti())*100+"%");
    }

}
