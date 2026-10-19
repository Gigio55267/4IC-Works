public class Operatore implements Runnable {
    private Magazzino m; 
    private String nome;
    public Operatore(String nome,Magazzino m){
        this.m=m;
        this.nome=nome;
    }

    @Override
    public void run() {
        while (m.getPacchiRichiesti() < m.getPacchi().length) {
            synchronized (m) {
               m.prendere();
            }
        }

    }
    
}
