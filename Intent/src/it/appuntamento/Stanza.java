package it.appuntamento;

public class Stanza {

  private String nome;
  public Stanza(String string) {
  	nome = string;
  }
  public String getNome() {
    return nome;
  }
  
  public String toString(){
	  return nome;
  }
  
  public boolean equals(Object o){
	  return this.nome.equals(((Stanza)o).getNome());
  }

}

