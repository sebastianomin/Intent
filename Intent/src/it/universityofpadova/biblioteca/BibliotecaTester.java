package it.universityofpadova.biblioteca;

import java.util.Scanner;

public class BibliotecaTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Biblioteca genna = new Biblioteca();
		boolean d = false;
		while (!d)

		{
			System.out.println("Scegliere l'operazione da effettuare:");
			System.out.println("1) aggiungi un utente");
			System.out.println("2) aggiungi un libro");
			System.out.println("3) crea un prestito");
			System.out.println("4) stampa il contenuto della biblioteca");
			System.out.println("5) esci");
			int operazione = in.nextInt();
			if (operazione == 1) {
				System.out.println("Scegliere il nome utente:");
				String a = in.nextLine();
				String nome = in.nextLine();
				System.out.println("Scegliere il cognome utente:");
				String cognome = in.nextLine();
				genna.aggiungiUtente(nome, cognome);
			} else if (operazione == 2) {
				System.out.println("Scegliere il titolo del libro:");
				String a = in.nextLine();
				String titolo = in.nextLine();
				System.out.println("Scegliere il codice del libro:");
				int codice = in.nextInt();
				genna.aggiungiLibro(codice, titolo);
			} else if (operazione == 3) {
				System.out.println("Scegliere il cognome dell'utente che richiede il prestito:");
				String a = in.nextLine();
				String cognome = in.nextLine();
				System.out.println("Scegliere il codice del libro da prestare:");
				int codice = in.nextInt();
				genna.creaPrestito(codice, cognome);
			} else if (operazione == 4) {
				System.out.println("Il contenuto della biblioteca:");
				System.out.println(genna.toString());
			} else if (operazione == 5) {
				d = true;
			}
		}
	}
}