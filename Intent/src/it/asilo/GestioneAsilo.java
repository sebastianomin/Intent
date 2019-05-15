package it.asilo;


public class GestioneAsilo {
 private String nomeAsilo;
 private String citta;
 private Bambino[] elencoB;
 private Prenotazione[] elencoP;
 private int numBambiniInseriti;
private int numPrenotazioniInserite;
 
	/**
	 * 
	 * @param n il numero massimo di prenotazioni
	 * @param nomeAsilo nome da associare all'asilo
	 * @param citta rappresenta la città dell'asilo
	 */ 
 public GestioneAsilo( String nAsilo, String nCitta, int n ){
	 this.nomeAsilo=nAsilo;
	 this.citta=nCitta;
	 elencoB=new Bambino[n];
	 numBambiniInseriti=0;
	 elencoP =new Prenotazione[n];
	 numPrenotazioniInserite=0;
 }
 
 	/**
	 * @return the bambini
	 */
	public Bambino[] getBambini() {
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
 
 public Bambino modifica_Bambino(Bambino b){
	 
	 for(int i=0; i<this.numBambiniInseriti; i++){
		 if (this.elencoB[i].equals(b)){
			 elencoB[i]= b;
			 return b;
		 }
	 }
	 if(numBambiniInseriti< this.elencoB.length){
		 elencoB[numBambiniInseriti]=b;
		 numBambiniInseriti++;
		}
	 else {
		System.out.println("Impossibile inserire il bambino. limite massimo superato");
	}
	 return null;	 
 }

 /**
	 * 
	 * @param d data
	 * @return array di prenotazioni
	 */
	public Prenotazione[] getPrenotazioni(int Todata){
		Prenotazione[] prenotazioniData= new Prenotazione[numPrenotazioniInserite];
		int inserimenti=0;
		for (int i = 0; i < numPrenotazioniInserite; i++) {
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
	    
		for (int i = 0; i < numBambiniInseriti; i++) {
			Bambino bamb = elencoB[i];
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
		Bambino[] bambiniPrioritari= new Bambino[numBambiniInseriti];
		int inserimenti = 0;
		for (int i = 0; i < numBambiniInseriti; i++) {
			Bambino bamb = elencoB[i];
			if (verificaRequisitoPrioritario(bamb.getCodiceFiscale())) {
				bambiniPrioritari[inserimenti]= bamb;
				inserimenti++;
			}
		}
		return bambiniPrioritari;
	}

	
}
