package it.forma;

import java.util.ArrayList;
import java.util.Collections;

public class GestioneForme {

	private ArrayList <Forma>forme;
	
	
	public ArrayList<Forma> getForme() {
		return forme;
	}

	public void setForme(ArrayList<Forma> forme) {
		this.forme = forme;
	}

	public GestioneForme (){
		forme=new ArrayList<Forma>();
		}
	

		
	public String cercaArea(double area){
		for (Forma f : forme)
			if(f.area()==area){
				if(f instanceof Cerchio)
				return "L'area cercata corrisponde ad un Cerchio";
				else return "L'area cercata corrisponde ad un Quadrato";}
		return "L'area non corrisponde a nessuna figura";
	}
	
	
	@SuppressWarnings("unchecked")
	public ArrayList<Quadrato> OrdinaLatoMaggioreDiDieci(){
		ArrayList<Quadrato> quadratiOrdinati=new ArrayList<Quadrato>();
		for(Forma f:forme)
			if(f instanceof Quadrato){
				Quadrato q= (Quadrato) f;
				if (q.getLato()>10)
					quadratiOrdinati.add(q);
				Collections.sort(quadratiOrdinati,new ComparaLatoQuadrato());
			}
					
		return quadratiOrdinati ;
		}
		
	@SuppressWarnings("unchecked")
	public Quadrato quadratoAreaMinima(){
		ArrayList <Quadrato> quadrati=new ArrayList <Quadrato>();
		for(Forma f: forme)
			if(f instanceof Quadrato){
				Quadrato qua=(Quadrato)f;
				quadrati.add(qua);
			}
		Quadrato q= Collections.min(quadrati);
		return q;
	}
	
	@SuppressWarnings("unchecked")
	public Cerchio cerchioAreaMassima(){
		ArrayList <Cerchio> cerchi=new ArrayList <Cerchio>();
		for(Forma f: forme)
			if(f instanceof Cerchio){
				Cerchio ce=(Cerchio)f;
				cerchi.add(ce);
			}
		Cerchio c= Collections.max(cerchi);
		return c;
	}

	@SuppressWarnings("unchecked")
	public Quadrato quadratoLatoMinore(){
		/*Attenzione: ComparaLatoQuadrato ordina la lista secondo un ordine
		 * decrescente di lato quadrato quindi quello il quadrato con il lato pi� piccolo
		 * corrisponderà nella realtà al quadrato con il lato più grande e viceversa. Di
		 * conseguenza dovremo andare alla ricerca del max della lista che sicuramente ci 
		 * restituirà il quadrato con il lato più piccolo*/
		ArrayList <Quadrato>quadrati= new ArrayList<Quadrato>();
		for(Forma f: forme)
			if(f instanceof Quadrato){
				Quadrato qua=(Quadrato)f;
				quadrati.add(qua);
			}
		Quadrato q=(Quadrato) Collections.max(quadrati, new ComparaLatoQuadrato());
		return q;
	}
}
