package model;

import java.util.Comparator;

public class OrdenIntegranteNombre implements Comparator<Integrante> {

	@Override
	public int compare(Integrante o1, Integrante o2) {
		int i = 0;
		if(o1 != null && o2 != null) i = o1.getNombre().compareTo(o2.getNombre());
		return i;
	}

}
