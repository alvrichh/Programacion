package model;

public class Circulo implements Figura{
	
	private Double radio;
	public Circulo() {
		
	}
	
	public Double getRadio() {
		return radio;
	}
	public void setRadio(Double radio) {
		this.radio = radio;
	}
	@Override
	public Double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * getRadio() * getRadio();
	}
	
}
