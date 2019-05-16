package it.forma;

@SuppressWarnings("unchecked")
class Quadrato extends Forma implements Comparable{
    
	private double lato;
    private double area;
    private double perimetro;

    public Quadrato(double lato) {
        this.lato = lato;
        area=0;
        perimetro=0;
    }
    
    public double getLato(){
    	return lato;
    }
    
    public double area() {
        area= lato*lato;
        return area;
    }

	@Override
	public double perimetro() {
		perimetro=lato*4;
		return perimetro;
		}
	
	public String toString(){
		return  "Il lato e': "+lato+" L'area e': "+area+"\n";
	}

	@Override
	public int compareTo(Object o) throws ClassCastException {
		if(o instanceof Quadrato){
			Quadrato q=(Quadrato) o;
			if(this.area() == q.area())
				return 0;
			if (this.area()>q.area())	
				return 1;
		return -1;
		}
		else throw new ClassCastException("Il parametro del metodo compareTo non è un Cerchio!");
		}
}
