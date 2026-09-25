
public class Letterario extends Passioni implements Raplass {

    private final String NOMEAUTORE;
    private final int PAGINE;
    private final String ISBN;
    private String titolo;

    public Letterario(String nOMEAUTORE, int pAGINE, String iSBN, String titolo) {
        NOMEAUTORE = nOMEAUTORE;
        PAGINE = pAGINE;
        ISBN = iSBN;
        this.titolo = titolo;
    }

    @Override
    public String formClass() {
        return this.NOMEAUTORE + "\"" + this.titolo + "\"" + "(ISBN: " + this.ISBN + ")";
    }
}
