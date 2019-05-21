package it.universityofpadova.facebook;

public class Foto {
	private String titolo;
	private Amici amico;

	/**
	 * Creo un oggetto della classe Foto.
	 * 
	 * @unTitolo Titolo foto.
	 * @unAmico Un oggetto della classe Amico.
	 */
	public Foto(String unTitolo, Amici unAmico) {
		titolo = unTitolo;
		amico = unAmico;
	}

	/**
	 * Cambio l'amico presente in una foto.
	 * 
	 * @param unAmico
	 *            Amico da assegnare ad una foto.
	 */
	public void setAmico(Amici unAmico) {
		amico = unAmico;
	}

	/**
	 * Restituisce il titolo della foto.
	 * 
	 * @return Il titolo della foto.
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * Restituisce l'amico assegnato ad una foto.
	 * 
	 * @return L'amico assegnato alla foto.
	 */
	public Amici getAmico() {
		return amico;
	}
}