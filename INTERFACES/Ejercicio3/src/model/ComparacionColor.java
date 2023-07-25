package model;

import java.util.Comparator;

public class ComparacionColor implements Comparator<Terrestre>{

	@Override
	public int compare(Terrestre o1, Terrestre o2) {
		return o1.getColor().getValor().compareTo(o2.getColor().getValor());
	}

}
