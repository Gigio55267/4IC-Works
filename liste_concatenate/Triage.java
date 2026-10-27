
public enum Triage {
    Rosso(1), Arancione(2), Azzuro(3), Verde(4), Bianco(5);

    private final int num;

    public int getNum() {
        return num;
    }

    private Triage(int num){
        this.num=num;
    }
}
