package Entity;

/**
 * 
 */
public class EsitoAppello {

    /**
     * Default constructor
     */
    public EsitoAppello() {
    }

	public Integer getVoto() {
		return Voto;
	}
	public void setVoto(Integer voto) {
		Voto = voto;
	}
	public String getListaArgomenti() {
		return ListaArgomenti;
	}
	public void setListaArgomenti(String listaArgomenti) {
		ListaArgomenti = listaArgomenti;
	}
	public Boolean getSuperato() {
		return Superato;
	}
	public void setSuperato(Boolean superato) {
		Superato = superato;
	}
	public Boolean getConcluso() {
		return Concluso;
	}
	public void setConcluso(Boolean concluso) {
		Concluso = concluso;
	}
	public Appello getAppello() {
		return appello;
	}
	public void setAppello(Appello appello) {
		this.appello = appello;
	}
	

	/**
     * 
     */
    private Integer Voto;

    /**
     * 
     */
    private String ListaArgomenti;

    /**
     * 
     */
    private Boolean Superato;

    /**
     * 
     */
    private Boolean Concluso;
    
    private Appello appello;
    
	public EsitoAppello(Integer voto, String listaArgomenti, Boolean superato, Boolean concluso, Appello appello) {
		super();
		Voto = voto;
		ListaArgomenti = listaArgomenti;
		Superato = superato;
		Concluso = concluso;
		this.appello = appello;
	}
	
}