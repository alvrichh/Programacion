package model;

public class Cliente implements Comparable<Cliente> {

	private String dni;
	private String nombre;
	private int edad;
	private double sueldo;

	public Cliente() {
		this("", "", 0, 0);
	}

	public Cliente(String dni, String nombre, int edad, double sueldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	public boolean equals(Cliente cliente) {
		return getDni().equals(cliente.getDni());
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Cliente [getDni()=" + getDni() + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
				+ ", getSueldo()=" + getSueldo() + "]";
	}

	@Override
	public int compareTo(Cliente cliente) {
		return cliente.getDni().compareTo(getDni());
	}

}
