public class PaccoSpedizione implements Verificabile{
    private String codiceTracciamento;
    private double pesoKg;
    private PaccoSpedizione[] spedizionePacchi;
    public PaccoSpedizione(String codiceTracciamento, double peseKg) {
        this.codiceTracciamento = codiceTracciamento;
        this.pesoKg = peseKg;
    }
    public void Consegna(){
        TentaConsegna t = new TentaConsegna();
        t.tentaConsArray(spedizionePacchi, this);
    }
    @Override
    public double getValoreRischio() {
        return (pesoKg < 1.5) ? 0.0 : pesoKg; 
    }
    @Override
    public void riduci() {
        pesoKg=pesoKg - (pesoKg/100*10);
    }
    @Override
    public String getTipo() {
        return this.getClass().getTypeName();
    }

    public PaccoSpedizione[] getSpedizionePacchi() {
        return spedizionePacchi;
    }
}
