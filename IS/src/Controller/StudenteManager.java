package Controller;

import java.util.ArrayList;

import Entity.Appello;

/**
 * 
 */
public interface StudenteManager {

	public void prenotaAppello(String id_appello, String matricola);
	public ArrayList<Appello> ottieniListaAppelli();

}