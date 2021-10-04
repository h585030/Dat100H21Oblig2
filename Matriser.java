package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		int k = 0;
		for (int i=0; i<matrise.length; i++) {
			for (int j=0; j<matrise[i].length; j++) {
				k = matrise[i][j];
				System.out.print(k);
				System.out.print(matrise[i][j]);
			}
		}
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		String innholdet = "";
		
		for (int i=0; i<matrise.length; i++) {
			for (int j=0; j<matrise[i].length; j++) {
				innholdet += matrise[i][j];
				if (i < matrise.length) {
					innholdet += " ";
				}
			}
		if (i<matrise.length) {
			innholdet += "\n";
		}
		}
		
		return innholdet;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		int nyMatr[][] = new int[matrise.length][matrise.length];
		for (int k=0; k<matrise.length; k++) {
			for (int l=0; l<matrise[k].length; l++) {
				nyMatr[k][l] = matrise[k][l];
			}
		}
		for (int i=0; i<matrise.length; i++) {
			for (int j=0; j<matrise[i].length; j++) {
				nyMatr[i][j] = nyMatr[i][j] * tall;
				
			}
		
		}
		
		return nyMatr;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		boolean lik = false;
		if (a == b) {
			lik = true;
		}
		return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		
		// TODO
		int nyMatris[][] = new int[matrise.length][matrise.length];
		int i = 0;
		int j = 0;
		while (i < matrise.length) {
			while (j < matrise.length) {
				nyMatris[j][i] = matrise[i][j];
				j++;
			}
			i++;
			j = 0;
		}
		return nyMatris;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		int nyMatrise[][] = new int[a.length][b.length];
		return nyMatrise;
	}
}
