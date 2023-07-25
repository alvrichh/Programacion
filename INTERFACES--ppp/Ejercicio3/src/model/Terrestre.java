package model;

public class Terrestre extends Vehiculo {

	public enum Color {
		AZUL(4), AMARILLO(2), ROJO(1), VERDE(3);

		private Integer valor;

		private Color(Integer valor) {
			setValor(valor);
		}

		public Integer getValor() {
			return valor;
		}

		public void setValor(Integer valor) {
			this.valor = valor;
		}

	}

	private String matricula;
	private String añoFabricacion;
	private Color color;

	public Terrestre() {
		this("","","",Color.AZUL);
	}

	public Terrestre(String nombreVehiculo, String matricula, String añoFabricacion, Color color) {
		super(nombreVehiculo, 10);
		this.matricula = matricula;
		this.añoFabricacion = añoFabricacion;
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(String añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean equals(Terrestre t) {
		return t.getMatricula().equals(getMatricula());
	}

	@Override
	public String toString() {
		return "Terrestre [getMatricula()=" + getMatricula() + ", getAñoFabricacion()=" + getAñoFabricacion()
				+ ", getColor()=" + getColor() + ", toString()=" + super.toString() + "]";
	}

}
