package it.auto;


@SuppressWarnings("unchecked")
public abstract class Veicolo implements Comparable, VeicoloAssicurato{

    private int numMatricola;
    private String proprietario;
    private int annoImmatricolazione;
    private int scadAssicurazione;
    private String targa;
    private int cilindrata;
    private String stato;


    public Veicolo(int numMatricola, String proprietario, int annoImmatricolazione, int scadAssicurazione, 
    		String targa, int cilindrata, String stato) {
	this.numMatricola=numMatricola;
	this.proprietario=proprietario;
	this.annoImmatricolazione=annoImmatricolazione;
	this.scadAssicurazione=scadAssicurazione;
	this.targa=targa;
	this.cilindrata=cilindrata;
	this.stato=	stato;
    }

    public String getProprietario() {
	return proprietario;
    }

    public void setMatricola(int matricola) {
	numMatricola = matricola;
    }

    public int getMatricola() {
	return numMatricola;
    }
    
    public int getAnnoImmatricolazione(){
    	return annoImmatricolazione;
    }
    
    public int getScadAssicurazione(){
    	return scadAssicurazione;
    	}
    
    public String getTarga(){
    	return targa;
    }
    
    public String getStato(){
    	return stato;
    }
    
    public int getCilindrata(){
    	return cilindrata;
    }
    
    
    public int compareTo(Object o) throws ClassCastException {
        	if(o instanceof Veicolo){
        		Veicolo v=(Veicolo)o;
        return this.targa.compareTo(v.getTarga());
        	}
    	    		
    else throw new ClassCastException("il parametro non è un Veicolo");
    }
         
    public abstract void accelera ();
    
    public abstract void parti(int velocIniz);
    
    public boolean isAssicurato(int annoCorrente) {
		if(getScadAssicurazione()>=annoCorrente)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return " [numMatricola=" + numMatricola + ", proprietario=" + proprietario + ", annoImmatricolazione="
				+ annoImmatricolazione + ", scadAssicurazione=" + scadAssicurazione + ", targa=" + targa
				+ ", cilindrata=" + cilindrata + ", stato=" + stato + "]";
	}
    
    
    
   
}  // fine classe Veicolo