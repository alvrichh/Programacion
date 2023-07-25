package model;

public class CajaCarton extends Caja {
	
	private static int contCajaCarton = 0;
	private Etiqueta etiqueta;
	private int idEtiqueta;

	public CajaCarton(double ancho, double alto, double fondo) {
		super(ancho, alto, fondo, Unidades.CM);
		setEtiqueta(new Etiqueta());
		setContCajaCarton(getContCajaCarton() + 1);

	}


	public double getVolumen() {
		return super.getVolumen() * 0.80;
	}

	public Etiqueta getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(Etiqueta etiqueta) {
		this.etiqueta = etiqueta;
	}

	public int getIdEtiqueta() {
		return idEtiqueta;
	}

	public void setIdEtiqueta(int idEtiqueta) {
		this.idEtiqueta = idEtiqueta;
	}


	public static int getContCajaCarton() {
		return contCajaCarton;
	}


	public static void setContCajaCarton(int contCajaCarton) {
		CajaCarton.contCajaCarton = contCajaCarton;
	}
}
