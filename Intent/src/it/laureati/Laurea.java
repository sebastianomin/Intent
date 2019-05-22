package it.laureati;

import java.util.LinkedList;

public class Laurea {

  private String codiceFiscale;
  private int codiceCdL;
  private int voto;
  private boolean lode;
  private Data dataSeduta;
  private String titoloTesi;
  private LinkedList<Integer> codiciRelatori;

  public Laurea (String cf, int codCdL, int v, boolean l,
                 Data d, String t) {
    codiceFiscale = cf;
    codiceCdL = codCdL;
    voto = v;
    lode = l;
    dataSeduta = d;
    titoloTesi = t;
    codiciRelatori = new LinkedList<Integer>();
  }

  public void addCodiceRelatore (int codice) {
    codiciRelatori.add(codice);
  }

  public String getCodiceFiscale() {
    return codiceFiscale;
  }

  public int getCodiceCdL() {
    return codiceCdL;
  }

  public int getVoto() {
    return voto;
  }

  public boolean getLode() {
    return lode;
  }

  public Data getDataSeduta() {
    return dataSeduta;
  }

  public String getTitoloTesi() {
    return titoloTesi;
  }

  public LinkedList<Integer> getCodiciRelatori() {
    return codiciRelatori;
  }

}