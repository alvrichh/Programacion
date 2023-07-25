package model;

public class Circulo extends Curva implements Calcular{
	private Double radio;

	public Circulo() {
		
	}

	public Circulo(Double radio) {
		setRadio(radio);
	}
	
	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
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
