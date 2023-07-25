package ferroviaria.maquinaria;

class Vagon {

	private double capacidadMax;
	private double capacidadActual;
	private String tipoMercancia;
	
	public Vagon() {
		
	}

	public double getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(double capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	public double getCapacidadActual() {
		return capacidadActual;
	}

	public void setCapacidadActual(double capacidadActual) {
		this.capacidadActual = capacidadActual;
	}

	public String getTipoMercancia() {
		return tipoMercancia;
	}

	public void setTipoMercancia(String tipoMercancia) {
		this.tipoMercancia = tipoMercancia;
	}

	@Override
	public String toString() {
		return "Vagon [getCapacidadMax()=" + getCapacidadMax() + ", getCapacidadActual()=" + getCapacidadActual()
				+ ", getTipoMercancia()=" + getTipoMercancia() + "]";
	}
	
	
}
