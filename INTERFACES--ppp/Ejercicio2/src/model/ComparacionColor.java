package model;

import java.util.Comparator;

public class ComparacionColor implements Comparator<PoligonoRegular> {

	@Override
	public int compare(PoligonoRegular o1, PoligonoRegular o2) {
		return o1.color.compareTo(o2.color);
	}

}
