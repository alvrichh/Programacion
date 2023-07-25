package model;

public class Fijo extends Persona {

	private String tipoContrato;

	public Fijo() { // metodo constructor por defecto, llama al metodo de la clase padre
		super(); 
	}
	
	public Fijo(String tipoContrato, String nombre, String direccion, String dni) {
		super(nombre, direccion, dni);
		setTipoContrato(tipoContrato);
	}
	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	
	
	
	
}
