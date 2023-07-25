package model;

import java.util.Comparator;

public class CompAlumnoPorDni implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		return o1.getDni().compareTo(o2.getDni());
	}

}