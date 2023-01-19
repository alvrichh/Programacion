package start;

public class SintonizadorFM {
	// CONSTANTES
	private final double FRECMIN = 80.0;
	private final double FRECMAX = 108.0;
	private final double SALTO = 0.5;
	// VARIABLES
	private double dial;

	public SintonizadorFM() {
		setDial(FRECMIN);
	}

	public double display() {
		return dial;
	}

	private void setDial(double dial) {
		this.dial = dial;
	}

	public void up() {
		if (display() + SALTO > FRECMAX) {
			setDial(FRECMIN);
		} else {
			setDial(display() + SALTO);
		}
	}
	
	public void down() {
		if (display() - SALTO < FRECMIN) {
			setDial(FRECMAX);
		} else {
			setDial(display() - SALTO);
		}
	}



}