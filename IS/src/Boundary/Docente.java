//VEDERE MAIN
//*All'inizio avevo pensato di avere tre interfacce separate, poi per via del problema della persistenza 
//dei dati ho accorpato tutto nel main


package Boundary;

import java.util.Scanner;

import Controller.DocenteManager;
import ControllerImpl.DocenteManagerImpl;

public class Docente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stub.StubBuilder.build_all();
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Interfaccia Utente Docente.");
		System.out.println("1. Inserisci Nuovo Appello");
		System.out.println("2. Stampa Lista Prenotati");
		System.out.println("0. per uscire");
		
		DocenteManager sm = new DocenteManagerImpl();
		
		String opt = myObj.nextLine();  
		
		while(!opt.equals("0")) {
			if(opt.equals("1")) {
				sm.CreaAppello();
				
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


