package it.agenda;

@SuppressWarnings("unchecked")

class Impegno implements Comparable {

	  private String argomento;
	  private String luogo;
	  private int priorita;
	  private int ora;

	  public Impegno(String argomento, String luogo, int priorita, int ora) {
	    this.argomento = argomento;
	    this.luogo = luogo;
	    this.priorita = priorita;
	    this.ora=ora;
	  }
	  
	  public int getPriorita(){
		  return priorita;
	  }
	  
	  public String getLuogo(){
		  return luogo;
	  }
	  
	  public String getArgomento(){
		  return argomento;
	  }
	
	  public int getOra(){
		  return ora;
	  }
	  
	  public String toString() {
	    return argomento + " (" + luogo + ") - " + priorita;
	  }

	@Override
	public int compareTo(Object o) throws ClassCastException {
		if(o instanceof Impegno){
			Impegno i=(Impegno) o;
			if(this.ora== i.getOra())
				return 0;
			if (this.ora > i.getOra())	
				return 1;
			return -1;
		}
		else throw new ClassCastException("Il parametro del metodo compareTo non è un Impegno!");
}

}