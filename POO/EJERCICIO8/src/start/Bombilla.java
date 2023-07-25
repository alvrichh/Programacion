package start;

public class Bombilla {
//cada array de interruptor

	private boolean estado;
	
	public Bombilla() {
	}

	public EstadoBombilla getestado() {
		return estado ? EstadoBombilla.ENCENDIDA : EstadoBombilla.APAGADA;

	}
	public void encender() {
		this.estado = true;
	}

	public void apagar() {
		this.estado = false;
	}

	
}
