package transporte;

public class Caja {

	public enum Unidades {
		CM, M;
	}

	private double ancho;
	private double alto;
	private double fondo;
	private Unidades u;
	private Etiqueta etiqueta;
	
	public Caja() {
		setEtiqueta(new Etiqueta());
	}

	public Caja(double ancho, double alto, double fondo, Unidades u) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		setU(u);
		setEtiqueta(new Etiqueta());
	}

	public double getVolumen() {
		return getU() == Unidades.M ? getAncho() * getAlto() * getFondo()
				: (getAncho() / 100) * (getAlto() / 100) * (getFondo() / 100);
	}

	private double getAncho() {
		return ancho;
	}

	private void setAncho(double ancho) {
		this.ancho = ancho;
	}

	private double getAlto() {
		return alto;
	}

	private void setAlto(double alto) {
		this.alto = alto;
	}

	private double getFondo() {
		return fondo;
	}

	private void setFondo(double fondo) {
		this.fondo = fondo;
	}

	private Unidades getU() {
		return u;
	}

	private void setU(Unidades u) {
		this.u = u;
	}


	@Override
	public String toString() {
		return "Caja [getVolumen()=" + getVolumen() + ", getAncho()=" + getAncho() + ", getAlto()=" + getAlto()
				+ ", getFondo()=" + getFondo() + ", getU()=" + getU() + ", getEtiqueta()=" + getEtiqueta() + "]";
	}

	public Etiqueta getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(Etiqueta etiqueta) {
		this.etiqueta = etiqueta;
	}

}
