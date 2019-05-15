package it.asilo;


public class Prenotazione {

	private String codiceFisc;
	private int dataPrenotaz;
	
	public Prenotazione( String CF, int data){
		this.codiceFisc= CF;
		this.dataPrenotaz=data;
	}
	
 // metodi get 
	
	public String getCodiceFiscale(){
		return this.codiceFisc;
	}

	public int getDataPren(){
		return this.dataPrenotaz;
		
	}

//	metodi set
	
	public void setCodiceFiscale( String CF){
		 this.codiceFisc= CF;
	}

	public void setDataPren( int data){
		 this.dataPrenotaz=data;
		
	}

	// costruttore di copia profonda
	// toString 
	
//equals
	 public boolean equals (Object o){
		 if( o instanceof Prenotazione){
			 Prenotazione p = (Prenotazione)o;
			 return this.codiceFisc.equals(p.codiceFisc) && this.dataPrenotaz == p.dataPrenotaz;
		 }	
		 return false;
	 }
	
}
