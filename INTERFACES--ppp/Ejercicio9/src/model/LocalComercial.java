package model;

public class LocalComercial extends Local {

	private String actividadComercial;

	public LocalComercial() {
		this("", 0, new Persona(), 0, "", 0);
	}

	public LocalComercial(String actividadComercial, double precio, Persona propietario, int añoConstruccion,
			String direccion, double metrosCuadrados) {
		super(precio, propietario, añoConstruccion, direccion, metrosCuadrados);
		this.actividadComercial = actividadComercial;
	}

	public String getActividadComercial() {
		return actividadComercial;
	}

	public void setActividadComercial(String actividadComercial) {
		this.actividadComercial = actividadComercial;
	}

}
