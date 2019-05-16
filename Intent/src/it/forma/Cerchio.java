package it.forma;

@SuppressWarnings("unchecked")
class Cerchio extends Forma implements Comparable {

    private double raggio;
    private double area;
    private double perimetro;

    public Cerchio(double raggio) {
       this.raggio = raggio;
       area=0;
       perimetro=0;
    }
    
    public double getRaggio() {
        return raggio;
    }
    public double area() {
        area= raggio*raggio*Math.PI;
        return area;
    }
    @Override
	public double perimetro() {
		perimetro= 2*Math.PI*raggio;
		return perimetro;
	}
	@Override
	public int compareTo(Object o) throws ClassCastException {
		if(o instanceof Cerchio){
			Cerchio c=(Cerchio) o;
			if(this.area() == c.area())
				return 0;
			if (this.area()>c.area())	
				return 1;
		return -1;
		}
		else throw new ClassCastException("Il parametro del metodo compareTo non è un Cerchio!");
		}
	public String toString(){
		return "Il raggio e': "+raggio+" L'area e': "+area;
	}

	
}
