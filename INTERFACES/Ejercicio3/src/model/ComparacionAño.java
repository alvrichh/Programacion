package model;

import java.util.Comparator;

public class ComparacionAño implements Comparator<Terrestre>{

	@Override
	public int compare(Terrestre o1, Terrestre o2) {
		return o1.getAñoFabricacion().compareTo(o2.getAñoFabricacion());
	}

}
