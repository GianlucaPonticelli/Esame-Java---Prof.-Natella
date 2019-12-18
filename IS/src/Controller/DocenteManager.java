package Controller;

import java.util.ArrayList;

import Entity.Appello;
import Entity.Studente;

/**
 * 
 */
public interface DocenteManager {


	public ArrayList<Studente> ConsultaElencoPrenotati(String id_appello);
	public void CreaAppello();
	public ArrayList<Appello> ottieniListaAppelli();
}