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
			switch (operazione) {
			case 1:
				System.out.println("Scegliere il nome utente:");
				String a = in.nextLine();
				String nome = in.nextLine();
				System.out.println("Scegliere il cognome utente:");
				String cognome = in.nextLine();
				genna.aggiungiUtente(nome, cognome);
				
				break;
			case 2:
				System.out.println("Scegliere il titolo del libro:");
				String b = in.nextLine();
				String titolo = in.nextLine();
				System.out.println("Scegliere il codice del libro:");
				int codice = in.nextInt();
				genna.aggiungiLibro(codice, titolo);
				
				break;
			case 3:
				System.out.println("Scegliere il cognome dell'utente che richiede il prestito:");
				String c = in.nextLine();
				String cognomeP = in.nextLine();
				System.out.println("Scegliere il codice del libro da prestare:");
				int codiceP = in.nextInt();
				genna.creaPrestito(codiceP, cognomeP);
				
				break;
			case 4:
				System.out.println("Il contenuto della biblioteca:");
				System.out.println(genna.toString());
				
				break;
			case 5:
				System.out.println("******ARRIVEDERCI**************");
				d = true;
				
				break;

			default:
				break;
			}

		}
	}
}