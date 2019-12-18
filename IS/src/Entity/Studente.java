package Entity;

import java.util.ArrayList;

/**
 * 
 */
public class Studente {

    /**
     * 
     */
    private String Name;

    /**
     * 
     */
    private String Cognome;

    /**
     * 
     */
    private String Matricola;

    /**
     * 
     */
    private Integer PIN;

	private ArrayList<EsitoAppello> appelliSostenuti;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public String getMatricola() {
		return Matricola;
	}

	public void setMatricola(String matricola) {
		Matricola = matricola;
	}

	public Integer getPIN() {
		return PIN;
	}

	public void setPIN(Integer pIN) {
		PIN = pIN;
	}

	public ArrayList<EsitoAppello> getAppelliSostenuti() {
		return appelliSostenuti;
	}

	public void setAppelliSostenuti(ArrayList<EsitoAppello> appelliSostenuti) {
		this.appelliSostenuti = appelliSostenuti;
	}

	public Studente(String name, String cognome, String matricola, Integer pIN,
			ArrayList<EsitoAppello> appelliSostenuti) {
		super();
		Name = name;
		Cognome = cognome;
		Matricola = matricola;
		PIN = pIN;
		this.appelliSostenuti = appelliSostenuti;
	}


}