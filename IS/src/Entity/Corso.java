package Entity;

/**
 * 
 */
public class Corso {

 

    /**
     * 
     */
    private int id;
    private String Nome;

    /**
     * 
     */
    private String Docente;

    /**
     * 
     */
    private String CFU;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDocente() {
		return Docente;
	}

	public void setDocente(String docente) {
		Docente = docente;
	}

	public String getCFU() {
		return CFU;
	}

	public void setCFU(String cFU) {
		CFU = cFU;
	}

	public Corso(int id, String nome, String docente, String cFU) {
		super();
		this.id = id;
		Nome = nome;
		Docente = docente;
		CFU = cFU;
	}
    
    


}