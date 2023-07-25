package model;

public class Cliente extends Persona {

	private Double cuenta;

	public Cliente() {
		super();
	}
	public Cliente(Double cuenta, String nombre, String direccion, String dni) {
		super(nombre, direccion, dni);
		setCuenta(cuenta);
	}
	public Double getCuenta() {
		return cuenta;
	}

	public void setCuenta(Double cuenta) {
		this.cuenta = cuenta;
	}
	
}
