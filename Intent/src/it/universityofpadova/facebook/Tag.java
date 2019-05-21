package it.universityofpadova.facebook;

import java.util.Arrays;
import java.util.ArrayList;

public class Tag {
	private ArrayList<Foto> fotografie;
	private Amici[] amici;
	private int numAmici;
	private final int MAX_NUM_AMICI = 200;

	/** Creo un oggetto della classe Tag. */
	public Tag() {
		fotografie = new ArrayList<Foto>();
		amici = new Amici[MAX_NUM_AMICI];
		numAmici = 0;
	}

	/**
	 * Metodo ausiliario che riestituisce l'indice corrispondente all'amico cercato.
	 * 
	 * @param unNome
	 *            Nome dell'amico.
	 * @param unCognome
	 *            Cognome dell'amico.
	 * @return Indice dell'amico.
	 */
	private int cercaAmico(String unNome, String unCognome) {
		int result = -1;
		for (int i = 0; i < numAmici; i++) {
			if (amici[i].getNome().equals(unNome) && amici[i].getCognome().equals(unCognome))
				result = i;
		}
		return result;
	}

	/**
	 * Metodo ausiliario che riestituisce l'indice corrispondente alla foto cercata.
	 * 
	 * @param unTitolo
	 *            Titolo della foto.
	 * @return Indice della foto.
	 */
	private int cercaFoto(String unTitolo) {
		int result = -1;
		for (int i = 0; i < fotografie.size(); i++) {
			if (fotografie.get(i).getTitolo().equals(unTitolo))
				result = i;
		}
		return result;
	}

	/**
	 * Aggiungi un amico all'Array amici.
	 * 
	 * @param unNome
	 *            Nome dell'amico.
	 * @param unCognome
	 *            Cognome dell'amico.
	 * @param unEta
	 *            Età dell'amico.
	 */
	public void aggAmico(String unNome, String unCognome, int unEta) {
		if (cercaAmico(unNome, unCognome) != -1 | numAmici > MAX_NUM_AMICI)
			return;
		if (numAmici < MAX_NUM_AMICI) {
			amici[numAmici] = new Amici(unNome, unCognome, unEta);
			numAmici++;
		}
	}

	/**
	 * Aggiunge una foto all'ArrayList fotografie.
	 * 
	 * @param unTitolo
	 *            Titolo della fotografia.
	 */
	public void aggFoto(String unTitolo) {
		if (cercaFoto(unTitolo) != -1)
			return;
		Foto nuovaFoto = new Foto(unTitolo, null);
		fotografie.add(nuovaFoto);
	}

	/**
	 * Tagga un amico in una foto.
	 * 
	 * @param unTitolo
	 *            Titolo della foto.
	 * @param unNomeAmico
	 *            Nome di un amico.
	 * @param unCognomeAmico
	 *            Cognome di un amico.
	 */
	public void aggTag(String unTitolo, String unNomeAmico, String unCognomeAmico) {
		if (cercaFoto(unTitolo) == -1 || numAmici > MAX_NUM_AMICI)
			return;
		else if (cercaAmico(unNomeAmico, unCognomeAmico) != -1)
			fotografie.get(cercaFoto(unTitolo)).setAmico(amici[cercaAmico(unNomeAmico, unCognomeAmico)]);
		else if (cercaAmico(unNomeAmico, unCognomeAmico) == -1) {
			if (numAmici > MAX_NUM_AMICI)
				return;
			aggAmico(unNomeAmico, unCognomeAmico, -1);
			fotografie.get(cercaFoto(unTitolo)).setAmico(amici[cercaAmico(unNomeAmico, unCognomeAmico)]);
		}
	}

	/**
	 * Rimuove l'amico dall'Array amici e rimuove tutte le foto dove l'amico è
	 * taggato.
	 * 
	 * @param unNomeAmico
	 *            Nome di un amico.
	 * @param unCognomeAmico
	 *            Cognome di un amico.
	 */
	public void rimuoviAmico(String unNomeAmico, String unCognomeAmico) {
		if (cercaAmico(unNomeAmico, unCognomeAmico) == -1)
			return;
		for (int i = fotografie.size() - 1; i > -1; i--) {
			if (fotografie.get(i).getAmico().getNome().equals(unNomeAmico)
					&& fotografie.get(i).getAmico().getCognome().equals(unCognomeAmico))
				fotografie.remove(i);
		}
		amici[cercaAmico(unNomeAmico, unCognomeAmico)] = amici[numAmici - 1];
		numAmici--;
	}

	/**
	 * Restituisce il valore dell'età media degli amici, non tenendo conto di quelli
	 * di cui non si conosce L'età.
	 * 
	 * @return Età media amici.
	 */
	public double calcolaEtaMedia() {
		double etaTotale = 0;
		int cont = 0;
		for (int i = 0; i < numAmici; i++) {
			if (amici[i].getEta() != -1) {
				etaTotale = etaTotale + amici[i].getEta();
				cont++;
			}
		}
		double etaMedia = etaTotale / cont;
		return etaMedia;
	}

	/**
	 * Restituisce il numero di foto in cui appare un amico.
	 * 
	 * @param unNome
	 *            Nome dell'amico.
	 * @param unCognome
	 *            Cognome dell'amico.
	 * @return Numero di foto in cui appare un amico.
	 */
	public int contaFotoAmico(String unNome, String unCognome) {
		int cont = 0;
		if (cercaAmico(unNome, unCognome) == -1)
			return -1;
		for (int i = 0; i < fotografie.size(); i++) {
			if (fotografie.get(i).getAmico().getNome().equals(unNome)
					&& fotografie.get(i).getAmico().getCognome().equals(unCognome))
				cont++;
		}
		return cont;
	}

	/**
	 * Restituisce un oggetto della classe Amici che compare il maggior numero di
	 * volte nelle foto.
	 * 
	 * @return Amico che compare più volte nelle foto.
	 */
	public Amici calcolaMaxApparizioni() {
		int fotoVuota = 0;
		int numMax = 0;
		int numIndex = -1;
		for (int i = 0; i < numAmici; i++) {
			int comparsa = 0;
			for (int j = 0; j < fotografie.size(); j++) {
				if (fotografie.get(j).getAmico() == null)
					fotoVuota++;
				else if (fotografie.get(j).getAmico().getNome().equals(amici[i].getNome()))
					comparsa++;
			}
			if (comparsa > numMax) {
				numMax = comparsa;
				numIndex = i;
			}
		}
		return amici[numIndex];
	}
}
