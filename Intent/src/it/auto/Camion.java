package it.auto;

public class Camion extends Veicolo {

    private int numAssi;
    private int incremento;
    private double velocita;

    public Camion (int num, int incremento, String proprietario, int numMatricola, int annoImmatricolazione, 
    		int scadAssicurazione, String targa, int cilindrata, String stato) {
    	super(numMatricola,proprietario, annoImmatricolazione, scadAssicurazione, targa, cilindrata, stato);
	    this.incremento=incremento;
	    velocita=0;
    	numAssi = num;
    }

    public int getAssi() {
	return numAssi;
    }
    public String toString(){
    	return "Proprietario camion: "+getProprietario()
    	+"\nnumero matricola: "+getMatricola()
    	+"\nnumero di assi: "+numAssi
    	+"\nmassima velocita: "+velocita
    	+"\nanno immatricolazione: "+getAnnoImmatricolazione()
        +"\nscadenza Assicurazione: "+getScadAssicurazione()
        +"\ntarga: "+getTarga()
    	+"\ncilindrata: "+getCilindrata()
    	+"\n*******************************";
    }

  
	@Override
	public void accelera() {
		velocita=velocita+incremento/4;
		
	}

	@Override
	public void parti(int velocIniz) {
		 velocita=velocIniz ;		
			}

	
		
	
}