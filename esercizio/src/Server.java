public class Server extends Computer {

    public Server(double consumo) {
        super(consumo);
    }
    @Override 
    public void acceso(){
        System.out.println("COMPUTER ACCESO\nSERVER AVVIATO");
    }

    
    
}
