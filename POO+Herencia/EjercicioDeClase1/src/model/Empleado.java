package model;

public class Empleado extends Persona{

	private double sueldo;

	public Empleado() {
		
	}
	
	public Empleado(double sueldo, String nombre, String direccion, String dni) {
		super(nombre,direccion,dni);
		this.sueldo = sueldo;
	}

	
	
	
	
	
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
}
