package model;

public class Triangulo extends Lineal implements Calcular, Poligono {

	private Double base;
	private Double altura;
	
	public Triangulo() {
	}
	public Triangulo(Double base, Double altura) {
		setBase(base);
		setAltura(altura);
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

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	@Override
	public Integer distanciaOrig() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
