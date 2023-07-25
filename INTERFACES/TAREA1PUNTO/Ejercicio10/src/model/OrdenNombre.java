package model;

import java.util.Comparator;

public class OrdenNombre implements Comparator<Agrupacion> {

	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int r = 0;
		if (o1 != null && o2 != null && o1.getNombre() != null && o2.getNombre() != null)
			r = o1.getNombre().compareTo(o2.getNombre());
		return r;
	}

}
