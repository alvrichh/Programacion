package examen;

import java.util.Arrays;

public class Pregunta {

	private String enunciado;
	private boolean esVerdadero;
	private Opcion[] opcion;;

	public Pregunta() {
		opcion = new Opcion[3];
		for (int i = 0; i < opcion.length; i++) {
			opcion[i] = new Opcion();
		}
	}

	public Pregunta(String enunciado, int nOpciones) {
		super();
		opcion = new Opcion[nOpciones];
		for (int i = 0; i < opcion.length; i++) {
			opcion[i] = new Opcion();
		}
		this.enunciado = enunciado;

	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public boolean isEsVerdadero() {
		return esVerdadero;
	}

	public void setEsVerdadero(boolean esVerdadero) {
		this.esVerdadero = esVerdadero;
	}

	public Opcion[] getOpcion() {
		return opcion;
	}

	public void setOpcion(Opcion[] opcion) {
		this.opcion = opcion;
	}

	@Override
	public String toString() {
		return "Pregunta [getEnunciado()=" + getEnunciado() + ", isEsVerdadero()=" + isEsVerdadero() + ", getOpcion()="
				+ Arrays.toString(getOpcion()) + "]";
	}

}
