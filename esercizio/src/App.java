public class App {
    public static void main(String[] args) throws Exception {
        Computer com=new Computer(15.0);
        Cella<Dispositivo> cella = new Cella<>();
        cella.inserisci(com);
        cella.rimmuovi().acceso();
    }
}
