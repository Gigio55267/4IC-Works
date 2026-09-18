public class ContoBancario implements Verificabile {
    private String iban;
    private double saldo;
    public ContoBancario(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }
    public double versamento(double quantita){
        saldo += quantita;
        return saldo;
    }
    public double prelievo(double quantita){
        saldo -= quantita;
        return saldo;
    }
    @Override
    public double getValoreRischio() {
        double valore; 
        if (saldo<0.0) {
            valore=Math.abs(saldo);
        }
        else valore = 0.0 ;
        return valore;
    }
    @Override
    public void riduci() {
        saldo=saldo / 2.0;
    }
    @Override
    public String getTipo() {
        return this.getClass().getTypeName();
    }
}
