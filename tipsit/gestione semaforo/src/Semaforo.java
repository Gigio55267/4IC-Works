
public class Semaforo {

    private Boolean colore = false;

    public boolean cambiastato() {
        if (this.colore) {
            this.colore = false; 
        }else {
            this.colore = true;
        }
        return this.colore;
    }

    public Boolean getColore() {
        return colore;
    }

    public void setColore(Boolean colore) {
        this.colore = colore;
    }

}
