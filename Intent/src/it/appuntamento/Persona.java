package it.appuntamento;

public class Persona {
  private String nome;
  private String cognome;
  private String cf;
  
	public Persona(String nome, String cognome, String cf){
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
		
	}
	public Persona(String cf){
		this.cf = cf;
			}
	public Persona (){};
  
	public String getCf() {
    return cf;
  }

  public String getCognome() {
    return cognome;
  }

  public String getNome() {
    return nome;
  }
  
  public String toString(){
	  return nome+" "+cognome;
  }
  
  public boolean equals(Object o){
	  return this.cf.equals(((Persona)o).getCf());
  }
}
