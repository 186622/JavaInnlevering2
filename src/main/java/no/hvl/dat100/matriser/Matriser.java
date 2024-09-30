package no.hvl.dat100.matriser;

public class Matriser {

	// 5a)
	public static void skrivUt(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {

			for (int j = 0; j < matrise[i].length; j++)
				System.out.print(matrise[i][j] + "\t");

			System.out.print('\n');
		}
	}

	// 5b)
	public static String tilStreng(int[][] matrise) {
		String returVerdi = "";

		for (int i = 0; i < matrise.length; i++) {

			for (int j = 0; j < matrise[i].length; j++)
				returVerdi += matrise[i][j] + " ";

			returVerdi += "\n";
		}

		return returVerdi;
	}

	// 5c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] skalertTabell = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++) {
			// Tilrettelegger for tabeller av ulik lengde
			skalertTabell[i] = new int[matrise[i].length];

			for (int j = 0; j < matrise[i].length; j++)
				skalertTabell[i][j] = matrise[i][j] * tall;

		}

		return skalertTabell;
	}

	// 5d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length)
			return false;

		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length)
				return false;
			
			for (int j = 0; j < a[i].length; j++)
				if (a[i][j] != b[i][j])
					return false;
		}

		return true;
	}

	// 6a)
	public static int[][] speile(int[][] matrise) {
		
		// Sjekke at matrise er rektangulær
		for (int i = 0; i < matrise.length; i++)
			if (matrise[i].length != matrise[0].length)
				return null;

		int[][] speiletMatrise = new int[matrise[0].length][matrise.length];

		for (int i = 0; i < matrise.length; i++)
			for (int j = 0; j < matrise[i].length; j++)
				speiletMatrise[j][i] = matrise[i][j];

		return speiletMatrise;
	}

	// 6b)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		// Antar at matrisen allerede er velformet og sjekker bare om den første
		// kolonnen er like stor som den første raden
		if (a[0].length != b.length)
			return null;

		int[][] multiplisertMatrise = new int[a.length][b[0].length];

		for (int i = 0; i < multiplisertMatrise.length; i++)
			for (int j = 0; j < multiplisertMatrise[0].length; j++)
				for (int k = 0; k < a[0].length; k++)
					multiplisertMatrise[i][j] += a[i][k] * b[k][j];

		return multiplisertMatrise;
	}
}
