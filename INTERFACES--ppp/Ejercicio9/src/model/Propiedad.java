package model;

public abstract class Propiedad {
	private static int contador = 0;

	private int añoConstruccion;
	private String direccion;
	private double metrosCuadrados;

	public Propiedad() {
		this(0, "", 0);
	}

	public Propiedad(int añoConstruccion, String direccion, double metrosCuadrados) {
		this.añoConstruccion = añoConstruccion;
		this.direccion = direccion;
		this.metrosCuadrados = metrosCuadrados;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Propiedad.contador = contador;
	}

	public int getAñoConstruccion() {
		return añoConstruccion;
	}

	public void setAñoConstruccion(int añoConstruccion) {
		this.añoConstruccion = añoConstruccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	@Override
	public String toString() {
		return "Propiedad [getAñoConstruccion()=" + getAñoConstruccion() + ", getDireccion()=" + getDireccion()
				+ ", getMetrosCuadrados()=" + getMetrosCuadrados() + "]";
	}

}
