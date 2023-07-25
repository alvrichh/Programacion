package model;

public abstract class Internacional extends Cliente {

	private String pais;

	public Internacional() {

	}

	public Internacional(String pais, String cuenta, String nombre, String direccion, String dni) {
		super(cuenta, nombre, direccion, dni);
		this.pais = pais;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Internacional [pais=" + pais + ", getCuenta()=" + getCuenta() + ", getNombre()=" + getNombre()
				+ ", getDireccion()=" + getDireccion() + ", getDni()=" + getDni() + "]";
	}

}
