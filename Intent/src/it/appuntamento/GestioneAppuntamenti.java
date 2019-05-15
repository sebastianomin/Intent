package it.appuntamento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;


public class GestioneAppuntamenti {
	private ArrayList<Paziente> pazienti;
	private ArrayList<Stanza> stanze;
	private ArrayList<Appuntamento> appuntamenti;
	private ArrayList<Medico>medici;
	
	
	public GestioneAppuntamenti(ArrayList<Paziente> pazienti, ArrayList<Stanza> stanze,
			ArrayList<Appuntamento> appuntamenti, ArrayList<Medico> medici) {
		super();
		this.pazienti = pazienti;
		this.stanze = stanze;
		this.appuntamenti = appuntamenti;
		this.medici = medici;
	}


	
	public Persona cercaPersona(String cf){
		for(Paziente p: pazienti){
			if(p.getCf()==cf)
				return p;
		}
		for(Medico m: medici){
			if(m.getCf()==cf)
				return m;
		}
		return null;
	}

	

	@SuppressWarnings("unchecked")
	public ArrayList<Appuntamento> appuntamentiStanza(Stanza s, LocalDate data){
		ArrayList<Appuntamento>appuntamentiStanza=new ArrayList<Appuntamento>();		
		for(Appuntamento a: appuntamenti){
					if(a.getStanza().equals(s) && data.equals(a.getData())){
						appuntamentiStanza.add(a);
						Collections.sort(appuntamentiStanza);
					}
				}
		return appuntamentiStanza;
			}
				
	
	public ArrayList <Appuntamento> appuntamentiMedico(Medico m){
		ArrayList <Appuntamento> appuntMedico=new ArrayList<Appuntamento>();
		for(Appuntamento a: appuntamenti){
			if(a.getMedico().equals(m)){
				appuntMedico.add(a);
			}
		}
		return appuntMedico;
	}
	
	public Medico medicoPiuAppuntamenti(LocalDate data){
	    Medico med=null; int piuApp=0; int appuntamentiTotali=0;
		for(Medico m: medici){
			for (Appuntamento app: appuntamenti){
				if(app.getMedico().getCf().equals(m.getCf()) && data.equals(app.getData()))
					appuntamentiTotali++;
			}if(appuntamentiTotali>piuApp){
				med=m;
				piuApp=appuntamentiTotali;
				appuntamentiTotali=0;
				}
		}return med;
	}
	
	public String toString(){
		String app=null;
		for(Appuntamento a:appuntamenti){
			if(appuntamenti.indexOf(a)==0)
				app="Ora:"+a.getOra()+" Data: "+a.getData()+" Paziente: "+a.getPaziente()+" Stanza "+a.getStanza()+" Medico: "+a.getMedico()+"\n";
			else
				app+="Ora:"+a.getOra()+" Data: "+a.getData()+" Paziente: "+a.getPaziente()+" Stanza "+a.getStanza()+" Medico: "+a.getMedico()+"\n";
				}
		return app;
	} 
	
}
