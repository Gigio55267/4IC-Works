public class Ospedale{
    public static void main(String[] args) {
        SourtedList<Persona> p = new SourtedList<>();
        Persona p1 = new Persona(Triage.Azzuro, "lala", 104);
        Persona p2 = new Persona(Triage.Azzuro, "lalala", 14);
        Persona p3 = new Persona(Triage.Arancione, "la", 10);
        Persona p4 = new Persona(Triage.Bianco, "l", 1);
        Persona p5 = new Persona(Triage.Rosso, "lalal", 1004);
        p.sortedinsert(p1);
        p.sortedinsert(p3);
        p.sortedinsert(p5);
        p.sortedinsert(p4);
        p.sortedinsert(p2);
        p.forEach(a->System.out.println(a));
            
        
    }
}
