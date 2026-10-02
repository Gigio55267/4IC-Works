public class Computer extends Dispositivo{
    public Computer(double consumo) {
        super(consumo);
        
    }

    @Override
    public void acceso(){
        System.out.println("computer acceso");
    }
}
