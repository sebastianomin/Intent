package it.laureati;

public class Laureato {

  private String codiceFiscale;
  private String nome;
  private String cognome;
  private Data dataDiNascita;

  public Laureato (String cf, String n, String c, Data d) {
    codiceFiscale = cf;
    nome = n;
    cognome = c;
    dataDiNascita = d;
  }

  public String getCodiceFiscale() {
    return codiceFiscale;
  }

  public String getNome() {
    return nome;
  }

  public String getCognome() {
    return cognome;
  }

  public Data getDataDiNascita() {
    return dataDiNascita;
  }

}