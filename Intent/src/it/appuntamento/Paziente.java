package it.appuntamento;

public class Paziente extends Persona {
	String patologia;
	
	public Paziente(String nome, String cognome, String cf, String patologia){
		super (nome, cognome, cf);
		this.patologia=patologia;
	}
	
	public String toString(){
		return " "+super.getNome()+" "+super.getCognome()+"\n"+" Patologia: "+patologia+"\n";
	}

}
