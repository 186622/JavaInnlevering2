package no.hvl.dat100.tabeller;
import java.util.Arrays;
public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

	for (int i = 0; i < tabell.length;i++) {
		System.out.print(tabell[i] + " ");
	}


	}

	// b)
	public static String tilStreng(int[] tabell) {
	    String resultat = Arrays.toString(tabell);
	    return resultat.replaceAll("\\s+", "");
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i<tabell.length; i++) {
			sum += tabell[i];
			
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i = 0 ; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return true;
			}
			
		}
		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i< tabell.length;i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
		
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int start = 0;
		int slutt = tabell.length - 1;
		
		
		while (start < slutt) {
			
			int temp = tabell[start];
			tabell[start] = tabell[slutt];
			tabell[slutt] = temp;
			
			
			start++;
			slutt--;
			
		}
		return tabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 0; i< tabell.length;i++) {
			if (tabell[i] > tabell[i+1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] nyTabell = new int[tabell1.length + tabell2.length];
		
		for (int i = 0 ; i< tabell1.length;i++) {
			nyTabell[i] = tabell1[i];
		}
		
		
		for (int i = 0; i< tabell2.length; i++) {
			nyTabell[tabell1.length + i] = tabell2[i];
		}
	return nyTabell;	
	}
}
