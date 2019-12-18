package Entity;

import java.util.ArrayList;

/**
 * 
 */
public class Appello {


    /**
     * 
     */
    private Integer id;
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

    
    private Corso corso;

    private Data dataAppello;

    private ArrayList<Studente> listaPrenotati;

	public Data getDataAppello() {
		return dataAppello;
	}

	public void setDataAppello(Data dataAppello) {
		this.dataAppello = dataAppello;
	}

	public Corso getCorso() {
		return corso;
	}

	public void setCorso(Corso corso) {
		this.corso = corso;
	}

	
	public ArrayList<Studente> getListaPrenotati() {
		return listaPrenotati;
	}

	public void setListaPrenotati(ArrayList<Studente> listaPrenotati) {
		this.listaPrenotati = listaPrenotati;
	}

	public Appello(Integer id, Corso corso, Data dataAppello, ArrayList<Studente> prenotati) {
		super();
		this.id = id;
		this.corso = corso;
		this.dataAppello = dataAppello;
		this.listaPrenotati = prenotati;
	}

	



}