package model;

public class Cuadrado extends PoligonoRegular {

	public Cuadrado() {
		this(10, Color.AMARILLO);
	}

	public Cuadrado(double lado, Color color) {
		super(lado, color);


	}

	@Override
	public double getArea() {
		return getLado() * getLado();
	}

	@Override
	public String toString() {
		return "Cuadrado [color=" + color + ", getArea()=" + getArea() + ", getLado()=" + getLado() + "]";
	}

}
