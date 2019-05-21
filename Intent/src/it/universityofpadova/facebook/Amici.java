package it.universityofpadova.facebook;

public class Amici {
	private String nome;
	private String cognome;
	private int eta;

	/** Creo un oggetto della classe Amici. */
	public Amici(String unNome, String unCognome, int unEta) {
		nome = unNome;
		cognome = unCognome;
		eta = unEta;
	}

	/**
	 * Restituisce il nome dell'amico.
	 * 
	 * @return Nome dell'amico.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Restituisce il cognome dell'amico.
	 * 
	 * @return Cognome dell'amico.
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * Restituisce l'età dell'amico.
	 * 
	 * @return Età dell'amico.
	 */
	public int getEta() {
		return eta;
	}
}