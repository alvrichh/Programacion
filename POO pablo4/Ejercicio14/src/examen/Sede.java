package examen;

import java.util.Arrays;

public class Sede {

	public enum CiudadCapitalAndalucia {
		SEVILLA, CORDOBA, MALAGA, JAEN, HUELVA, CADIZ, ALMERIA, GRANADA;
	}

	private String codigoSede;
	private CiudadCapitalAndalucia ciudadCapitalAndalucia;
	private int numeroMaximoOpositores;
	private Pregunta[] pregunta;;
	private Opositor[] opositor;

	public Sede() {
		
	}

	public Sede(String codigoSede, CiudadCapitalAndalucia ciudadCapitalAndalucia, int numeroMaximoOpositores) {
		super();
		this.codigoSede = codigoSede;
		this.ciudadCapitalAndalucia = ciudadCapitalAndalucia;
		this.numeroMaximoOpositores = numeroMaximoOpositores;
		this.pregunta = new Pregunta[100];
		this.opositor = new Opositor[numeroMaximoOpositores];

	}

	public Sede(int numeroMaximoOpositores) {
		opositor = new Opositor[numeroMaximoOpositores];
		this.numeroMaximoOpositores = numeroMaximoOpositores;
		setCodigoSede("SINDATOS");
		this.pregunta = new Pregunta[100];
		setCiudadCapitalAndalucia(CiudadCapitalAndalucia.ALMERIA);

	}

	public void addOpositor() {
		for (int i = 0; i < opositor.length; i++) {
			if (opositor[i] == null)
				opositor[i] = new Opositor();
			i = opositor.length;
		}
	}

	public void addOpositor(String nombre, String apellidos, int añoNacimiento, boolean requiereAdaptacion,
			String descripcionAdaptacion) {
		for (int i = 0; i < this.opositor.length; i++) {
			if (this.opositor[i] == null) {
				this.opositor[i] = new Opositor(nombre, apellidos, añoNacimiento, requiereAdaptacion,
						descripcionAdaptacion);
				i = this.opositor.length;
			}

		}
	}

	public void removeOpositor() {
		for (int i = opositor.length - 1; i >= 0; i--) {
			if (opositor[i] != null) {
				opositor[i] = null;
				i = 0;
			}

		}
	}

	public Opositor[] getOpositor() {
		return opositor;
	}

	public void setOpositor(Opositor[] opositor) {
		this.opositor = opositor;
	}

	public String getCodigoSede() {
		return codigoSede;
	}

	public void setCodigoSede(String codigoSede) {
		this.codigoSede = codigoSede;
	}

	public CiudadCapitalAndalucia getCiudadCapitalAndalucia() {
		return ciudadCapitalAndalucia;
	}

	public void setCiudadCapitalAndalucia(CiudadCapitalAndalucia ciudadCapitalAndalucia) {
		this.ciudadCapitalAndalucia = ciudadCapitalAndalucia;
	}

	public int getNumeroMaximoOpositores() {
		return numeroMaximoOpositores;
	}

	public void setNumeroMaximoOpositores(int numeroMaximoOpositores) {
		this.numeroMaximoOpositores = numeroMaximoOpositores;
	}

	public Pregunta[] getPregunta() {
		return pregunta;
	}

	public void setPregunta(Pregunta[] pregunta) {
		this.pregunta = pregunta;
	}

	@Override
	public String toString() {
		return "Sede [getOpositor()=" + Arrays.toString(getOpositor()) + ", getCodigoSede()=" + getCodigoSede()
				+ ", getCiudadCapitalAndalucia()=" + getCiudadCapitalAndalucia() + ", getNumeroMaximoOpositores()="
				+ getNumeroMaximoOpositores() + ", getPregunta()=" + Arrays.toString(getPregunta()) + "]";
	}
}
