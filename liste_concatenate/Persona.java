public class Persona implements Comparable<Persona>{
    private Triage t;
    private String nome;
    private String sesso;
    private int eta;
    private boolean andicap;
    private boolean incinta;
    public Persona(Triage t, String nome, int eta) {
        this.t = t;
        this.nome = nome;
        this.eta = eta;
    }

    public Persona(String nome, String sesso, int eta, boolean andicap, boolean incinta) {
        this.nome = nome;
        this.sesso = sesso;
        this.eta = eta;
        this.andicap = andicap;
        this.incinta = incinta;
    }

    @Override
    public int compareTo(Persona o) {
        if(this.t.getNum()>o.getT().getNum()) return -1;
        if(this.t.getNum()==o.getT().getNum())return 0;
        return 1;
    }

    public Triage getT() {
        return t;
    }

    @Override
    public String toString() {
        return "Persona [t=" + t + ", nome=" + nome + ", eta=" + eta + "]";
    }
}
