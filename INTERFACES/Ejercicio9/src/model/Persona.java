package model;

public class Persona {

	private static int identificador;
	private String nif;
	private String Nombre;
	private String Apellido1;
	private String Apellido2;

	public Persona() {
		this("", "", "", "");
	}

	public Persona(String nif, String nombre, String apellido1, String apellido2) {
		super();
		this.nif = nif;
		Nombre = nombre;
		Apellido1 = apellido1;
		Apellido2 = apellido2;
	}

	public static int getIdentificador() {
		return identificador;
	}

	public static void setIdentificador(int identificador) {
		Persona.identificador = identificador;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido1() {
		return Apellido1;
	}

	public void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}

	public String getApellido2() {
		return Apellido2;
	}

	public void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}

	@Override
	public String toString() {
		return "Persona [getNif()=" + getNif() + ", getNombre()=" + getNombre() + ", getApellido1()=" + getApellido1()
				+ ", getApellido2()=" + getApellido2() + "]";
	}

}
