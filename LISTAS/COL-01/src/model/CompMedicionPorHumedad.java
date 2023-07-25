package model;

import java.util.Comparator;

public class CompMedicionPorHumedad implements Comparator<Medicion>{

	@Override
	public int compare(Medicion o1, Medicion o2) {
		return o1.getHumedad().compareTo(o2.getHumedad());
	}

}