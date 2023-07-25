package model;

public class Fijo extends Empleado{

	private String tipoContrato;

	
	public Fijo() {
		super();
	}
	
	public Fijo(String tipoContrato, double sueldo, String nombre, String direccion, String dni) {
		super(sueldo,nombre,direccion,dni);
		this.tipoContrato = tipoContrato;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	@Override
	public String toString() {
		return "Fijo [tipoContrato=" + tipoContrato + ", getSueldo()=" + getSueldo() + ", getNombre()=" + getNombre()
				+ ", getDireccion()=" + getDireccion() + ", getDni()=" + getDni() + "]";
	}
	
	
}
