package model;

import java.util.Comparator;

public class OrdenId implements Comparator<Multimedia> {

	@Override
	public int compare(Multimedia o1, Multimedia o2) {
		int r = 0;
		if (o1 != null && o2 != null) {
			r = o1.getCounter().compareTo(o2.getCounter());
		}
		return r;
	}

}
