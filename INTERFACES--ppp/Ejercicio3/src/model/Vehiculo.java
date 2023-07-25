package model;

public class Vehiculo {

	private String nombreVehiculo;
	private int nPersonasMax;
	private int nPersonasActual;

	public Vehiculo() {
		this("", 0);
	}

	public Vehiculo(String nombreVehiculo, int nPersonasMax) {
		super();
		this.nombreVehiculo = nombreVehiculo;
		this.nPersonasMax = nPersonasMax;
	}

	public void addPerson() {
		setnPersonasActual(getnPersonasActual() + 1);
	}

	public String getNombreVehiculo() {
		return nombreVehiculo;
	}

	public void setNombreVehiculo(String nombreVehiculo) {
		this.nombreVehiculo = nombreVehiculo;
	}

	public int getnPersonasMax() {
		return nPersonasMax;
	}

	public void setnPersonasMax(int nPersonasMax) {
		this.nPersonasMax = nPersonasMax;
	}

	public int getnPersonasActual() {
		return nPersonasActual;
	}

	public void setnPersonasActual(int nPersonasActual) {
		if (nPersonasActual >= 0 && nPersonasActual <= getnPersonasMax())
			this.nPersonasActual = nPersonasActual;

	}

	@Override
	public String toString() {
		return "Vehiculo [getNombreVehiculo()=" + getNombreVehiculo() + ", getnPersonasMax()=" + getnPersonasMax()
				+ ", getnPersonasActual()=" + getnPersonasActual() + ", toString()=" + super.toString() + "]";
	}

}
