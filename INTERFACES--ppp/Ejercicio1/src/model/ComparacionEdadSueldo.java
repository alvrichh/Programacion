package model;

import java.util.Comparator;

public class ComparacionEdadSueldo implements Comparator<Cliente> {

	@Override
	public int compare(Cliente o1, Cliente o2) {
		int resultado = 0;
		if (o1.getEdad() > o2.getEdad())
			resultado = 1;
		if (o1.getEdad() < o2.getEdad())
			resultado = -1;
		if (o1.getEdad() == o2.getEdad()) {
			resultado = 0;
			if (o1.getSueldo() > o2.getSueldo())
				resultado = 1;
			if (o1.getSueldo() == o2.getSueldo())
				resultado = 0;
			if (o1.getSueldo() < o2.getSueldo())
				resultado = -1;
		}

		return resultado;
	}

}
