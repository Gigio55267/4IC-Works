public class Dispositivo {
    private double consumo;

    public Dispositivo(double consumo) {
        this.consumo = consumo;
    }

    public void acceso(){
        System.out.println("dispositivo acceso");
    }

    public double getConsumo() {
        return consumo;
    }
}
