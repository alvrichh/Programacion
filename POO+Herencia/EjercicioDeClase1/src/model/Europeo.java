package model;

public class Europeo extends Internacional {

	private String otan;

	public Europeo() {

	}

	public Europeo(String otan, String pais, String cuenta, String nombre, String direccion, String dni) {
		super(pais, cuenta, nombre, direccion, dni);
		this.otan = otan;
	}

	public String getOtan() {
		return otan;
	}

	public void setOtan(String otan) {
		this.otan = otan;
	}

	@Override
	public int preMax() {
		return 2750;
	}

	@Override
	public String toString() {
		return "Europeo [otan=" + otan + ", getPais()=" + getPais() + ", toString()=" + super.toString()
				+ ", getCuenta()=" + getCuenta() + ", getNombre()=" + getNombre() + ", getDireccion()=" + getDireccion()
				+ ", getDni()=" + getDni() + "]";
	}

}
