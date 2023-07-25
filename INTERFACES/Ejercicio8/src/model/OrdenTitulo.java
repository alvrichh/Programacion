package model;

import java.util.Comparator;

public class OrdenTitulo implements Comparator<Multimedia> {

	@Override
	public int compare(Multimedia o1, Multimedia o2) {
		int r = 0;
		if (o1 != null && o2 != null) {
			r = o1.getTitulo().compareTo(o2.getTitulo());
		}
		return r;
	}

}
