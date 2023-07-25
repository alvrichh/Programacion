package banco;

import com.google.gson.Gson;

public class Persona {

	private String nombre;
	private String apellidos;
	private String dni;
	private Direccion direccionFiscal;
	

	//Constructores
	public Persona() {
		setNombre("SinNombre");
		setApellidos("SinApellidos");
		setDni("SinDni");
		setDireccionFiscal(new Direccion());
	}
	


	
	public Persona(String nombre, String apellidos, String dni, Direccion direccionFiscal) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccionFiscal = direccionFiscal;
	}




	//Getters and Setters
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	


	public Direccion getDireccionFiscal() {
		return direccionFiscal;
	}

	public void setDireccionFiscal(Direccion direccionFiscal) {
		this.direccionFiscal = direccionFiscal;
	}

	@Override
	public String toString() {
		return "Persona [getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getDni()=" + getDni()
				+ ", \ngetDireccionFiscal()=" + getDireccionFiscal() + "]";
	}

	
	
	
	
	
	
	
}
