package model;

public class Hora {

	private int hora;
	private int minuto;

	public Hora() {

	}

	public Hora(int hora, int minuto) {
		setHora(hora);
		setMinuto(minuto);

	}

	public void inc() {
		if (getMinuto() + 1 < 60)
			setMinuto(getMinuto() + 1);
		else {
			setHora(getHora() + 1);
			setMinuto(0);
		}
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora >= 0 && hora <= 24)
			this.hora = hora;

	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if (minuto >= 0 && minuto < 60)
			this.minuto = minuto;
		else {
			if (minuto >= 60)
				setHora(getHora() + 1);
			this.minuto = 0;
		}

	}

	@Override
	public String toString() {
		return getHora() + ":" + getMinuto();
	}

}
