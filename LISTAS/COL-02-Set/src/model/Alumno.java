package model;

import java.io.Serializable;
import java.util.Objects;

public class Alumno implements Serializable, Comparable<Alumno> {

	private static final long serialVersionUID = 1L;

	private static Integer cont = 0;

	private Integer id;
	private String nombre;
	private String apellidos;
	private String dni;

	public Alumno() {
		this("", "", "");
	}

	public Alumno(String nombre, String apellidos, String dni) {
		setId();
		setNombre(nombre);
		setApellidos(apellidos);
		setDni(dni);
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

	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
	}

	@Override
	public boolean equals(Object obj) {
		Alumno other = (Alumno) obj;
		return Objects.equals(this.getId(), other.getId());
	}

	@Override
	public int compareTo(Alumno o) {
		int comp = 0;
		comp = this.getApellidos().compareToIgnoreCase(o.getApellidos());
		if (comp == 0) {
			comp = this.getNombre().compareToIgnoreCase(o.getNombre());
			if (comp == 0) {
				comp = this.getDni().compareToIgnoreCase(o.getDni());
			}
		}
		return comp;
	}

	@Override
	public String toString() {
		return "Alumno [Id=" + getId() + "; Nombre=" + getApellidos() + ", " + getNombre() + "; DNI=" + getDni() + "]";
	}

}