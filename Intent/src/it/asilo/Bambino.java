package it.asilo;

import java.time.LocalDate;

public class Bambino extends Persona {

	private Persona padre;
	private Persona madre;
	private double redditofamiliare;
	
	
	public Bambino(Persona padre,Persona madre) {
		this.padre=padre;
		this.madre=madre;
		
	}
	
	
	
	
	public Bambino(String codiceFiscale, LocalDate dataNascita, String cittaResidenza, String occupazione,
			double redditoPercepito, Persona padre, Persona madre, double redditofamiliare) {
		super(codiceFiscale, dataNascita, cittaResidenza, occupazione, redditoPercepito);
		this.padre = padre;
		this.madre = madre;
		this.redditofamiliare = redditofamiliare;
	}

	/**
	 * @return the Padre
	 */
public Persona getPadre(){
		return padre;
	}

	/**
	 * @return the Madre
	 */

	public Persona getMadre(){
		return madre;
	}

	/**
	 * @return the redditoFamiliare
	 */

	public double getRedditoFamiliare(){
		this.redditofamiliare=padre.getRedditoPercepito()+madre.getRedditoPercepito();
		return this.redditofamiliare;
	}


	public void setPadre(Persona padre) {
		this.padre = padre;
	}

	public void setMadre(Persona madre) {
		this.madre = madre;
	}

	public String toString(){
		return super.toString()+ 
		" \n padre:" + padre + 
		"\n madre: " + madre;
	}
	
	public boolean verificaRequisito(String cittaAsilo) {
		if(padre.getOccupazione()!=null&& madre.getOccupazione()!=null && !this.getCittaResidenza().equals(cittaAsilo))
			return true;
		return false;
	}
	// equals utilizza la superclasse
	
}
