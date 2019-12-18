package Controller;

import java.util.ArrayList;

import Entity.Appello;
import Entity.Studente;

/**
 * 
 */
public interface SegreteriaManager {

	
	 public void CreaCorso(String nome, String docente, String cfu);
	 public ArrayList<Studente> ConsultaElencoPrenotati(String id_appello);
	 public ArrayList<Appello> ottieniListaAppelli();

}