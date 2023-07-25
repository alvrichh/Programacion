package model;

public class Cuadrado extends Lineal implements Poligono, Calcular{
	private Double lado;
	
	public Cuadrado() {
		
	}

	public Cuadrado(Double lado) {
		setLado(lado);
	}
	

	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}

	@Override
	public Integer numVertices() {
		// TODO Auto-generated method stub
		return null;
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
