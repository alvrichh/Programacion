package model;

public class Pentagono extends Lineal implements Poligono, Calcular{

	private double apotema;
	private double altura;
	
	public Pentagono() {
		
	}
	
	

	public Pentagono(double apotema, double altura) {
		super();
		this.apotema = apotema;
		this.altura = altura;
	}



	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}



	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int numVertices() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int[] distanciaOrigen() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
