
public class PrimoThread extends Thread{

    @Override
    public void run() {
        for (char i = 'A'; i < 'Z'; i++) {
            System.out.print(i);
            System.out.println(" sono il thread "+ getName());
        }
    }
     

}
