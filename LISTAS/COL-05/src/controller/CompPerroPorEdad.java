package controller;

import java.util.Comparator;

import model.Perro;

public class CompPerroPorEdad implements Comparator<Perro> {

	@Override
	public int compare(Perro p1, Perro p2) {
		return p1.getEdad().compareTo(p2.getEdad());
	}

}