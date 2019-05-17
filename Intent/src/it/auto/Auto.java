package it.auto;


public class Auto extends Veicolo {
    private String tipo;
    private int incremento;
    private int velocita;
    
    public Auto (String tipo, int incremento, String proprietario, int numMatricola, int annoImmatricolazione, 
    		int scadAssicurazione, String targa, int cilindrata, String stato){
    	super(numMatricola,proprietario, annoImmatricolazione, scadAssicurazione, targa, cilindrata, stato);
    	this.tipo=tipo;
    	this.incremento=incremento;
    	velocita=0;
    }
    public void setTipo(String mioTipo) {
	tipo = mioTipo;
    }
    public String getTipo() {
	return tipo;
    }
   
   
	@Override
	public String toString() {
		return "Auto" +super.toString()+"[tipo=" + tipo + ", incremento=" + incremento + ", velocita=" + velocita + "]\n";
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
