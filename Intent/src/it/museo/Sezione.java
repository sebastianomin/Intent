package it.museo;

import java.util.LinkedList;

public class Sezione {

		private String nome;
		private LinkedList<Opera>opere;

		public Sezione(String n){
			nome=n;
			opere=new LinkedList<Opera>();
		}

		//metodo per popolare le opere;
		public void addOpera(Opera o){
			opere.add(o);
		}

		public String getNome(){
			return nome;
		}

		public LinkedList<Opera> getListaOpere(){
			return opere;
		}
		
		// restituisce tutte le opere dell'autore a per quella sezione
		public LinkedList<Opera> listaOperePerAutore(String a){
			LinkedList op=new LinkedList();
			for(Opera o:opere)
				if(o.getAutore()!=null && o.getAutore().equals(a))
					op.add(o);
			return op;
		}

//equals e toString
		}
