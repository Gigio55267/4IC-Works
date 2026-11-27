public class Polacca {

    private String espressione;
    private Queue q;
    private Stack s;

    public Polacca(String espressione){

        this.espressione = espressione;
        this.q = new Queue<>();
        this.s = new Stack<>();

    }

    public void conversionePolacca(){
        
        String c = "";
        for (int i = 0; i < this.espressione.length()-1; i++) {
            c= String.valueOf(this.espressione.charAt(i));
            if (c == "")
        }
    }
}