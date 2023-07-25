package model;

public class Nacional extends Cliente{

	private String comunidad;

	public Nacional() {
		
	}
	
	public Nacional(String comunidad, String cuenta, String nombre, String direccion, String dni) {
		super(cuenta,nombre,direccion,dni);
		this.comunidad = comunidad;
	}

	public String getComunidad() {
		return comunidad;
	}

	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}

	
	
	@Override
	public String toString() {
		return "Nacional [comunidad=" + comunidad + ", getCuenta()=" + getCuenta() + ", getNombre()=" + getNombre()
				+ ", getDireccion()=" + getDireccion() + ", getDni()=" + getDni() + "]";
	}

	@Override
	public int preMax() {
		return 1000;
	}
	
	
}
