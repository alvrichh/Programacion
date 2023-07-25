package model;

public class Componente {

	private Tipo tipo;
	private String descripcion;
	
	public Componente() {
		
	}
	public Componente(Tipo tipo, String descripcion) {
		setTipo(tipo);
		setDescripcion(descripcion);
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public static Componente clas(String textContent) {
		// TODO Auto-generated method stub
		return null;
	}
}
