package model;

public class Alumno {

	private String dni;
	private String nombre;
	private String apellidos;
	private Integer curso;

	public Alumno() {
		this(null, null, null, null);
	}

	public Alumno(String dni, String nombre, String apellidos, Integer curso) {
		setDni(dni);
		setNombre(nombre);
		setApellidos(apellidos);
		setCurso(curso);
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getCurso() {
		return curso;
	}

	public void setCurso(Integer curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [DNI=" + getDni() + ", Nombre=" + getNombre() + ", Apellidos=" + getApellidos() + ", Curso=" + getCurso() + "]";
	}

}