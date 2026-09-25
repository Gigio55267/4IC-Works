
public class SecondoThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            System.out.println(" sono il thread "+ getName());
        }
    }
    
}
