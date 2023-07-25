package model;

public class Coche extends Terrestre {

	public Coche() {
		super();
	}

	public Coche(String nombreVehiculo, String matricula, String añoFabricacion, Color color) {
		super(nombreVehiculo, matricula, añoFabricacion, color);
	}

	@Override
	public String toString() {
		return "Coche [toString()=" + super.toString() + "]";
	}

}
