package model;

public abstract class PoligonoRegular implements Figura{
	
	private static int contador = 0;
	Double lado;

	private Color color;
	
	public PoligonoRegular() {

		add();
		setLado(10.0);
		setColor(Color.azul);
	}
	public PoligonoRegular(Double lado, Color color) {
			add();
			setLado(lado);
			setColor(color);
	}
	
	private void add() {
		contador++;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		PoligonoRegular.contador = contador;
	}
	public Double getLado() {
		return lado;
	}


	public void setLado(Double lado) {
		this.lado = lado;
	}
	

}
