
public class Persona implements Runnable{

    private String nome;
    private Prenotazione pren;

    public Persona(String nome, Prenotazione prenotazione) {
        this.nome = nome;
        this.pren = prenotazione;

    }
    @Override
    public void run() {
        System.out.println(nome+((pren.prenota()) ? " sei riuscito a " : " non dei riuscito a ") + "prenotare");
    }

    public String getNome() {
        return nome;
    }

    public Prenotazione getPren() {
        return pren;
    }
}
