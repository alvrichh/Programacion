package model;

public abstract class PoligonoRegular implements Figura {

	double lado;
	static int contadorPoligonos = 0;
	Color color;

	public PoligonoRegular() {
		this(10,Color.AZUL);
	}
	
	
	public PoligonoRegular(double lado, Color color) {
		super();
		this.lado = lado;
		this.color = color;
		contadorPoligonos++;
	}

	public static int getContadorPoligonos() {
		return contadorPoligonos;
	}

	public static void setContadorPoligonos(int contadorPoligonos) {
		PoligonoRegular.contadorPoligonos = contadorPoligonos;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
