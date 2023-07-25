package model;

public class Asiatico extends Internacional {

	private String regimen;

	public Asiatico() {

	}

	public Asiatico(String regimen, String pais, String cuenta, String nombre, String direccion, String dni) {
		super(pais, cuenta, nombre, direccion, dni);
		this.regimen = regimen;
	}

	public String getRegimen() {
		return regimen;
	}

	public void setRegimen(String regimen) {
		this.regimen = regimen;
	}

	@Override
	public int preMax() {
		return 4800;
	}

	@Override
	public String toString() {
		return "Asiatico [regimen=" + regimen + ", getPais()=" + getPais() + ", toString()=" + super.toString()
				+ ", getCuenta()=" + getCuenta() + ", getNombre()=" + getNombre() + ", getDireccion()=" + getDireccion()
				+ ", getDni()=" + getDni() + "]";
	}

}
