package model;

public class Propietario {

	String nombre;
	String apellidos;
	int numSocio;
	String paisOrigen;

	Propietario(String nombre, String apellidos, int numSocio, String paisOrigen) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numSocio = numSocio;
		this.paisOrigen = paisOrigen;
	}

	public String toString() {
		return nombre + " " + apellidos + " - " + numSocio + " (" + paisOrigen + ")";
	}
}
