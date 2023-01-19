package ferroviaria.maquinaria;

public class Vagon {

	private int capMax; // capacidad
	private int capActual;
	private String mercancia;

	public Vagon() {

	}

	// =========GETTERS Y SETTERS==========

	public int getCapMax() {
		return capMax;
	}

	public void setCapMax(int capMax) {
		this.capMax = capMax;
	}

	public int getCapActual() {
		return capActual;
	}

	public void setCapActual(int capActual) {
		this.capActual = capActual;
	}

	public String getMercancia() {
		return mercancia;
	}

	public void setMercancia(String mercancia) {
		this.mercancia = mercancia;
	}

}
