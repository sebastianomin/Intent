package it.museo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class GestioneMusei {

	private ArrayList<Museo> musei;
	private LinkedList<ResocontoVisitatori> resocontiVisitatori;

	public GestioneMusei(){
		musei = new ArrayList <Museo>();
		resocontiVisitatori = new LinkedList<ResocontoVisitatori>();
	}

	//metodo per popolare i musei;
	public void addMuseo(Museo m){
		musei.add(m);
	}

	//metodo per popolare i resocontiVisitatori;
	public void addResocontoVisitatori(ResocontoVisitatori RV){
		resocontiVisitatori.add(RV);
	}

	//seguono i metodi richiesti:

	//primo metodo:
	public int numeroOpere(int c) {
		int totaleOpere=0;
		boolean museoTrovato=false;
		for(Museo m:musei){
		  if(m.getCodice()==c){
				 museoTrovato=true;
				 ArrayList<Sezione> sezioni = m.getListaSezioni();
				for(Sezione s:sezioni){
					LinkedList<Opera> opere = s.getListaOpere();
					totaleOpere += opere.size();
				  }
		  }
		}
	if(!museoTrovato)
		System.out.print("nessun museo presente con il codice indicato");
	return totaleOpere;
	}


	//secondo metodo:
	public LinkedList<Opera> opereAnticheRegione(String r) {
		LinkedList<Opera> ris = new LinkedList<Opera>();
		for( Museo m:musei){
			if(m.getRegione().equals(r)){
				ArrayList<Sezione> sezioni = m.getListaSezioni();
				for(Sezione s:sezioni){
					LinkedList<Opera> opere = s.getListaOpere();
					ListIterator<Opera> iter = opere.listIterator();
					while(iter.hasNext()){
						Opera op = iter.next();
						Periodo p = op.getPeriodo();
						if(p.getAnnoFine() < 500){
							ris.add(op);
						}
					}
				}
			}
		}
		return ris;
	}



	//terzo metodo:
	public LinkedList<Museo>museiAutoreGiorno(String a, String g){
		LinkedList<Museo> ris = new LinkedList<Museo>();
		for(Museo m:musei){
			if(!m.getGiornoSettimanaleDiChiusura().equals(g)){
				ArrayList<Sezione> sezioni = m.getListaSezioni();
				for(Sezione s:sezioni){
					if (!s.listaOperePerAutore(a).isEmpty() &&!ris.contains(m)) 
						ris.add(m);
				}
			}
		}
		return ris;
	}

	private int calcolaVisitatori(Museo m, int da, int a){
		int totaleV=0;
		for(ResocontoVisitatori v: resocontiVisitatori){
		if(v.getCodiceMuseo()== m.getCodice() && v.getAnno()>=da && v.getAnno()<=a )
			totaleV +=v.getNumeroVisitatori();
		}	
		return totaleV;
	}
	


	//quarto metodo:
	public int museoMaggioreIncasso(int da, int a){
		Museo mtemp= new Museo(); 
		double incassoMaggiore=0;
		for(Museo m:musei) {
			double incassoMuseo = m.getCostoBiglietto()*calcolaVisitatori(m,da,a);
			if(incassoMuseo>incassoMaggiore){
				incassoMaggiore=incassoMuseo;
				mtemp=m;
			}
		}
		return mtemp.getCodice();
	}


	//quinto metodo;
	public ArrayList<String> cittaConPiuDipendenti(int k) {
		ArrayList<String> temp = new ArrayList<String>();
		for(Museo m:musei){
			int contaDipendenti=m.getNumeroDipendenti();
			if(!temp.contains(m.getCitta())){
				//verifico la  condizione su k
				ListIterator it=musei.listIterator();
				// considero anche i dipendenti degli altri musei che si trovano nella stessa città in cui è ubicato "m"
				while(it.hasNext()){
				Museo m2= (Museo)it.next();
				if(!m2.equals(m) && m2.getCitta().equalsIgnoreCase(m.getCitta()))
					contaDipendenti +=m2.getNumeroDipendenti();
				}
			if(contaDipendenti>k){
				temp.add(m.getCitta());
			}
		}
		}
		return temp;
	}
}