
public class Musicale extends Passioni implements Raplass {

    private final String NOMEARTISTA;
    private int numeroDiTracce;
    private String titolo;

    public Musicale(String nOMEARTISTA, int numeroDiTracce, String titolo) {
        NOMEARTISTA = nOMEARTISTA;
        this.numeroDiTracce = numeroDiTracce;
        this.titolo = titolo;
    }

    @Override
    public String formClass() {
        return this.NOMEARTISTA + " " + titolo;
    }
}
