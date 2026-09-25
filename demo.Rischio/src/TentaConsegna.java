public class TentaConsegna {
    public boolean tentaConsegna(PaccoSpedizione p){
        return Math.random()*100>p.getValoreRischio();
    }
    public void tentaConsArray(PaccoSpedizione[] array, PaccoSpedizione p){
        for (int i = 0; i < array.length-1; i++) {
            if (this.tentaConsegna(p)) {
                array[i] = p;
            }
            else array[i] = null;
        }
    }
}
