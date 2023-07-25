package model;

public class Motocicleta extends Terrestre {

	public Motocicleta() {
		super();
	}

	public Motocicleta(String nombreVehiculo, String matricula, String añoFabricacion, Color color) {
		super(nombreVehiculo, matricula, añoFabricacion, color);
	}

	@Override
	public String toString() {
		return "Motocicleta [toString()=" + super.toString() + "]";
	}



}
