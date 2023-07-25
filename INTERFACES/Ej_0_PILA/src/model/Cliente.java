package model;

public class Cliente {
	private String dni;
	private String nombre;
	private Integer edad;
	private Integer sueldo;
	
	public Cliente() {
		 setDni("");
		 setNombre("");
		 setEdad(0);
		 setSueldo(0);	 
	}
	public Cliente(String dni, String nombre, Integer edad, Integer sueldo) {
		 setDni(dni);
		 setNombre(nombre);
		 setEdad(edad);
		 setSueldo(sueldo);
		 
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
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Integer getSueldo() {
		return sueldo;
	}
	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}
	
	

}
