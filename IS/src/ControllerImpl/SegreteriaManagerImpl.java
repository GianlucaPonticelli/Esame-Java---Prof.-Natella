package ControllerImpl;


import java.util.ArrayList;
import java.util.Random;

import Controller.SegreteriaManager;
import Entity.Appello;
import Entity.Corso;
import Entity.Studente;

/**
 * 
 */
public class SegreteriaManagerImpl implements SegreteriaManager {

    /**
     * Default constructor
     */
    public SegreteriaManagerImpl() {
    }

    /**
     * @param tm 
     * @return
     */
    public SegreteriaManager CreaCorso(TransactionManager tm) {
        // TODO implement here
        return null;
    }
    
    public void CreaCorso(String nome, String docente, String cfu) {
    	Random r = new Random();
		Stub.StubBuilder.corsi.add(new Corso(r.nextInt(100) + 100, nome, docente, cfu));
    }

    /**
     * @param tm 
     * @return
     */
    public SegreteriaManager ConsultaElencoStudentiPrenotati(TransactionManager tm) {
        // TODO implement here
        return null;
    }
    
    public ArrayList<Appello> ottieniListaAppelli() { return Stub.StubBuilder.appelli; }

	@Override
	public ArrayList<Studente> ConsultaElencoPrenotati(String id_appello) {
		for(Appello a : Stub.StubBuilder.appelli) {
			if(Integer.parseInt(id_appello) == a.getId())
				return a.getListaPrenotati();
		}
		return null;
	}


}