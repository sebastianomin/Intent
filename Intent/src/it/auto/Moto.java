package it.auto;



public class Moto extends Veicolo {

    private int numPosti;
    private int incremento;
    private double velocita;

    public Moto (int numPt, String proprietario, int numMatricola, int annoImmatricolazione, 
    		int scadAssicurazione, String targa, int cilindrata, String stato) {
	    super(numMatricola,proprietario, annoImmatricolazione, scadAssicurazione, targa, cilindrata, stato);
    	numPosti = numPt;
        incremento=2;
	    velocita=0;
    }

   	public int getNumPosti() {
	return numPosti;
    }
    public String toString(){
    	return "Proprietario moto: "+getProprietario()
    	+"\nnumero matricola: "+getMatricola()
    	+"\nnumero di posti: "+numPosti
    	+"\nmassima velocita: "+velocita
    	+"\nanno immatricolazione: "+getAnnoImmatricolazione()
    	+"\nscadenza Assicurazione: "+getScadAssicurazione()
    	+"\ntarga: "+getTarga()
    	+"\ncilindrata: "+getCilindrata()
    	+"\n*******************************";
    }
        
	@Override
	public void accelera() {
		velocita=velocita+incremento;
		
	}

	

	@Override
	public void parti(int velocIniz) {
		 velocita=velocIniz ;		
		
	}
	

}