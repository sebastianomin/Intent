package it.auto;

public class TestVeicolo {

    public static void main(String[] arg) {
    
    GestioneVeicoli gest=new GestioneVeicoli();
    
    Veicolo a=new Auto("sportiva",5,"pippo",123,1990,2009,"aa 207 bb ",1500,"disponibile");
	 a.parti(1);
	 a.accelera();
	 gest.inserisciVeicolo(a);
	 
	Veicolo a1=new Auto("lusso",5,"pluto",456,1988,2008,"dd 100 aa",1200,"inConsegna");
	 a1.parti(2);
	 a1.accelera();
	 gest.inserisciVeicolo(a1);
	 
	Veicolo a2=new Auto("utilitaria",5,"paperino",789,2001,2009,"ac 090 fm",2000,"venduta");
	 a2.parti(3);
	 a2.accelera();
	 gest.inserisciVeicolo(a2);
	
	Veicolo c = new Camion(3,2,"tizio",136,2003,2007,"bc 150 zc",1400,"disponibile");
	 c.parti(4);
	 c.accelera();
	 gest.inserisciVeicolo(c);
	 
	Veicolo m =new Moto(2,"caio",246,2004,2010,"az 190 bc",2100,"inConsegna");
	 m.parti(5);
	 m.accelera();
	 gest.inserisciVeicolo(m);
	
	 System.out.println("Lista veicoli ordinati per cilindrata");
	 System.out.println(gest.OrdinaVeicoliCilindrata());
	 System.out.println("/////////////////////////////////////");
	 
	 System.out.println("Lista auto disponibii ordinata per tipo");
	 System.out.println(gest.autoDisponibili());
	 System.out.println("/////////////////////////////////////");
	 
	 System.out.println("Lista veicoli ordinati per targa");
	 System.out.println(gest.VeicoliOrdinatiTarga());
	 System.out.println("/////////////////////////////////////");
	 
	 System.out.println("Veicolo con la targa più grande");
	 System.out.println(gest.veicoloTargaMax());
	 System.out.println("/////////////////////////////////////");
	
	 System.out.println("Veicolo con la cilindrata minima");
	 System.out.println(gest.veicoloCilindrataMin());
	 System.out.println("/////////////////////////////////////");

	 System.out.println("Lista di auto in ordine decrescente di immatricolazione");
	 System.out.println(gest.autoOrdineImmatricolazione());
	 
	 System.out.println("Lista dei veicoli assicurati");
	 System.out.println(gest.veicoliAssicurati(2008));
    }

}
