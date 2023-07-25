package model;

public class Aereo extends Vehiculo {

	private int altitudMaxima;
	private int altitudActual;
	private String codigoOaci;

	public Aereo() {
		this("", 0, 0, 0, "");
	}

	public Aereo(String nombreVehiculo, int nPersonasMax, int altitudMaxima, int altitudActual, String codigoOaci) {
		super(nombreVehiculo, nPersonasMax);
		this.altitudMaxima = altitudMaxima;
		this.altitudActual = altitudActual;
		this.codigoOaci = codigoOaci;
	}

	public Aereo(String nombreVehiculo, int nPersonasMax) {
		super(nombreVehiculo, nPersonasMax);
		// TODO Auto-generated constructor stub
	}

	public int getAltitudMaxima() {
		return altitudMaxima;
	}

	public void setAltitudMaxima(int altitudMaxima) {
		this.altitudMaxima = altitudMaxima;
	}

	public int getAltitudActual() {
		return altitudActual;
	}

	public void setAltitudActual(int altitudActual) {
		if (altitudActual > 0 && altitudActual <= getAltitudMaxima())
			this.altitudActual = altitudActual;

	}

	public String getCodigoOaci() {
		return codigoOaci;
	}

	public void setCodigoOaci(String codigoOaci) {
		this.codigoOaci = codigoOaci;
	}

	@Override
	public String toString() {
		return "Aereo [getAltitudMaxima()=" + getAltitudMaxima() + ", getAltitudActual()=" + getAltitudActual()
				+ ", getCodigoOaci()=" + getCodigoOaci() + ", toString()=" + super.toString() + "]";
	}

}
