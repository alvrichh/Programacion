package model;

public class AgrupacionOficial extends Agrupacion {
	//Variables
	private Integer puntosObtenidos;
	
	private Integrante[] componente;
	
	
	public AgrupacionOficial(){
		
	}
	public AgrupacionOficial(int totalIntegrantes) {
		
	}
	public String caminitoDelFalla(){
		return null;
	}
	
	
	//Métodos
	public boolean insertarIntegrante(Integrante i) {
		
		return true;
		
	}
	
	public boolean eliminarIntegrante(Integrante i) {
		return true;
	}
	
	// getters  y  setters

	public Integer getPuntosObtenidos() {
		return puntosObtenidos;
	}

	public void setPuntosObtenidos(Integer puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
	}
	public Integrante[] getComponente() {
		return componente;
	}
	public void setComponente(Integrante[] componente) {
		this.componente = componente;
	}


}
