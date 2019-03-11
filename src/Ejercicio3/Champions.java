package Ejercicio3;

public class Champions {
	
	private String nombre; 
	private int fundacion;
	private int campeonatos; 
	private int subcampeonatos;
	private int ultimoTri;
	private int ultimoSub;
	
	public Champions(String nombre, int fundacion,int campeonatos,
			int subcampeonatos,int ultimoTri,int ultimoSub) {
		super();
		this.nombre = nombre;
		this.fundacion = fundacion;
		this.campeonatos = campeonatos;
		this.subcampeonatos = subcampeonatos;
		this.ultimoTri = ultimoTri;
	}
	public Champions() {
		super();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFundacion() {
		return fundacion;
	}
	public void setFundacion(int fundacion) {
		this.fundacion = fundacion;
	}
	public int getCampeonatos() {
		return campeonatos;
	}
	public void setCampeonatos(int campeonatos) {
		this.campeonatos = campeonatos;
	}
	public int getSubcampeonatos() {
		return subcampeonatos;
	}
	public void setSubcampeonatos(int subcampeonatos) {
		this.subcampeonatos = subcampeonatos;
	}
	public int getUltimoTri() {
		return ultimoTri;
	}
	public void setUltimoTri(int ultimoTri) {
		this.ultimoTri = ultimoTri;
	}
	public int getUltimoSub() {
		return ultimoSub;
	}
	public void setUltimoSub(int ultimoSub) {
		this.ultimoSub = ultimoSub;
	}
	@Override
	public String toString() {
		return nombre + " - " + campeonatos + " - " + subcampeonatos + " - "
				+fundacion + " - " + ultimoTri + " - " + ultimoSub;
	}
}