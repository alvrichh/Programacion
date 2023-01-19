package start;

public class Casa {
	// array de bombillas y de interruptores uno por cada bombilla, si apago el
	// interruptor general se cambia el estado de la bombilla

	private Bombilla bombilla[];
	private boolean interruptor[];

	private boolean interruptorGeneral;
	private boolean hayLuzGeneral;

	private int totalPtoLuz;

	public Casa(int totalPtoLuz) {
		this.totalPtoLuz = totalPtoLuz;
		bombilla = new Bombilla[totalPtoLuz];
		interruptor = new boolean[totalPtoLuz];
		for (int i = 0; i < totalPtoLuz; i++) {
			bombilla[i] = new Bombilla();
			interruptor[i] = false;
		}
		setHayLuzGeneral(true);
		setInterruptorGeneral(true);
	}

	public boolean estaEncendidoInterruptorGeneral() {
		return interruptorGeneral;
	}

	public void setInterruptorGeneral(boolean estado) {
		this.interruptorGeneral = estado;
		if (estaEncendidoInterruptorGeneral()) {
			if (hayLuzGeneral()) {
				for (int i = 0; i < totalPtoLuz; i++) {
					if (interruptor[i]) {
						bombilla[i].encender();
					} else {
						bombilla[i].apagar();
					}
				}
			} else {
				for (int i = 0; i < totalPtoLuz; i++) {
					bombilla[i].apagar();
				}
			}
		} else {
			for (int i = 0; i < totalPtoLuz; i++) {
				bombilla[i].apagar();
			}
		}
	}

	public boolean hayLuzGeneral() {
		return hayLuzGeneral;
	}

	public void setHayLuzGeneral(boolean estado) {
		this.hayLuzGeneral = estado;
	}

	public void encenderInterruptor(int i) {
		if (i >= 0 && i < totalPtoLuz) {
			interruptor[i] = true;
			if (hayLuzGeneral() && estaEncendidoInterruptorGeneral()) {
				bombilla[i].encender();
			} else {
				bombilla[i].apagar();
			}
		}
	}

	public void apagarInterruptor(int i) {
		if (i >= 0 && i < totalPtoLuz) {
			interruptor[i] = false;
			bombilla[i].apagar();
		}
	}

}
