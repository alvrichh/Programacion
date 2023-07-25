package model;

import java.util.Objects;

public class Perro implements Comparable<Perro> {

	private String nombre;
	private Integer edad;
	private Double peso;
	private Boolean vacunado;
	private String raza;
	private Propietario propietario;

	public Perro() {
		this("", "", new Propietario());
	}

	public Perro(String nombre, String raza, Propietario propietario) {
		setNombre(nombre);
		setRaza(raza);
		setPropietario(propietario);
		setEdad(0);
		setPeso(0.0);
		setVacunado(false);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Boolean getVacunado() {
		return vacunado;
	}

	public void setVacunado(Boolean vacunado) {
		this.vacunado = vacunado;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre, peso, raza, vacunado, propietario);
	}

	@Override
	public boolean equals(Object obj) {
		Perro other = (Perro) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(raza, other.raza) && Objects.equals(propietario, other.propietario);
	}

	@Override
	public String toString() {
		return "Perro [Nombre=" + getNombre() + ", Propietario=" + getPropietario() + ", Edad=" + getEdad() + ", Peso=" + getPeso() + ", Vacunado=" + getVacunado() + ", Raza=" + getRaza() + "]";
	}

	@Override
	public int compareTo(Perro o) {
		int comp;
		comp = this.getRaza().compareTo(o.getRaza());
		if (comp == 0) {
			comp = this.getNombre().compareTo(o.getNombre());
		}
		return comp;
	}

}