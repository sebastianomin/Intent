package it.museo;

import java.util.*;

public class TestGestioneMusei {
			public static void main(String [] args) {

		GestioneMusei GM=new GestioneMusei();

		Museo m1=new Museo(1,"Museo nazionale d'Abruzzo","L'Aquila","Abruzzo","lunedi",200,15.50);
		Museo m2=new Museo(2,"Museo archeologico provinciale","Potenza","Basilicata","martedi",30,17.50);
		Museo m3=new Museo(3,"Cappella Sansevero","Napoli","Campania","domenica",40,19.50);
		Museo m4=new Museo(4,"Biblioteca comunale dell'Archiginnasio","Bologna","Emilia-Romagna","sabato",30,25.50);
		Museo m5=new Museo(5,"Museo archeologico comunale di Frosinone","Frosinone","Lazio","giovedi",40,5.50);

		Sezione s1=new Sezione("artistico");
		Sezione s2=new Sezione("archeologico");
		Sezione s3=new Sezione("artistico");
		Sezione s4=new Sezione("archeologico");
		Sezione s5=new Sezione("storico");

		m1.addSezione(s1);m1.addSezione(s2);
		m2.addSezione(s3);
		m3.addSezione(s5);m3.addSezione(s4);

		Opera o1=new Opera(1,"Urlo","Munch",new Periodo(200,500));
		Opera o2=new Opera(2,"Abbraccio",null,new Periodo(200,300));
		Opera o3=new Opera(3,"Judith","klimt",new Periodo(100,200));
		Opera o4=new Opera(4,"Il bacio","Picasso",new Periodo(-50,700));
		Opera o5=new Opera(5,"gatto che divora un uccello","Picasso",new Periodo(300,600));

		s1.addOpera(o1);s1.addOpera(o2);
		s2.addOpera(o3);s2.addOpera(o4);
		s3.addOpera(o5);

		ResocontoVisitatori rv1=new ResocontoVisitatori(900,4,2003);
		ResocontoVisitatori rv2=new ResocontoVisitatori(200,2,2006);
		ResocontoVisitatori rv3=new ResocontoVisitatori(600,1,2006);
		ResocontoVisitatori rv4=new ResocontoVisitatori(159,5,2005);
		ResocontoVisitatori rv5=new ResocontoVisitatori(50,6,2006);

		GM.addMuseo(m1);GM.addMuseo(m2);GM.addMuseo(m3);GM.addMuseo(m4);GM.addMuseo(m5);

		GM.addResocontoVisitatori(rv1);GM.addResocontoVisitatori(rv2);GM.addResocontoVisitatori(rv3);
		GM.addResocontoVisitatori(rv4);GM.addResocontoVisitatori(rv5);

		//richiamo  metodi:

		//richiamo primo metodo;
		int a = GM.numeroOpere(1);
		System.out.println(a);

		System.out.println();

		//richiamo secondo metodo;
		LinkedList<Opera> b =GM.opereAnticheRegione("Abruzzo");
		System.out.println(b);

		System.out.println();

		//richiamo terzo metodo;
		LinkedList<Museo>c=GM.museiAutoreGiorno("Picasso","domenica");
		System.out.println(c);

		System.out.println();

		//richiamo quarto metodo;
		int d= GM.museoMaggioreIncasso(2003,2005);
		System.out.println("Museo Maggiore incasso negli anni compresi tra il 2003 e il 2005, codiceMuseo:"+d);

		System.out.println();

		//richiamo quinto metodo;
		ArrayList<String>f=GM.cittaConPiuDipendenti(50);
		System.out.println("Lista delle città con piu' di 50 dipendenti"+f);

	  }//chiudo main

	}//chiudo class
