package model;

public class Avioneta extends Aereo {

	public Avioneta() {
		super();
	}

	public Avioneta(String nombreVehiculo, int nPersonasMax, int altitudMaxima, int altitudActual, String codigoOaci) {
		super(nombreVehiculo, nPersonasMax, altitudMaxima, altitudActual, codigoOaci);
		// TODO Auto-generated constructor stub
	}

	public Avioneta(String nombreVehiculo, int nPersonasMax) {
		super(nombreVehiculo, nPersonasMax);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Avioneta [toString()=" + super.toString() + "]";
	}

}
