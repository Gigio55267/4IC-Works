
public class Cinematografico extends Passioni implements Raplass {

    private final int USCITASALE;
    private final String NOMEREGISTA;
    private String nomeAttori;
    private String nomeAttori1;
    private String titolo;

    public Cinematografico(int uSCITASALE, String nomereg, String nomeAttori,String nomeAttori1, String titolo) {
        USCITASALE = uSCITASALE;
        NOMEREGISTA = nomereg;
        this.nomeAttori = nomeAttori;
        this.nomeAttori1=nomeAttori1;
        this.titolo = titolo;
    }

    @Override
    public String formClass() {
        return this.titolo + " di " + this.NOMEREGISTA + "("+ this.nomeAttori+","+this.nomeAttori1+")";
    }
;
}
