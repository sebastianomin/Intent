package it.laureati;

public class Relatore {

  private int codiceRelatore;
  private String nome;
  private String cognome;
  private String facolt�;

  public Relatore (int cod, String n, String c, String f) {
	codiceRelatore = cod;
	nome = n;
	cognome = c;
	facolt� = f;
  }

  public int getCodiceRelatore() {
    return codiceRelatore;
  }

  public String getNome() {
    return nome;
  }

  public String getCognome() {
    return cognome;
  }

  public String getFacolt�() {
    return facolt�;
  }
}