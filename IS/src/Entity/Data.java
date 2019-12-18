package Entity;

/**
 * 
 */
public class Data {

    /**
     * 
     */
    private String data;
    private String sede;
    private String aula;
    private String lab;
    private String tipo;
    

	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public String getLab() {
		return lab;
	}
	public void setLab(String lab) {
		this.lab = lab;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Data(String data, String sede, String aula, String lab, String tipo) {
		super();
		this.data = data;
		this.sede = sede;
		this.aula = aula;
		this.lab = lab;
		this.tipo = tipo;
	}
	
	

   




}