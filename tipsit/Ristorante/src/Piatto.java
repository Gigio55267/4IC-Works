import java.util.Random;

public class Piatto {
    public Piatto() {
        this.nome = assegnanome();
    }

    private String nome;
    private String[] nomi = {"pizza","gatto","topo"};

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String assegnanome(){
        Random r = new Random();
        return this.nomi [r.nextInt(3)];
    }
}
