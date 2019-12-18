//VEDERE MAIN

//*All'inizio avevo pensato di avere tre interfacce separate, poi per via del problema della persistenza 
//dei dati ho accorpato tutto nel main

package Boundary;

import java.util.Scanner;

import Controller.SegreteriaManager;
import ControllerImpl.SegreteriaManagerImpl;

public class Segreteria {

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
				System.out.println("Nuovo corso creato");
				
			}
			if(opt.equals("2")) {
				System.out.println("Inserisci il codice dell'appello");
				String codice_appello = myObj.nextLine();
				sm.ConsultaElencoPrenotati(codice_appello);
			}
			opt = myObj.nextLine(); 
		}
		
		
		
		
	}

}
