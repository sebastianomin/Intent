package it.appuntamento;

import java.time.LocalDate;

public class Appuntamento implements Comparable{
	private Paziente paziente;
	private Medico medico;
	private Stanza stanza;
    private LocalDate data;
	private int ora;
	
  public Appuntamento(Paziente p1, Medico m, Stanza s1, LocalDate data, int ora) {
  	paziente = p1;
  	medico=m;
  	stanza = s1;
  	 this.data=data;
  	 this.ora=ora;
  	  }

  public Medico getMedico() {
    return medico;
  }
  
  public Paziente getPaziente(){
	  return paziente;
  }

  public Stanza getStanza() {
    return stanza;
   
  }
  public int getOra() {
	    return ora;}
	    
  public LocalDate getData() {
	    return data ;}
  
  public String toString() {
	  return "Ora:"+ora+" "+paziente.toString()+" Stanza:"+stanza.getNome()+"\n"+" Medico: "+medico.toString();
  }

@Override
public int compareTo(Object o) throws ClassCastException {
	if(o instanceof Appuntamento){
		Appuntamento a=(Appuntamento) o;
		if(this.ora== a.getOra())
			return 0;
		if (this.ora>a.getOra())	
			return 1;
	
	return -1;
	}
	else throw new ClassCastException("Il parametro del metodo compareTo non è un Appuntamento!");
	}


}
