package bombilla;

import java.util.Arrays;

public class Casa {

	private boolean luzGeneral = true;
	private boolean interruptorGeneral = true;
	Bombilla[] bombillas = new Bombilla[3];

	// Constructores
	public Casa() {
		for (int i = 0; i < bombillas.length; i++) {
			bombillas[i] = new Bombilla();
			if (isLuzGeneral() && isInterruptorGeneral() && bombillas[i].isInterruptorParticular())
				bombillas[i].encenderBombilla();
			else {
				bombillas[i].setEstadoBombilla(false);
			}
		}

	}

	// Metodos de la clase

	// Getters and setters
	public Bombilla[] getBombillas() {
		return bombillas;
	}

	public void setBombillas(Bombilla[] bombillas) {
		this.bombillas = bombillas;
	}

	public boolean isInterruptorGeneral() {
		return interruptorGeneral;
	}

	public void setInterruptorGeneral(boolean interruptorGeneral) {
		this.interruptorGeneral = interruptorGeneral;
		if (!isInterruptorGeneral() || !isLuzGeneral()) {
			for (int i = 0; i < bombillas.length; i++) {
				bombillas[i].setEstadoBombilla(false);
			}
		} else {
			for (int i = 0; i < bombillas.length; i++) {
				if (bombillas[i].isInterruptorParticular())
					bombillas[i].setEstadoBombilla(true);
			}
		}
	}

	@Override
	public String toString() {
		return "Casa [interruptorGeneral=" + interruptorGeneral + ", bombillas=" + Arrays.toString(bombillas) + "]";
	}

	public boolean isLuzGeneral() {
		return luzGeneral;

	}

	public void setLuzGeneral(boolean luzGeneral) {
		this.luzGeneral = luzGeneral;
		if (!isInterruptorGeneral() || !isLuzGeneral()) {
			for (int i = 0; i < bombillas.length; i++) {
				bombillas[i].setEstadoBombilla(false);
			}
		} else {
			for (int i = 0; i < bombillas.length; i++) {
				if (bombillas[i].isInterruptorParticular())
					bombillas[i].setEstadoBombilla(true);
			}
		}
	}

}
