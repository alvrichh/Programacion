package model;

import java.io.Serializable;
import java.util.Objects;

public class Divisa implements Comparable<Divisa>, Serializable {

	private static final long serialVersionUID = 1L;

	private static int cont = 0;

	private Integer id;
	private String nombre;
	private String simbolo;

	public Divisa() {
		this("", "");
	}

	public Divisa(String nombre, String simbolo) {
		setId();
		setNombre(nombre);
		setSimbolo(simbolo);
	}

	public Integer getId() {
		return id;
	}

	private void setId() {
		this.id = ++cont;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public boolean equals(Object obj) {
		Divisa other = (Divisa) obj;
		return Objects.equals(this.getId(), other.getId());
	}

	@Override
	public int compareTo(Divisa o) {
		return this.getSimbolo().compareTo(o.getSimbolo());
	}

	@Override
	public String toString() {
		return "Divisa [Id=" + getId() + ", (" + getSimbolo() + ") " + getNombre() + ", ";
	}

}