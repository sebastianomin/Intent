package it.universityofpadova.facebook;

public class TagTester {
	public static void main(String[] args) {
		Tag album = new Tag();
		album.aggAmico("Raissa", "Pizzato", 19);
		album.aggAmico("Marco", "Zorzi", 22);
		album.aggAmico("Michele", "Duregon", 27);
		album.aggFoto("Laurea");
		album.aggFoto("Mare");
		album.aggFoto("Scuola");
		album.aggFoto("Audi");
		album.aggTag("Laurea", "Raissa", "Pizzato");
		album.aggTag("Mare", "Michele", "Duregon");
		album.aggTag("Scuola", "Marco", "Zorzi");
		album.aggTag("Audi", "Raissa", "Pizzato");
		System.out.println(album.calcolaEtaMedia());
		System.out.println(album.contaFotoAmico("Raissa", "Pizzato"));
		System.out.println(album.contaFotoAmico("Marco", "Zorzi"));
		System.out.println(album.contaFotoAmico("Michele", "Duregon"));
		System.out.println(album.calcolaMaxApparizioni());
	}
}