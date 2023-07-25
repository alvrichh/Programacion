package model;

public class Persona {

	private String nombre;
	private Integer edad;
	private Double peso;
	
	public Persona() throws EdadNoValidaExcepcion, PesoNoValidoExcepcion {
		setNombre("");
		setEdad(0);
		setPeso(0.0);
	}
	public Persona(String nombre, Integer edad, Double peso) throws EdadNoValidaExcepcion, PesoNoValidoExcepcion {
		setNombre(nombre);;
		setEdad(edad);
		setPeso(peso);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) throws EdadNoValidaExcepcion {
		if( edad < 18 || edad > 99) {
			throw new EdadNoValidaExcepcion(edad);
		}
		this.edad = edad;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) throws PesoNoValidoExcepcion {
		if ( peso < 50.0 || peso > 100.0) {
			throw new PesoNoValidoExcepcion(peso);
		}
		this.peso = peso;
	}

	
	
}
