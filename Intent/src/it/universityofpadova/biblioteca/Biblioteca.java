package it.universityofpadova.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> libri;
	private ArrayList<Utente> utenti;

	/** Costruisce un oggetto della classe Biblioteca. */
	public Biblioteca() {
		utenti = new ArrayList<Utente>();
		libri = new ArrayList<Libro>();
	}

	/**
	 * Metodi Ausiliari. Cerca un codice.
	 * 
	 * @param unCodice
	 *            Codice da cercare.
	 * @return Indice del codice.
	 */
	private int cercaCodice(int unCodice) {
		int result = -1;
		for (int i = 0; i < libri.size(); i++) {
			if (libri.get(i).getCodice() == unCodice)
				result = i;
		}
		return result;
	}

	/**
	 * Cerca un utente.
	 * 
	 * @param unCognome
	 *            Cognome dell'utente da cercare.
	 * @return Indice dell'utente.
	 */
	
	private int cercaUtente(String unCognome) {
		int result = -1;
		for (Utente u : utenti) {
			if(u.getCognome().equals(unCognome)) {
				result = utenti.indexOf(u);
			}
		}
		
		return result;
	}


	/**
	 * Metodi richiesti. Aggiunge un utente alla biblioteca.
	 * 
	 * @param unNome
	 *            Nome.
	 * @param unCognome
	 *            Cognome.
	 */
	public void aggiungiUtente(String unNome, String unCognome) {
		boolean esisteCognome = false;
		for (Utente u : utenti) {
			if (u.getCognome().equals(unCognome)) {
				esisteCognome = true;
				System.out.println("L'utente: " + unCognome + " esiste già");
				return;
			}
		}
		if (!esisteCognome) {
			Utente a = new Utente(unNome, unCognome);
			utenti.add(a);
		}

	}


	/**
	 * Aggiunge un libro alla biblioteca.
	 * 
	 * @param unCodice
	 *            Codice.
	 * @param unTitolo
	 *            Titolo.
	 */
	
	public void aggiungiLibro(int unCodice, String unTitolo) {
		boolean esisteLibro = false;
		for (Libro l : libri) {
			if (l.getCodice()==unCodice) {
				esisteLibro = true;
				System.out.println("Il Libro con codice: " + unCodice + " esiste già");
				return;
			}
		}
		if (!esisteLibro) {
			Libro l = new Libro(unCodice, unTitolo);
			libri.add(l);
		}
		
	}
	

	/**
	 * Crea un prestito, assegnando un libro a un utente.
	 * 
	 * @param unCodice
	 *            Codice.
	 * @unCognome Cognome.
	 */
	
	public void creaPrestito(int unCodice, String unCognome) {
		Utente utenteDaAssegnare = null;
		for (Utente u : utenti) {
			if (u.getCognome().equals(unCognome)) {
				utenteDaAssegnare = u;
			}

		}
		for (Libro libro : libri) {
			if (libro.getCodice() == unCodice && libro.getUtenteAssegnato() == null) {
				libro.setUtenteAssegnato(utenteDaAssegnare);

			}

		}
		libri.get(cercaCodice(unCodice)).setUtenteAssegnato(utenti.get(cercaUtente(unCognome)));
	}
	


	/**
	 * Restituisce il contenuto degli ArrayList.
	 * 
	 * @return Situazione biblioteca.
	 */
	public String toString() {
		String r = "";
		r = "Libri=" + libri + " Utenti=" + utenti;
		return r;
	}
}