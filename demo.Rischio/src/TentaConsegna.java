public class TentaConsegna {
    public boolean tentaConsegna(PaccoSpedizione p){
        return Math.random()*100>p.getValoreRischio();
    }
}
