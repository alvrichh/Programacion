package bombilla;

public class Bombilla {

	private boolean estadoBombilla = true;
	private boolean interruptorParticular = true;

	// Constructores de la clase
	public Bombilla() {
	}

	// Métodos de la clase
	public boolean estadoBombilla() {
		return this.estadoBombilla;
	}

	public void encenderBombilla() {
		if (isInterruptorParticular())
			setEstadoBombilla(true);
		setInterruptorParticular(true);

	}

	public void apagarBombilla() {
		setInterruptorParticular(true);
		setEstadoBombilla(false);
	}

	// Getters And Setters

	public boolean isEstadoBombilla() {
		return estadoBombilla;
	}

	public void setEstadoBombilla(boolean estadoBombilla) {
		this.estadoBombilla = estadoBombilla;
	}

	@Override
	public String toString() {
		return "Bombilla [estadoBombilla=" + estadoBombilla + "]";
	}

	public boolean isInterruptorParticular() {
		return interruptorParticular;
	}

	public void setInterruptorParticular(boolean interruptorParticular) {
		this.interruptorParticular = interruptorParticular;
	}

}
