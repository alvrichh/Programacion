package model;

public abstract class Vehiculo {
	private String nombre;
	private Integer personasMaximas;
	private Integer personasActuales;
	
	
	public Vehiculo() {
		this("",0);
	}
	
	public Vehiculo(String nombre, Integer personasMaximas) {
		this.personasActuales = 0;
	
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPersonasMaximas() {
		return personasMaximas;
	}

	public void setPersonasMaximas(Integer personasMaximas) {
		this.personasMaximas = personasMaximas;
	}

	public Integer getPersonasActuales() {
		return personasActuales;
	}

	public void setPersonasActuales(Integer personasActuales) {
		this.personasActuales = personasActuales;
	}

	

}
