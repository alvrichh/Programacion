package model;

public class Cuadrado extends Lineal implements Poligono, Calcular{

	private double lado;
	
	public Cuadrado() {
		
	}

	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return getLado() * getLado();
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return getLado() * 4;
	}

	@Override
	public int numVertices() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int[] distanciaOrigen() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
