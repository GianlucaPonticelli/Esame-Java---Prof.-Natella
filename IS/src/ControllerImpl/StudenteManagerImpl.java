package ControllerImpl;


import java.util.ArrayList;

import Controller.StudenteManager;
import Entity.Appello;
import Entity.Studente;

/**
 * 
 */
public class StudenteManagerImpl implements StudenteManager{

    /**
     * Default constructor
     */
    public StudenteManagerImpl() {
    }

    /**
     * @param tm 
     * @return
     */
    public StudenteManager PrenotaAppello(TransactionManager tm) {
        // TODO implement here
        return null;
    }
    
    public Studente getStudente(String matricola) {
    	for(Studente s : Stub.StubBuilder.studenti) {
    		if(s.getMatricola().equals(matricola))
    			return s;
    	}
    	return null;
    }
    
    public void prenotaAppello(String id_appello, String mat) {
    	for(Appello a : Stub.StubBuilder.appelli) {
    		if(id_appello.equals(a.getId().toString()))
    			a.getListaPrenotati().add(getStudente(mat));
    	}	
    }
    
    public ArrayList<Appello> ottieniListaAppelli() { return Stub.StubBuilder.appelli; }

}