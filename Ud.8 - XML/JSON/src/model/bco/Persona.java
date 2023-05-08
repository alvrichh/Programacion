package model.bco;

public class Persona {

	private String nombre;
	private String apellidos;
	private String DNI;
	private Direccion domicilio;

	public Persona() {
		setNombre("");
		setApellidos("");
		setDNI("");
		setDomicilio(new Direccion());
	}

	public Persona(String nombre, String apellidos, String DNI, Direccion domicilio) {
		setNombre(nombre);
		setApellidos(apellidos);
		setDNI(DNI);
		setDomicilio(domicilio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public Direccion getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Direccion domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "Persona->[Nombre=" + getNombre() + ", Apellidos=" + getApellidos() + ", DNI=" + getDNI() + "]";
	}

}