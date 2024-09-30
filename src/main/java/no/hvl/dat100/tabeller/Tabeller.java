package no.hvl.dat100.tabeller;

public class Tabeller {

	public static void main(String[] args) {
		int[] test1 = { 10, 20, 30, 40, 50 };
		int[] test2 = { 10, 20, 30, 40, 50, 60 };
		int[] sammen;
		sammen = settSammen(test1, test2);
		System.out.println("Elementer: " + sammen.length);
		skrivUt(sammen);
		System.out.println(tilStreng(test1));
	}

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++)
			System.out.print(tabell[i] + " ");
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String resultat = "[";

		for (int i = 0; i < tabell.length; i++) {
			resultat += tabell[i];
			if (i < tabell.length - 1)
				resultat += ",";
		}
		
		return resultat += "]";
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;

		for (int i = 0; i < tabell.length; i++)
			sum += tabell[i];

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++)
			if (tabell[i] == tall)
				return true;

		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++)
			if (tabell[i] == tall)
				return i;

		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int tabellRevers[] = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++)
			tabellRevers[tabell.length - 1 - i] = tabell[i];

		return tabellRevers;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 0; i < tabell.length - 1; i++)
			if (tabell[i] > tabell[i + 1])
				return false;

		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] sammensattTabell = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++)
			sammensattTabell[i] = tabell1[i];

		for (int i = 0; i < tabell2.length; i++)
			sammensattTabell[tabell1.length + i] = tabell2[i];

		return sammensattTabell;
	}
}
