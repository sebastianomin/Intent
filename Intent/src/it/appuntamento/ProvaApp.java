package it.appuntamento;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProvaApp {

	public static void main(String[] args) {

		ArrayList<Paziente> pazienti = new ArrayList<>();
		ArrayList<Stanza> stanze = new ArrayList<>();
		ArrayList<Appuntamento> a = new ArrayList<>();
		ArrayList<Medico> medici = new ArrayList<>();

		Medico m1 = new Medico("Giovanni", "Bianchi", "GVIBCH123213", "Chirurgia", "primario");
		Medico m2 = new Medico("Paolo", "Rossi", "RSSPLO123213", "Nefrologia", "assistente");
		medici.add(m1);
		medici.add(m2);

		Paziente p1 = new Paziente("Francesco", "Verdi", "FRCVRD1234", "Calcoli");
		Paziente p2 = new Paziente("Marco", "Frate", "MRCFRT4567", "ciste");
		Paziente p3 = new Paziente("Ferdinando", "Colombo", "FRDCLB7890", "febbre");

		pazienti.add(p1);
		pazienti.add(p2);
		pazienti.add(p3);

		Stanza s1 = new Stanza("A6");
		Stanza s2 = new Stanza("B2");
		stanze.add(s1);
		stanze.add(s2);

		Appuntamento a1 = new Appuntamento(p1, m2, s1, LocalDate.of(2017, 1, 22), 15);
		a.add(a1);

		Appuntamento a2 = new Appuntamento(p2, m2, s1, LocalDate.of(2017, 1, 22), 13);
		a.add(a2);

		Appuntamento a3 = new Appuntamento(p1, m1, s2, LocalDate.of(2017, 1, 22), 14);
		a.add(a3);
		Appuntamento a4 = new Appuntamento(p3, m1, s2, LocalDate.of(2017, 1, 22), 17);
		a.add(a4);
		GestioneAppuntamenti GestApp = new GestioneAppuntamenti(pazienti, stanze, a, medici);

		// richiama il metodi che dato il cf restituisce la persona corrispondente
		Persona p = GestApp.cercaPersona("RSSPLO123213");
		System.out.println(p.getCognome() + p.getNome());

		System.out.println("");

		/*
		 * richiama il metodo che resttuisce tutti gli appuntamenti per una determinata
		 * stanza in un determinato giorno
		 */
		ArrayList<Appuntamento> appuntamenti = GestApp.appuntamentiStanza(s1, LocalDate.of(2017, 1, 22));
		for (Appuntamento app : appuntamenti) {
			System.out.println("Gli appuntamenti per la stanza " + s1 + "\n" + app);
		}

		System.out.println("");

		// richiama il metodo che restituisce la lista di tutti gli appuntamenti per un
		// medico
		ArrayList<Appuntamento> appunMedico = GestApp.appuntamentiMedico(m1);
		System.out.println("Gli appuntamenti per il medico " + m1 + " sono: ");
		for (Appuntamento apps : appunMedico) {
			System.out.println(
					"Data " + apps.getData() + " ora: " + apps.getOra() + "\n" + "Paziente: " + apps.getPaziente());
		}

		// Medico con più Appuntamenti in un dato giorno
		Medico med = GestApp.medicoPiuAppuntamenti(LocalDate.of(2017, 1, 22));
		System.out.println(med);

		System.out.println("OK");
	}

}