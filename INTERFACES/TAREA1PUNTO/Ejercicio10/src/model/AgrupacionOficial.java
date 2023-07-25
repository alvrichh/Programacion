package model;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion {

	private Integrante[] integrantes;
	private int puntosObtenidos;

	protected AgrupacionOficial() {
		this(0, "", "", "", "", "");
	}

	AgrupacionOficial(int puntosObtenidos, String nombre, String autor, String autorMusica, String autorLetra,
			String tipo) {
		super(nombre, autor, autorMusica, autorLetra, tipo);
		setPuntosObtenidos(puntosObtenidos);
		// No especifica el tamaño de este array, asigno 5
		setIntegrantes(new Integrante[5]);
	}

	public boolean insertarIntegrante(Integrante o) { // NO_UCD (unused code)
		boolean isAdded = false;
		boolean isRep = false;
		for (int i = 0; i < integrantes.length; i++) {
			if (integrantes[i] != null && integrantes[i].equals(o)) {
				isRep = true;
				break;
			}
		}
		if (!isRep) {
			for (int i = 0; i < integrantes.length; i++) {
				if (integrantes[i] == null) {
					integrantes[i] = o;
					isAdded = true;
					break;
				}
			}
		}
		return isAdded;
	}

	public boolean eliminarIntegrante(Integrante o) { // NO_UCD (unused code)
		boolean isDeleted = false;
		for (int i = 0; i < integrantes.length; i++) {
			if (integrantes[i] != null && integrantes[i].equals(o)) {
				integrantes[i] = null;
				isDeleted = true;
				break;
			}
		}
		return isDeleted;
	}

	public abstract String caminitoFalla();

	public Integrante[] getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(Integrante[] integrantes) {
		this.integrantes = integrantes;
	}

	@Override
	public String toString() {
		return "AgrupacionOficial [getIntegrantes()=" + Arrays.toString(getIntegrantes()) + ", toString()="
				+ super.toString() + "]";
	}

	public int getPuntosObtenidos() {
		return puntosObtenidos;
	}

	public void setPuntosObtenidos(int puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
	}

}