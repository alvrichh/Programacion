package model;

public class Television extends Electrodomestico {

	private int resolucion;
	private boolean sintonizadorTdt;

	public Television() {
		setResolucion(20);
		setSintonizadorTdt(false);
	}

	public Television(double precio, double peso) {
		super(precio, peso);
		setResolucion(20);
		setSintonizadorTdt(false);
	}

	public Television(int resolucion, boolean sintonizadorTdt, double precioBase, Color color,
			ConsumoEnergetico consumoEnergetico, double peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTdt = sintonizadorTdt;
	}

	public Television(int i, Color color, ConsumoEnergetico consumoEnergetico, int j) {
		this(20,false,i, color, consumoEnergetico, j);

	}

	public double getPrecioFinal() {
		double resultado = super.getPrecioFinal();
		if (getResolucion() > 40)
			resultado *= 1.3;
		if (isSintonizadorTdt())
			resultado += 50;

		return resultado;
	}

	protected int getResolucion() {
		return resolucion;
	}

	protected void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	protected boolean isSintonizadorTdt() {
		return sintonizadorTdt;
	}

	protected void setSintonizadorTdt(boolean sintonizadorTdt) {
		this.sintonizadorTdt = sintonizadorTdt;
	}

	@Override
	public String toString() {
		return "Television [getPrecioFinal()=" + this.getPrecioFinal() + ", getResolucion()=" + getResolucion()
				+ ", isSintonizadorTdt()=" + isSintonizadorTdt() + ", getPrecioBase()=" + getPrecioBase()
				+ ", getColor()=" + getColor() + ", getConsumoEnergetico()=" + getConsumoEnergetico() + ", getPeso()="
				+ getPeso() + "]";
	}

}
