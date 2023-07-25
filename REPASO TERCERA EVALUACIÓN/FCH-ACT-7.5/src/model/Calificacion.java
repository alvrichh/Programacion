package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Calificacion implements Serializable{

	private Double prueba1;
	private Double prueba2;
	private Double prueba3;
	private Double prueba4;
	private Double media;

	public Calificacion() {
		this(0.0, 0.0, 0.0, 0.0);
	}

	public Calificacion(Double prueba1, Double prueba2, Double prueba3, Double prueba4) {
		setPrueba1(prueba1);
		setPrueba2(prueba2);
		setPrueba3(prueba3);
		setPrueba4(prueba4);
		setMedia();
	}

	public Double getPrueba1() {
		return prueba1;
	}

	public void setPrueba1(Double prueba1) {
		this.prueba1 = prueba1;
	}

	public Double getPrueba2() {
		return prueba2;
	}

	public void setPrueba2(Double prueba2) {
		this.prueba2 = prueba2;
	}

	public Double getPrueba3() {
		return prueba3;
	}

	public void setPrueba3(Double prueba3) {
		this.prueba3 = prueba3;
	}

	public Double getPrueba4() {
		return prueba4;
	}

	public void setPrueba4(Double prueba4) {
		this.prueba4 = prueba4;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia() {
		media = (getPrueba1() + getPrueba2() + getPrueba3() + getPrueba4()) / 4.0;
	}

	@Override
	public String toString() {
		return "Calificacion [Temario =" + getPrueba1() + ", Prácticas=" + getPrueba2() + ", PD=" + getPrueba3() + ", UD=" + getPrueba4() + ", media=" + getMedia() + "]";
	}

}