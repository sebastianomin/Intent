package it.asilo;

import java.time.LocalDate;

public class Test {
	
	public static void main(String[] args) {
		
		GestioneAsilo ga=new GestioneAsilo("Giotto", "Milano", 11);
		LocalDate d1=LocalDate.of(2019, 1, 1);
		Persona padre1=new Persona("mnhhsgsgs",d1 , "Roma", "Ing", 44000);
		Persona madre1=new Persona("mnhhsgsgs",d1 , "Roma", "Ing", 44000);
		Bambino b1=new Bambino(padre1, madre1);
	    Bambino b=	ga.modificaBambino(b1);
		System.out.println(b);
		
	}

}
