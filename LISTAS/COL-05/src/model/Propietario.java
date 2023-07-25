package model;

import java.util.Objects;

public class Propietario implements Comparable<Propietario> {

	private String nombre;
	private String apellidos;
	private Long socio;
	private String pais;

	public Propietario() {
		this("", "", 0L);
	}

	public Propietario(String nombre, String apellidos, Long socio) {
		setNombre(nombre);
		setApellidos(apellidos);
		setSocio(socio);
		setPais("");
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

	public Long getSocio() {
		return socio;
	}

	public void setSocio(Long socio) {
		this.socio = socio;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, nombre, pais, socio);
	}

	@Override
	public boolean equals(Object obj) {
		Propietario other = (Propietario) obj;
		return Objects.equals(this.getSocio(), other.getSocio());
	}

	@Override
	public String toString() {
		return "Propietario [Nombre=" + getNombre() + ", Apellidos=" + getApellidos() + ", Socio=" + getSocio() + ", Pais=" + getPais() + "]";
	}

	@Override
	public int compareTo(Propietario o) {
		return this.getSocio().compareTo(o.getSocio());
	}

}
