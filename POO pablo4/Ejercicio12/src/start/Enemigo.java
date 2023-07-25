package start;

enum TipoEnemigo {
	BUZZBOMBER, CRABMEAT, COCONUTS, CHOPPER, MOTOBUG;
}

public class Enemigo {

	private TipoEnemigo tipoEnemigo;
	private int puntosVida;
	private int puntosDaño;

	public Enemigo() {

	}

	public Enemigo(TipoEnemigo tipoEnemigo) {
		setTipoEnemigo(tipoEnemigo);
		setPuntosVida(100);
		setPuntosDaño(70);

	}

	// Metodos
	public void restarVida(int cantidad) {
		if (getPuntosVida() - cantidad > 0)
			setPuntosVida(getPuntosVida() - cantidad);
	}

	public String infoEnemigo() {
		return "Tipo de enemigo: " + getTipoEnemigo() + "\nPuntos de vida: " + getPuntosVida() + "\nPuntos de daño: "
				+ getPuntosDaño();
	}

	// GETSET
	public TipoEnemigo getTipoEnemigo() {
		return tipoEnemigo;
	}

	public void setTipoEnemigo(TipoEnemigo tipoEnemigo) {
		this.tipoEnemigo = tipoEnemigo;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	public int getPuntosDaño() {
		return puntosDaño;
	}

	public void setPuntosDaño(int puntosDaño) {
		this.puntosDaño = puntosDaño;
	}

	@Override
	public String toString() {
		return "Enemigo [getTipoEnemigo()=" + getTipoEnemigo() + "]";
	}

}
