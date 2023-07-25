package model;

public class Circulo extends Curva implements Calcular{

	private double radio;

	public Circulo() {
		
	}
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * getRadio() * getRadio();
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return (getRadio()*getRadio()) * Math.PI;
	}

	@Override
	public int[] distanciaOrigen() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
