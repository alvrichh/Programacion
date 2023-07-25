package model;

import java.util.Comparator;

public class OrdenAnyo implements Comparator<Multimedia> {

	@Override
	public int compare(Multimedia o1, Multimedia o2) {
		int r = 0;
		if (o1 != null && o2 != null) {
			r = o1.getAnyoEstreno().compareTo(o2.getAnyoEstreno());
		}
		return r;
	}
}
