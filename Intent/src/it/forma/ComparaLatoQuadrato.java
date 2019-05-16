package it.forma;

import java.util.Comparator;

@SuppressWarnings("unchecked")
public class ComparaLatoQuadrato implements Comparator {

	//ordine decrescente
	
	@Override
	public int compare(Object arg0, Object arg1) {
		Quadrato q1=(Quadrato)arg0;
		Quadrato q2=(Quadrato)arg1;
		if (q1.getLato()>q2.getLato())
			return -1;
		if(q1.getLato()<q2.getLato())
			return 1;
		return 0;
	}
	
}
