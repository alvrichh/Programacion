package model;

import java.util.Arrays;

public class Serie extends Multimedia implements Reproducible {

	private String creador;
	private int numTemporadas;
	private String[] capitulos = new String[10];

	public Serie() {
		this("", 0, "", 0);

	}

	public Serie(String titulo, int añoEstreno, String creador, int numTemporadas) {
		super(titulo, añoEstreno);
		this.creador = creador;
		this.numTemporadas = numTemporadas;
	}

	public boolean addCapitulo(String nombreCapitulo) {
		boolean resultado = false;
		for (int i = 0; i < capitulos.length; i++) {
			if (capitulos[i] == null) {
				capitulos[i] = nombreCapitulo;
				resultado = true;
				break;
			}
		}

		return resultado;
	}

	public boolean delCapitulo(String nombreCapitulo) {
		boolean resultado = false;
		for (int i = 0; i < capitulos.length; i++) {
			if (capitulos[i] == nombreCapitulo) {
				capitulos[i] = null;
				resultado = true;
				break;
			}
		}
		return resultado;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public String[] getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(String[] capitulos) {
		this.capitulos = capitulos;
	}

	@Override
	public String toString() {
		return "Serie [getCreador()=" + getCreador() + ", getNumTemporadas()=" + getNumTemporadas()
				+ ", getCapitulos()=" + Arrays.toString(getCapitulos()) + ", toString()=" + super.toString() + "]";
	}

	@Override
	public String play() {
		return "Reproduciendo serie: " + getTitulo() + ", Capitulo: " + getCapitulos()[0];
	}

	@Override
	public String pause() {
		return "Pausando serie: " + getTitulo() + ", Capitulo: " + getCapitulos()[0];
	}

	@Override
	public String stop() {
		return "Parando serie: " + getTitulo() + ", Capitulo: " + getCapitulos()[0];
	}

}
