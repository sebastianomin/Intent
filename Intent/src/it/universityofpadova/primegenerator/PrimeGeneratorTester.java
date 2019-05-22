package it.universityofpadova.primegenerator;

import java.util.Scanner;

public class PrimeGeneratorTester {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Inserisci il numero fino a cui devo trovare i primi");
		int n = console.nextInt();
		PrimeGenerator max = new PrimeGenerator(n);
		System.out.println(max.getFirstPrimes());
	}
}