//VEDERE MAIN

//*All'inizio avevo pensato di avere tre interfacce separate, poi per via del problema della persistenza 
//dei dati ho accorpato tutto nel main

package Boundary;

import java.util.Scanner;

import Controller.StudenteManager;
import ControllerImpl.StudenteManagerImpl;
import Entity.Appello;

public class Studente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stub.StubBuilder.build_all();
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Interfaccia Utente Studente.");
		System.out.println("Inserisci l'id corrispondente all'appello da prenotare");
		for(Appello a : Stub.StubBuilder.appelli)
			System.out.println("ID " + a.getId() + " Appello di " + a.getCorso().getNome() + " del " + a.getDataAppello().getData());
		
		
		String id_appello = myObj.nextLine();
		
		System.out.println("Inserisci matricola"); 
		
		String mat = myObj.nextLine();
		StudenteManager sm = new StudenteManagerImpl();
		
		sm.prenotaAppello(id_appello, mat);
		
	}

}
