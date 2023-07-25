package model;

public class Helicoptero extends Aereo {

	public Helicoptero() {
		this("",0,0,0,"");
	}

	public Helicoptero(String nombreVehiculo, int nPersonasMax, int altitudMaxima, int altitudActual,
			String codigoOaci) {
		super(nombreVehiculo, nPersonasMax, altitudMaxima, altitudActual, codigoOaci);
		// TODO Auto-generated constructor stub
	}

	public Helicoptero(String nombreVehiculo, int nPersonasMax) {
		super(nombreVehiculo, nPersonasMax);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Helicoptero [toString()=" + super.toString() + "]";
	}

}
