package model;

public class Persona {
	private String nombre;
	private String direccion;
	private String dni;

	public Persona() {
		super();
	}

	public Persona(String nombre, String direccion, String dni) {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
