package unico;

public class Emisora {

	final double SALTOS = 0.5;
	final double FRECUENCIAMINIMA = 80.00;
	final double FRECUENCIAMAXIMA = 108.00;

	private double frecuencia;

	// Constructores
	Emisora() {
		setFrecuencia(80);
	}

	// Metodos de la clase
	public void up() {
		if (getFrecuencia() - SALTOS >= FRECUENCIAMAXIMA)
			setFrecuencia(FRECUENCIAMINIMA);
		else {
			setFrecuencia(getFrecuencia() + SALTOS);
		}
	}

	public void down() {
		if (getFrecuencia() - SALTOS <= FRECUENCIAMINIMA)
			setFrecuencia(FRECUENCIAMAXIMA);
		else {
			setFrecuencia(getFrecuencia() - SALTOS);
		}
	}
	
	public double display() {
		return getFrecuencia();
	}

	// Setters And Getters
	private double getFrecuencia() {
		return frecuencia;
	}

	private void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

}
