package model;

public abstract class Cliente extends Persona{

	private String cuenta;

	public Cliente() {
		super();
	}
	
	
	public Cliente(String cuenta, String nombre, String direccion, String dni) {
		super(nombre,direccion,dni);
		this.cuenta = cuenta;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	
	public abstract int preMax();
	
	
}
