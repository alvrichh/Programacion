package model;

public class Pentagono extends Lineal implements Poligono, Calcular{
	private Double apotema;
	private Double altura;
	public Pentagono() {
		
	}
	public Pentagono(Double apotema, Double altura) {
		setApotema(apotema);
		setAltura(altura);
		
	}
	
	public Double getApotema() {
		return apotema;
	}
	public void setApotema(Double apotema) {
		this.apotema = apotema;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
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
