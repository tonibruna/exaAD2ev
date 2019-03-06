package modelos;

public class Equipo {

	private String nombre;
	private int ligas;
	private int copas;
	private int fundacion;
	private int enPrimera;
	
	
	public Equipo() {
		
	}

	public Equipo(String nombre, int ligas, int copas, int fundacion, int enPrimera) {
		super();
		this.nombre = nombre;
		this.ligas = ligas;
		this.copas = copas;
		this.fundacion = fundacion;
		this.enPrimera = enPrimera;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLigas() {
		return ligas;
	}

	public void setCiudad(int ligas) {
		this.ligas = ligas;
	}

	public int getCopas() {
		return copas;
	}

	public void setCopas(int copas) {
		this.copas = copas;
	}

	public int getFundacion() {
		return fundacion;
	}

	public void setFundacion(int fundacion) {
		this.fundacion = fundacion;
	}
	
	public int getEnPrimera() {
		return enPrimera;
	}

	public void setEnPrimera(int enPrimera) {
		this.enPrimera = enPrimera;
	}
	
	@Override
	public String toString() {
		
		return this.nombre+", "+this.ligas+", "+
		this.copas+", "+this.fundacion+", "+this.enPrimera;
		
	}	
}