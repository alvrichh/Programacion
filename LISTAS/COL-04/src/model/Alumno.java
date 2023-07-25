package model;

import java.io.Serializable;
import java.util.Objects;

public class Alumno implements Comparable<Alumno>, Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String apellidos;
	private String direccion;
	private String DNI;
	private String email;
	private String curso;
	private Boolean dual;

	public Alumno(String dni, String nombre, String apellidos, String curso) {
		setDNI(dni);
		setNombre(nombre);
		setApellidos(apellidos);
		setCurso(curso);
		setDireccion("");
		setEmail("");
		setDual(false);
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dni) {
		this.DNI = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Boolean getDual() {
		return dual;
	}

	public void setDual(Boolean dual) {
		this.dual = dual;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getDNI());
	}

	@Override
	public boolean equals(Object obj) {
		Alumno other = (Alumno) obj;
		return Objects.equals(this.getDNI(), other.getDNI());
	}

	@Override
	public int compareTo(Alumno o) {
		int comp;
		comp = this.getApellidos().compareToIgnoreCase(o.getApellidos());
		if (comp == 0) {
			comp = this.getNombre().compareToIgnoreCase(o.getNombre());
		}
		return comp;
	}

	@Override
	public String toString() {
		return "[DNI:" + getDNI() + " " + "Curso:" + getCurso() + ", Nombre=" + getApellidos() + ", " + getNombre() + "; Dirección=" + getDireccion() + ", Email=" + getEmail() + ", Dual:" + (getDual() ? "Sí" : "No") + "]";
	}

}