package model;

public class Integrante {

	private static int numeroParticipante = 0;
	private int numeroActual;
	private String nombre;
	private int edad;
	private String localidad;

	public Integrante() {
		this("", 0, "");
	}

	public Integrante(String nombre, int edad, String localidad) {
		setNumeroActual(numeroParticipante++);
		this.nombre = nombre;
		this.edad = edad;
		this.localidad = localidad;
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

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getNumeroActual() {
		return numeroActual;
	}

	private void setNumeroActual(int numeroActual) {
		this.numeroActual = numeroActual;
	}

	@Override
	public String toString() {
		return "Integrante [getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getLocalidad()="
				+ getLocalidad() + ", getNumeroActual()=" + getNumeroActual() + "]";
	}

}
