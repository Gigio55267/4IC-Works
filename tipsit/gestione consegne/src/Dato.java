public class Dato {
    private String mittente;
    private String destinatario;
    public Dato(String mittente, String destinatario) {
        this.mittente = mittente;
        this.destinatario = destinatario;
    }
    public String getMittente() {
        return mittente;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public void setMittente(String mittente) {
        this.mittente = mittente;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
}
