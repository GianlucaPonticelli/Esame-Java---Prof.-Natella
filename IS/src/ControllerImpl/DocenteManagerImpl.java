package ControllerImpl;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Controller.DocenteManager;
import Entity.Appello;
import Entity.Corso;
import Entity.Data;
import Entity.Studente;

/**
 * 
 */
public class DocenteManagerImpl implements DocenteManager{

    /**
     * Default constructor
     */
    public DocenteManagerImpl() {
    }

    /**
     * @param tm 
     * @return
     */
    public DocenteManager CreaAppelloCorso(TransactionManager tm) {
        // TODO implement here
        return null;
    }

    /**
     * @param tm 
     * @return
     */
    public DocenteManager ConsultaElencoStudentiPrenotati(TransactionManager tm) {
        // TODO implement here
        return null;
    }
    
    public ArrayList<Appello> ottieniListaAppelli() { return Stub.StubBuilder.appelli; }
    
    public ArrayList<Studente> ConsultaElencoPrenotati(String id_appello) {
		for(Appello a : Stub.StubBuilder.appelli) {
			if(Integer.parseInt(id_appello) == a.getId())
				return a.getListaPrenotati();
		}
		return null;
	}
    
    public void CreaAppello() {
    	Scanner myObj = new Scanner(System.in);
    	ArrayList<Corso> listaCorsi = Stub.StubBuilder.corsi;
		for(Corso c : listaCorsi)
			System.out.println("Nome Corso: " + c.getNome() + " Codice: " + c.getId());
		System.out.println("Inserisci il codice relativo al corso");
		String codice_corso = myObj.nextLine();
		
		Corso cc = null;
		for(Corso c : Stub.StubBuilder.corsi) {
			if(c.getId() == Integer.parseInt(codice_corso))
				cc = c;
		}
		
		System.out.println("Inserisci la data dell'appello, sede, aula, lab e tipo");
		String data = myObj.nextLine();
		String sede = myObj.nextLine();
		String aula = myObj.nextLine();
		String lab = myObj.nextLine();
		String tipo = myObj.nextLine();
		Random r = new Random();
		Stub.StubBuilder.appelli.add(new Appello((r.nextInt(1000) + 10), cc, new Data(data, sede, aula, lab, tipo), new ArrayList<Studente>()));
    }

}