package it.museo;

import java.util.ArrayList;

public class Museo {

		private int codice;
		private String nome;
		private String citta;
		private String regione;
		private String giornoSettimanaleDiChiusura;
		private int numeroDipendenti;
		private double costoBiglietto;
		private ArrayList<Sezione>sezioni;


		public Museo(int cod,String n,String c,String r,String GSC, int ND, double CB){
			codice=cod;
			nome=n;
			citta=c;
			regione=r;
			giornoSettimanaleDiChiusura=GSC;
			numeroDipendenti=ND;
			costoBiglietto=CB;
			sezioni=new ArrayList<Sezione>();


		}
		public Museo() {
			// TODO Auto-generated constructor stub

		}
		//metodo per popolare le sezioni;
		public void addSezione(Sezione s){
			sezioni.add(s);
		}

		public int getCodice(){
			return codice;
		}
		public String getNome(){
			return nome;
		}
		public String getCitta(){
			return citta;
		}
		public String getRegione(){
			return regione;
		}
		public String getGiornoSettimanaleDiChiusura(){
			return giornoSettimanaleDiChiusura;
		}
		public int getNumeroDipendenti(){
			return numeroDipendenti;
		}
		public double getCostoBiglietto(){
			return costoBiglietto;
		}
		public ArrayList<Sezione> getListaSezioni(){
			return sezioni;
		}
		public boolean equals (Object o) {
		  Museo m = (Museo)o;
		  return m.codice == this.codice;
		}
		public String toString(){
			return 	"\ncodice: "+codice+
					"\nNome: "+nome+
					"\nCitta: "+citta+
					"\nRegione: "+regione+
					"\nGiorno di chiususa: "+giornoSettimanaleDiChiusura+
					"\nNumero Dipendenti: "+numeroDipendenti+
					"\nCosto del Biglietto: "+costoBiglietto;
		}

}
