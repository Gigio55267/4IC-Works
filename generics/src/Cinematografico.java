
public class Cinematografico extends Passioni implements Raplass {

    private final int USCITASALE;
    private final String NOMEREGISTA;
    private String[] nomeAttori;
    private String titolo;

    public Cinematografico(int uSCITASALE, String nomereg, String[] nomeAttori, String titolo) {
        USCITASALE = uSCITASALE;
        NOMEREGISTA = nomereg;
        this.nomeAttori = nomeAttori;
        this.titolo = titolo;
    }

    @Override
    public String formClass() {
        return this.titolo + " di " + this.NOMEREGISTA + "("+ this.nomeAttori[0]+","+this.nomeAttori[1]+")";
    }
;
}
