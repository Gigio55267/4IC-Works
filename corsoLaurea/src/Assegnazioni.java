
public class Assegnazioni {

    private Lista<Tesi> tesi;
    private Lista<Studente> laureandi;
//I metodi aggiungiTesi e aggiungiStudente inseriscono una nuova tesi ed un nuovo studente, rispettivamente, nel sistema. Se la tesi associata allo studente non è già presente nel sistema, questa dovrà essere creata. 

    public Assegnazioni(Lista laureandi, Lista tesi) {
        this.laureandi = laureandi;
        this.tesi = tesi;
    }
    //public void aggiungiStudente(Studente s){
    //  laureandi.add(s);
    //}
    //public void aggiungiTesi(Tesi t){
    //  tesi.add(t);
    //}
    public void aggiungiTesi(String titoloTesi) {
      Tesi te = new Tesi(titoloTesi);
      tesi.add(te);
    }

    public void aggiungiStudente(String nomeStudente, String titoloTesi) {
      if (tesi.contains(e->e.equals(titoloTesi))){
        aggiungiTesi(titoloTesi);
      }
    }

    public void laureato(String nomeStudente) {

    }

    public void liberaTesi(String titoloTesi) {

    }

    public int disponibili() {
        return 0;

    }
}
