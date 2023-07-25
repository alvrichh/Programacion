package model;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("serial")
public class Aspirante implements Serializable, Comparable<Aspirante>{

	private String nombre;
	private String dni;
	private String telefono;

	public Aspirante() {
		this("", "", "");
	}

	public Aspirante(String nombre, String dni, String telefono) {
		setNombre(nombre);
		setDNI(dni);
		setTelefono(telefono);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return dni;
	}

	public void setDNI(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		Aspirante other = (Aspirante) obj;
		return Objects.equals(getDNI(), other.getDNI());
	}

	@Override
	public String toString() {
		return "Aspirante [Nombre=" + getNombre() + ", DNI=" + getDNI() + ", Telefono=" + getTelefono() + "]";
	}

	@Override
	public int compareTo(Aspirante o) {
		return getNombre().compareToIgnoreCase(o.getNombre());
	}

}