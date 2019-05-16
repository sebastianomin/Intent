package it.universityofpadova.biblioteca;

public class Utente {
	private String nome;
	private String cognome;

	/**
	 * Crea un oggetto della classe Utente.
	 * 
	 * @param unNome
	 *            Nome.
	 * @param unCognome
	 *            Cognome.
	 */
	public Utente(String unNome, String unCognome) {
		nome = unNome;
		cognome = unCognome;
	}

	/**
	 * Restituisce il nome dell'utente.
	 * 
	 * @return Nome.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Restituisce il cognome dell'utente.
	 * 
	 * @return Cognome.
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * Restituisce nome e cognome dell'utente.
	 * 
	 * @return Nome e cognome dell'utente.
	 */
	public String toString() {
		return nome + " " + cognome;
	}
}