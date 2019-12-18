package Stub;

import java.util.ArrayList;
import java.util.Random;

import Entity.Appello;
import Entity.Corso;
import Entity.Data;
import Entity.EsitoAppello;
import Entity.Studente;

public class StubBuilder {

	public static ArrayList<Entity.Corso> corsi = new ArrayList<Entity.Corso>();
	public static ArrayList<Entity.Studente> studenti = new ArrayList<Entity.Studente>();
	public static ArrayList<Entity.Appello> appelli =  new ArrayList<Entity.Appello>();
	public static ArrayList<Entity.EsitoAppello> esiti = new ArrayList<Entity.EsitoAppello>();

	private static void buildStubs_corsi() {
		Corso c1 = new Corso(101, "IS",	"Russo", "9");
		Corso c2 = new Corso(102, "AM1", "Fusco", "9");
		Corso c3 = new Corso(103, "FG1", "Andreone", "6");
		corsi.add(c1);
		corsi.add(c2);
		corsi.add(c3);
	};

	private static void buildStubs_appelli() {
		int id = 20;
		Data dataAppello1 = new Data("10/01/20", "Agnano", "T3", null, "Scritto");
		Data dataAppello2 = new Data("12/02/20", "Fuorigrotta", "I4", null, "Orale");
		Data dataAppello3 = new Data("4/03/20", "Tecchio", null, "Lab1", "Calcolatore");
		Data dataAppello4 = new Data("14/03/20", "Tecchio", null, "Lab1", "Calcolatore");
		Data dataAppello5 = new Data("22/04/20", "MSA", "C3", null, "Scritto");

		Appello a1 = new Appello(++id, corsi.get(0), dataAppello1, build_listaPrenotati());
		Appello a2 = new Appello(++id, corsi.get(0), dataAppello2, build_listaPrenotati());
		Appello a3 = new Appello(++id, corsi.get(0), dataAppello3, build_listaPrenotati());
		Appello a4 = new Appello(++id, corsi.get(1), dataAppello4, build_listaPrenotati());
		Appello a5 = new Appello(++id, corsi.get(2), dataAppello5, build_listaPrenotati());
		appelli.add(a1);
		appelli.add(a2);
		appelli.add(a3);
		appelli.add(a4);
		appelli.add(a5);
	};

	private static void buildStubs_studenti() {
		ArrayList<EsitoAppello> esiti = new ArrayList<EsitoAppello>();
		Random r =new Random();
		esiti.add(new EsitoAppello(r.nextInt(30) + 18, "ListArgomenti...blabla", true, true, appelli.get(0)));
		esiti.add(new EsitoAppello(r.nextInt(30) + 18, "ListArgomenti...blabla", true, true, appelli.get(3)));
		esiti.add(new EsitoAppello(r.nextInt(30) + 18, "ListArgomenti...blabla", true, true, appelli.get(4)));
		Studente s = new Studente("Studente1", "Cognome1", "N46008952", 46008952, esiti);
		Studente s1 = new Studente("Gianluca", "Ponticelli", "N46003584", 46003584, esiti);
		Studente s2 = new Studente("Lorenzo", "Esposito", "N46003697", 46003697, esiti);
		Studente s3 = new Studente("Francesca", "Inarta", "N46003370", 46003370, esiti);
		
		studenti.add(s);
		studenti.add(s1);
		studenti.add(s2);
		studenti.add(s3);
	};

	private static void buildStubs_esitiAppelli() {

	};

	private static ArrayList<Studente> build_listaPrenotati(){
		ArrayList<Studente> lista = new ArrayList<Studente>();
		Random r = new Random();
		for(int i = 0; i < r.nextInt(10) + 1; ++i) {
			Integer rr = r.nextInt(100);
			lista.add(new Studente("NomeStudente" + rr, "CognomeStudente" + rr, "N46" + r.nextInt(1000) + 1000, r.nextInt(100) + 1000, null));
		}
		return lista;
	};

	public static void build_all() {
		buildStubs_corsi();
		buildStubs_appelli();
		buildStubs_studenti();
		buildStubs_esitiAppelli();
	}
}
