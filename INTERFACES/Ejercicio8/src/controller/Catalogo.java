package controller;

import java.util.Arrays;

import model.Multimedia;
import model.OrdenAnyo;
import model.OrdenId;
import model.OrdenTitulo;

public class Catalogo {

	Multimedia[] elementos = new Multimedia[10];

	public boolean addMultimedia(Multimedia multimedia) {
		boolean resultado = false;
		for (int i = 0; i < elementos.length; i++) {
			if (elementos[i] == null) {
				elementos[i] = multimedia;
				break;
			}
		}
		return resultado;
	}

	public boolean delMultimedia(Multimedia multimedia) {
		boolean resultado = false;
		for (int i = 0; i < elementos.length; i++) {
			if (elementos[i].getTitulo().equals(multimedia.getTitulo())) {
				elementos[i] = null;
				break;
			}
		}
		return resultado;
	}

	public void ordenarPorId() {
		Arrays.sort(elementos, new OrdenId());
	}

	public void ordenarPorTitulo() {
		Arrays.sort(elementos, new OrdenTitulo());
	}

	public void ordenarPorAnyo() {
		Arrays.sort(elementos, new OrdenAnyo());
	}

	public int numeroDeElementos() {
		return elementos[1].getCounter();
	}

	public Multimedia[] getElementos() {
		return elementos;
	}

	public void setElementos(Multimedia[] elementos) {
		this.elementos = elementos;
	}

	@Override
	public String toString() {
		return "Catalogo [elementos=" + Arrays.toString(elementos) + ", numeroDeElementos()=" + numeroDeElementos()
				+ "]";
	}

}
