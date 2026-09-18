public class ImmagineDigitale implements Verificabile{
    private String nomeFile;
    private double megaBite;
    public ImmagineDigitale(String nomeFile, double megaBite) {
        this.nomeFile = nomeFile;
        this.megaBite = megaBite;
    }
    public void blackAndWhite (){
        megaBite = megaBite - (megaBite/100*20);
    }
    @Override
    public double getValoreRischio() {
        return megaBite;
    }
    @Override
    public void riduci() {
        megaBite=megaBite / 2;
    }
    @Override
    public String getTipo() {
        return this.getClass().getTypeName();
    }
}
