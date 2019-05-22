package it.universityofpadova.pari;

public class PariTester {
	public static void main(String[] args) {
		int[] myArray = new int[4];
		myArray[0] = 1;
		myArray[1] = 4;
		myArray[2] = 1;
		myArray[3] = 4;
		System.out.println(Pari.isPari(myArray));
	}
}