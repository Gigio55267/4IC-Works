public class Main {

    public static void main(String[] args) {
        PrimoThread p = new PrimoThread();
        SecondoThread s =new SecondoThread();
        p.start();
        s.start();
    }
}