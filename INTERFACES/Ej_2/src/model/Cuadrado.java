package model;

public class Cuadrado extends PoligonoRegular {

	public Cuadrado() {
		super();
	}

	public Cuadrado(Double lado, Color color) {
		super(lado, color);
	}
	@Override
	public Double getArea() {
		return getLado()*getLado();
	}
}
