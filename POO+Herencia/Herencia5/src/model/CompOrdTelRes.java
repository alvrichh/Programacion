package model;

import java.util.Comparator;

public class CompOrdTelRes implements Comparator<Television>{

	@Override
	public int compare(Television o1, Television o2) {
		int resultado;
		if(o1.getResolucion() > o2.getResolucion()) {
			resultado = 1;
		}else {
			if(o1.getResolucion() < o2.getResolucion()) {
				resultado = 1;
			}else {
				resultado = 0;
			}
		}
		return resultado;
	}


}
