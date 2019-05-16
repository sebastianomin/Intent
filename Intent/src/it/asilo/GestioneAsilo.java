package it.asilo;

import java.util.ArrayList;

public class GestioneAsilo {
 private String nomeAsilo;
 private String citta;
 private ArrayList <Bambino> elencoB;
 private Prenotazione[] elencoP;
 private int n;
 
	/**
	 * 
	 * @param n il numero massimo di prenotazioni
	 * @param nomeAsilo nome da associare all'asilo
	 * @param citta rappresenta la città dell'asilo
	 */ 
 public GestioneAsilo( String nAsilo, String nCitta, int n ){
	 this.nomeAsilo=nAsilo;
	 this.citta=nCitta;
	 elencoB=new ArrayList<>(n);
	 elencoP =new Prenotazione[n];
	this.n=n;
 }
 
 	/**
	 * @return the bambini
	 */
	public ArrayList<Bambino> getBambini() {
		return elencoB;
	}

	/**
	 * @return the prenotazioni
	 */
	public Prenotazione[] getPrenotazioni() {
		return elencoP;
	}

	/**
	 * @return the nomeAsilo
	 */
	public String getNomeAsilo() {
		return nomeAsilo;
	}

	/**
	 * @param nomeAsilo the nomeAsilo to set
	 */
	public void setNomeAsilo(String nomeAsilo) {
		this.nomeAsilo = nomeAsilo;
	}

	/**
	 * @return the citta
	 */
	public String getCitta() {
		return citta;
	}

	/**
	 * @param citta the citta to set
	 */
	public void setCitta(String citta) {
		this.citta = citta;
	}

	
	/**
	 * 
	 * @param b bambino da modificare
	 * @return bambino vecchio oppure null
	 */
	public Bambino modificaBambino(Bambino b){
		 
		if(elencoB.size()<n) {
			if(!elencoB.contains(b)) {
				elencoB.add(b);
				return null;
			
			}
		} 
		return b;
	 }
	

 /**
	 * 
	 * @param d data
	 * @return array di prenotazioni
	 */
	public Prenotazione[] getPrenotazioni(int Todata){
		Prenotazione[] prenotazioniData= new Prenotazione[n];
		int inserimenti=0;
		for (int i = 0; i < n; i++) {
			Prenotazione pren=elencoP[i];
			if(pren.getDataPren()< Todata)
			{
				prenotazioniData[inserimenti]= pren;
				inserimenti++;
			}
		}
		return prenotazioniData;
	}
	
	/**
	 * 
	 * @param cf codice fiscale
	 * @return true se il requisito è verificato, false altrimenti
	 */
	public boolean verificaRequisitoPrioritario(String cf){
	    
		for (int i = 0; i < n; i++) {
			Bambino bamb = elencoB.get(i);
			if (bamb.getCodiceFiscale().equalsIgnoreCase(cf)) {
				return bamb.verificaRequisito(citta);
			}
		}
		return false;
	}

  
	/**
	 * 
	 * @return array di bambini che verificano il requisito
	 */
	public Bambino[] getBambiniPrioritati(){
		Bambino[] bambiniPrioritari= new Bambino[n];
		int inserimenti = 0;
		for (int i = 0; i < n; i++) {
			Bambino bamb = elencoB.get(i);
			if (verificaRequisitoPrioritario(bamb.getCodiceFiscale())) {
				bambiniPrioritari[inserimenti]= bamb;
				inserimenti++;
			}
		}
		return bambiniPrioritari;
	}

	
}
