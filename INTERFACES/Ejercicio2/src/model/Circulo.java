package model;

public abstract class Circulo implements Figura {

	private double radio;
	Color color;

	public double getArea() {
		return Math.PI * radio * radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", getArea()=" + getArea() + "]";
	}

}
