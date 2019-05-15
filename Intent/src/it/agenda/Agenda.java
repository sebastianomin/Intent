package it.agenda;

import java.util.ArrayList;
import java.util.Collections;


public class Agenda {

   private ArrayList<Impegno> impegni;
   
   public Agenda(){              //costruttore
   	  impegni = new ArrayList<Impegno>();
   }
   
   @SuppressWarnings("unchecked")
public void inserisciAppuntamento(int ora,
   						String argomento,
   						String luogo,
   						int priorita){
   	 
	   Impegno i = new Impegno(argomento,luogo,priorita,ora);
	   impegni.add(i);
	   Collections.sort(impegni);
   }
   
   public Impegno visualizza(int ora){
	   for(Impegno imp: impegni){
		     if(imp.getOra()==ora)
			   return imp;
		   }
	   	    return null;
   }
   public String toString(){
	String agendaCompleta=null;
	   for(Impegno i:impegni){
		   if(impegni.indexOf(i)==0)
			   agendaCompleta="ora: "+i.getOra() +" Argomento: "+i.getArgomento()+" priorita: "+i.getPriorita()+"\n";
		   else
		   agendaCompleta+="ora: "+i.getOra() +" Argomento: "+i.getArgomento()+" priorita: "+i.getPriorita()+"\n";
	   }
		   return agendaCompleta;
   }
   
   }
