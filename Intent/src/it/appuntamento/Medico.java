package it.appuntamento;

public class Medico extends Persona {
	String specializzazione;
	String qualifica;
	
	public Medico(String nome, String cognome, String cf, String specializzazione, String qualifica){
		super(nome, cognome, cf);
		this.qualifica=qualifica;
		this.specializzazione=specializzazione;
	}
	
	public String toString(){
		return super.getNome()+" "+super.getCognome()+" qualifica: "+qualifica;
	}
	
 
}
