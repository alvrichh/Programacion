package model;

import java.util.Comparator;

public class OrdenPuntos implements Comparator<Agrupacion> {

	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		Integer n1 = 0;
		Integer n2 = 0;
		;
		if (o1 != null && o2 != null && !(o1 instanceof Romancero) && !(o2 instanceof Romancero)) {
			n1 = ((AgrupacionOficial) o1).getPuntosObtenidos();
			n2 = ((AgrupacionOficial) o2).getPuntosObtenidos();
		}

		return n1.compareTo(n2);
	}

}
