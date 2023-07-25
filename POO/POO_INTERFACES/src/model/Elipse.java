package model;

public class Elipse extends Curva implements Calcular {

	private Double radioMayor;
	private Double radioMenor;

	public Elipse() {
	}

	public Elipse(Double radioMayor, Double radioMenor) {
		setRadioMayor(radioMayor);
		setRadioMenor(radioMenor);
	}

	public Double getRadioMayor() {
		return radioMayor;
	}

	public void setRadioMayor(Double radioMayor) {
		this.radioMayor = radioMayor;
	}

	public Double getRadioMenor() {
		return radioMenor;
	}

	public void setRadioMenor(Double radioMenor) {
		this.radioMenor = radioMenor;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double perimetro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer distanciaOrig() {
		// TODO Auto-generated method stub
		return null;
	}

}
