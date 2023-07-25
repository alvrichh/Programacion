package model;

public class Empleado extends Persona {
	private Double sueldo;
	
	public Empleado() {
		super();
	}

	public Empleado(Double sueldo, String nombre, String direccion, String dni) {
		super(nombre, direccion, dni);
		setSueldo(sueldo);
		
	}
	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	public int diaVacaciones() {
		return 1;
	}
}
