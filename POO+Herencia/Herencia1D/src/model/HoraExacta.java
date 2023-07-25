package model;

public class HoraExacta extends Hora {

	private int segundo;

	public HoraExacta() {

	}

	public HoraExacta(int hora, int minuto, int segundo) {
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
	}

	public void inc() {
		if (getSegundo() + 1 >= 60) {
			setSegundo(0);
			setMinuto(60);
		} else {
			setSegundo(getSegundo() + 1);

		}
	}

	public boolean sonIguales(int hora, int minuto, int segundo) {
		boolean resultado = false;
		if (getHora() == hora && getMinuto() == minuto && getSegundo() == segundo)
			resultado = true;

		return resultado;
	}

	// Bueno
	public boolean esIgual(HoraExacta horaExacta) {
		return horaExacta.getHora() == getHora() && horaExacta.getMinuto() == getMinuto()
				&& horaExacta.getSegundo() == getSegundo();
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if (segundo >= 0 && segundo < 60) {
			this.segundo = segundo;
		}
		if (segundo >= 60) {
			setMinuto(getMinuto() + 1);
			setSegundo(0);
		}
	}

	@Override
	public String toString() {
		return getHora() + ":" + getMinuto() + ":" + getSegundo();
	}

}
