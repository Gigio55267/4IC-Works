public class ConvEsadecim {
    private String r;
    private Queue p;

    public ConvEsadecim(String r){
        this.r=r;
        this.p = new Queue<>();
    }

    public double converti(String r){
        double pot=0;
        double tot=0;
        p.forEach(t->p.enqueue(t));
        while(p.dequeue() != null){
            tot = tot + ((double)p.dequeue()) * Math.pow(16.0 , pot);
        }
        return tot;
    }
    public static void main(String[] args) {
        ConvEsadecim p = new ConvEsadecim("1234");
        System.out.println(p.converti("1234"));
    }
}