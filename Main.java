public class Main {

    public static void main(String[] args) {
        
        System.out.println();
        PrimoThread p = new PrimoThread();
        SecondoThread s =new SecondoThread();
        p.start();p.setName(" lettere");
        s.start();s.setName(" numeri");
        for (char i = 'a'; i < 'z'; i++) {
            System.out.print(i + " ");
        }
    }
}