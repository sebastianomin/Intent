package it.laureati;

import java.util.LinkedList;
import java.util.ListIterator;

public class ProvaBancaDati {

  public static void main (String args[]) {

    BancaDati b = new BancaDati();

    CorsoDiLaurea c1 = new CorsoDiLaurea(100, "Ingegneria Gestionale", false);
    CorsoDiLaurea c2 = new CorsoDiLaurea(250, "Ingegneria Gestionale", true);
    CorsoDiLaurea c3 = new CorsoDiLaurea(120, "Ingegneria Informatica", false);
    CorsoDiLaurea c4 = new CorsoDiLaurea(230, "Ingegneria Informatica", true);

    Relatore r1 = new Relatore(10, "Mario", "Rossi", "Ingegneria");
    Relatore r2 = new Relatore(11, "Giuseppe", "Verdi", "Ingegneria");
    Relatore r3 = new Relatore(12, "Ugo", "Bianchi", null);

    Laureato l1 = new Laureato("XYZ001", "Maria", "Neri", new Data(3,5,1985));
    Laureato l2 = new Laureato("PQR999", "Giulio", "Cesare", new Data(4,12,1977));

    Laurea laurea1 = new Laurea("XYZ001", 100, 110, false, new Data(15,12,2002), "La programmazione orientata agli oggetti");
    laurea1.addCodiceRelatore(10);
    laurea1.addCodiceRelatore(12);

    Laurea laurea2 = new Laurea("XYZ001", 250, 110, true, new Data(11,9,2005), "Architetture orientate ai servizi");
    laurea2.addCodiceRelatore(11);

    Laurea laurea3 = new Laurea("PQR999", 120, 105, false, new Data(15,5,2002), "Sistemi Peer-to-Peer");
    laurea3.addCodiceRelatore(10);

    // aggiungere altri dati per esercizio...

    b.addLaureato(l1); b.addLaureato(l2);

    b.addCorsoDiLaurea(c1); b.addCorsoDiLaurea(c2); b.addCorsoDiLaurea(c3); b.addCorsoDiLaurea(c4);

    b.addRelatore(r1); b.addRelatore(r2); b.addRelatore(r3);

    b.addLaurea(laurea1); b.addLaurea(laurea2); b.addLaurea(laurea3);

    int numeroLauree = b.numeroLaureati(2002, "Ingegneria Gestionale");

    System.out.println("Numero lauree = "+numeroLauree);

    // provare gli altri metodi...

  }

}