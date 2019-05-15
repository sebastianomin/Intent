package it.agenda;

/* Realizzare un programma che possa gestire un'agenda quotidiana 
- l'agenda contiene una lista di impegni;
- un impegno Ë caratterizzato da un argomento, un luogo, una priorit‡† (1-3) e un orario
Metodi:
- Stampare l'appuntamento di una data ora
- Stampare gli appuntamenti in ordine di orario
*/


public class ProvaAgenda {

  public static void main(String[] args) {
   	Agenda a = new Agenda();
  	
  	a.inserisciAppuntamento(12,"Lezione","Aula 6",1);
  	a.inserisciAppuntamento(10,	"Nuoto", "Piscina", 2);
  	a.inserisciAppuntamento(15, "Caff√®", "Bar", 3);
  	a.inserisciAppuntamento(11, "Tesi", "dipartimento", 2);
  	
 	System.out.println(a.visualizza(12));//stampa l'appuntamento delle ore 12
  	System.out.println(a.visualizza(10));
  	
  	System.out.println(a); //stampa tutta l'agenda in ordine di orario
  
  }
}


