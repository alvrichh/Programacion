package model;

import java.util.Comparator;

public class OrdenMusicaLetra implements Comparator<Agrupacion> {
//Comparamos primero por muisca y luegro por letra
	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int r = 0;
		if (o1 != null && o2 != null) {
			r = o1.getAutorMusica().compareTo(o2.getAutorMusica());
			if (r == 0) {
				r = o1.getAutorLetra().compareTo(o2.getAutorLetra());
			}
		}
		return r;
	}

}
