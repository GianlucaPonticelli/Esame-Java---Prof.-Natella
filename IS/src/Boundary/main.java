

package Boundary;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.DocenteManager;
import Controller.SegreteriaManager;
import Controller.StudenteManager;
import ControllerImpl.DocenteManagerImpl;
import ControllerImpl.SegreteriaManagerImpl;
import ControllerImpl.StudenteManagerImpl;
import Entity.Appello;
import Entity.Studente;

public class main {
	
	public static void main(String[] args) {
		

		// TODO Auto-generated method stub

		Stub.StubBuilder.build_all();
		
				

		Scanner myObj = new Scanner(System.in);
		System.out.println("Interfaccia Utente Segreteria.");
		System.out.println("1. Inserisci Nuovo Corso");
		System.out.println("2. Stampa Lista Prenotati");
		System.out.println("0. per uscire");

		SegreteriaManager sm = new SegreteriaManagerImpl();

		String opt = myObj.nextLine();  

		while(!opt.equals("0")) {
			if(opt.equals("1")) {
				System.out.println("Nome: ");

				String nome = myObj.nextLine();  

				System.out.println("Docente: ");

				String docente = myObj.nextLine();

				System.out.println("CFU: ");

				String cfu = myObj.nextLine();

				sm.CreaCorso(nome, docente, cfu);
			}
			if(opt.equals("2")) {
				for(Appello a : sm.ottieniListaAppelli()) 
					System.out.println("Codice Appello: " + a.getId() + ", Corso: " + a.getCorso().getNome());

				System.out.println("Inserisci il codice dell'appello");
				String codice_appello = myObj.nextLine();
				ArrayList<Studente> listaPrenotati = sm.ConsultaElencoPrenotati(codice_appello); 
				System.out.println("Lista Studenti prenotati all'appello: ");
				for(Studente s : listaPrenotati)
					System.out.println(s.getName() + ", Matricola: " + s.getMatricola());
			}
			System.out.println("Operazione completata. \n");
			System.out.println("1. Inserisci Nuovo Corso");
			System.out.println("2. Stampa Lista Prenotati");
			System.out.println("0. per uscire");

			opt = myObj.nextLine();  
			System.out.println("\n");
		}

		System.out.println("Interfaccia Utente Docente.");
		System.out.println("1. Inserisci Nuovo Appello");
		System.out.println("2. Stampa Lista Prenotati");
		System.out.println("0. per uscire");

		DocenteManager sm1 = new DocenteManagerImpl();

		opt = myObj.nextLine();  

		while(!opt.equals("0")) {
			if(opt.equals("1"))
				sm1.CreaAppello();

			if(opt.equals("2")) {
				for(Appello a : sm.ottieniListaAppelli()) 
					System.out.println("Codice Appello: " + a.getId() + ", Corso: " + a.getCorso().getNome());
				System.out.println("Inserisci il codice dell'appello");
				String codice_appello = myObj.nextLine();
				ArrayList<Studente> listaPrenotati = sm.ConsultaElencoPrenotati(codice_appello); 
				System.out.println("Lista Studenti prenotati all'appello: ");
				for(Studente s : listaPrenotati)
					System.out.println(s.getName());
			}

			System.out.println("\n");

			System.out.println("1. Inserisci Nuovo Appello");
			System.out.println("2. Stampa Lista Prenotati");
			System.out.println("0. per uscire");

			opt = myObj.nextLine();  
			System.out.println("\n");
		}

		System.out.println("Interfaccia Utente Studente.");
		System.out.println("Inserisci l'id corrispondente all'appello da prenotare");
		
		for(Appello a : sm.ottieniListaAppelli()) 
			System.out.println("ID " + a.getId() + " Appello di " + a.getCorso().getNome() + " del " + a.getDataAppello().getData());
		
		String id_appello = myObj.nextLine();

		System.out.println("Inserisci matricola"); 

		String mat = myObj.nextLine();
		StudenteManager sm2 = new StudenteManagerImpl();

		sm2.prenotaAppello(id_appello, mat);

		System.out.println("Appello Prenotato"); 
		
		System.out.println("*** DEBUG ***");
		System.out.println("LISTA DEGLI STUDENTI PRENOTATI PER L'APPELLO SELEZIONATO");
		for(Studente s : sm.ConsultaElencoPrenotati(id_appello)){
			s.getName();
			
			System.out.println(s.getName() + ", Matricola: " + s.getMatricola());
			}
		
		
		}

}




