package it.laureati;

public class Data {

  private int giorno;
  private int mese;
  private int anno;

  public Data (int g, int m, int a) {
    giorno = g;
    mese = m;
    anno = a;
  }

  public int getGiorno () {
    return giorno;
  }

  public int getMese () {
    return mese;
  }

  public int getAnno () {
    return anno;
  }
}