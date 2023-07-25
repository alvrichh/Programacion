package model;

public class Triangulo extends PoligonoRegular implements Comparable<PoligonoRegular> {

	private double altura;

	public Triangulo() {
		this(10, Color.AMARILLO, 10);
	}

	public Triangulo(double lado, Color color, double altura) {
		super(lado, color);
		setAltura(altura);
	}

	@Override
	public double getArea() {
		return getLado() * getAltura();
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean compareTo() {
		boolean resultado = false;

		return resultado;
	}

	@Override
	public int compareTo(PoligonoRegular o) {
		int resultado = 0;
		if (o.getLado() > this.getLado())
			resultado = 1;
		if (o.getLado() == this.getLado())
			resultado = 0;
		if (o.getLado() < this.getLado())
			resultado = -1;

		return resultado;

	}

	@Override
	public String toString() {
		return "Triangulo [altura=" + altura + ", lado=" + lado + ", color=" + color + ", getArea()=" + getArea()
				+ ", getAltura()=" + getAltura() + "]";
	}

}
