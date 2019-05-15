package it.asilo;

import java.time.LocalDate;

public class Persona {

	private String codiceFiscale;
	private LocalDate dataNascita;
	private String cittaResidenza;
	private String occupazione;
	private double redditoPercepito;
	
	public Persona(){
		
	}

	public Persona(String codiceFiscale, LocalDate dataNascita, String cittaResidenza, String occupazione,
			double redditoPercepito) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.dataNascita = dataNascita;
		this.cittaResidenza = cittaResidenza;
		this.occupazione = occupazione;
		this.redditoPercepito = redditoPercepito;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getCittaResidenza() {
		return cittaResidenza;
	}

	public void setCittaResidenza(String cittaResidenza) {
		this.cittaResidenza = cittaResidenza;
	}

	public String getOccupazione() {
		return occupazione;
	}

	public void setOccupazione(String occupazione) {
		this.occupazione = occupazione;
	}

	public double getRedditoPercepito() {
		return redditoPercepito;
	}

	public void setRedditoPercepito(double redditoPercepito) {
		this.redditoPercepito = redditoPercepito;
	}

	@Override
	public String toString() {
		return "Persona [codiceFiscale=" + codiceFiscale + ", dataNascita=" + dataNascita + ", cittaResidenza="
				+ cittaResidenza + ", occupazione=" + occupazione + ", redditoPercepito=" + redditoPercepito + "]";
	}

	public boolean equals(Object o) {
		if (o instanceof Persona) {
			Persona p = (Persona) o;
			return this.codiceFiscale.equals(p.codiceFiscale);
		}
		return false;
	}

	public boolean isOccupato() {
		return this.getOccupazione() != null;

	}

}
