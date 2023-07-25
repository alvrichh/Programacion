package model;

public abstract class Local extends Propiedad {

	private double precio;
	private Persona propietario;

	public Local() {
		this(0, new Persona(),0,"",0);
	}

	public Local(double precio, Persona propietario, int añoConstruccion, String direccion, double metrosCuadrados) {
		super(añoConstruccion, direccion, metrosCuadrados);
		this.precio = precio;
		this.propietario = propietario;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

}
