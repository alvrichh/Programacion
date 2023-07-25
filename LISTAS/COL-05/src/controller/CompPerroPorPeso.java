package controller;

import java.util.Comparator;

import model.Perro;

public class CompPerroPorPeso implements Comparator<Perro> {

	@Override
	public int compare(Perro p1, Perro p2) {
		return p1.getPeso().compareTo(p2.getPeso());
	}

}