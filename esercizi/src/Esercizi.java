public class Esercizi
{
	/*
	Es 1
	*/
	public static String inverti (String s) {
		String in ;
		if (s.equals("")) {
			in="";
		}
		else{
			in = s.charAt(s.length()-1)+inverti(s.substring(0, s.length()-1));
		}
	    return in;
	}
	
	/*
	Es 2
	*/
	public static boolean palindroma(String s) {
		boolean bul;
		if (s.equals("")|| s.length()==1) {
			bul=true;
		}
        else bul = s.charAt(0) == s.charAt(s.length()-1) && palindroma(s.substring(1, s.length()-1));
		return bul;
	}
	
	/*
	Es 3
	*/
	public static int potenza(int b, int e) {
		int pot;
		if (e==0) {
			pot = 1;
		}
		else pot = b* potenza(b, e -1);
	    return pot;
	}
	
	/*
	Es 4
	*/
	public static int numeroCifre(int n) {
		int lung;
		if (n/10<1)  lung=1;
	    else lung =1+ numeroCifre(n/10);
		return lung;
	}
	
	/*
	Es 5
	*/
	public static boolean cerca(int dati[], int target, int pointer) {
		boolean trovato;
		if (pointer>dati.length-1) 	trovato=false;
		else trovato = target==dati[pointer] || cerca(dati, target, pointer+1);
	    return trovato;
	}
    
    	/*
	TESTER: NON MODIFICARE
	*/
	public static void main(String[] args) {
		System.out.println("CONTROLLO SU inverti...");
		System.out.print("Controllo che 'Ciao' diventi 'oaiC'... ");
		if (inverti("Ciao").equals("oaiC")) {
		    System.out.println("OK");
		} else {
		    System.out.println("ERRORE!");
		}
		System.out.print("Controllo che '' rimanga ''... ");
		if (inverti("").equals("")) {
		    System.out.println("OK");
		} else {
		    System.out.println("ERRORE!");
		}
		
		System.out.println("\nCONTROLLO SU palindroma...");
		System.out.print("Controllo che 'AA000AA' restituisca true... ");
		if (palindroma("AA000AA")) {
		    System.out.println("OK");
		} else {
		    System.out.println("ERRORE!");
		}
		System.out.print("Controllo che 'AA100AA' restituisca false... ");
		if (!palindroma("AA100AA")) {
		    System.out.println("OK");
		} else {
		    System.out.println("ERRORE!");
		}
		
		System.out.println("\nCONTROLLO SU potenza...");
		System.out.print("Controllo che 2^8 restituisca 256... ");
		if (potenza(2,8) == 256) {
		    System.out.println("OK");
		} else {
		    System.out.println("ERRORE!");
		}
		
		System.out.println("\nCONTROLLO SU numeroCifre...");
		System.out.print("Controllo che 20261110 restituisca 8... ");
		if (numeroCifre(20261110) == 8) {
		    System.out.println("OK");
		} else {
		    System.out.println("ERRORE!");
		}
		
		int a[] = {10,20,30,40,50,60,70,80,90,100};
		System.out.println("\nCONTROLLO SU cerca...");
		System.out.print("Controllo se 60 esiste nell'array a... ");
		if (cerca(a,60,0)) {
		    System.out.println("OK");
		} else {
		    System.out.println("ERRORE!");
		}
		System.out.print("Controllo se 65 esiste nell'array a... ");
		if (!cerca(a,65,0)) {
		    System.out.println("OK");
		} else {
		    System.out.println("ERRORE!");
		}		
	}
}