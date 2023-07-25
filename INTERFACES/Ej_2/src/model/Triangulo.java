package model;

public class Triangulo extends PoligonoRegular {
	
	private Double Altura;

	public Triangulo() {
		super();
	}
	
	public Triangulo(Double lado, Color color) {
		super(lado, color);
	}
	

	@Override
	public Double getArea() {
		return (getLado()+getAltura())/2 ;
	}

	public Double getAltura() {
		return Altura;
	}

	public void setAltura(Double altura) {
		Altura = altura;
	}

}
