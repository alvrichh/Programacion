package controller;

import model.Multimedia;

public class Catalogo {
	
	private Multimedia cat[];
	
	public Catalogo() {
		this(0);
	}

	public Catalogo(int totalEltos) {

		cat = new Multimedia[totalEltos];
	}
	public Multimedia getElemento(int pos) {
		Multimedia m = null;
		if (pos >= 0 && pos < cat.length) {
			m = cat[pos];
		}
		return m;
	}
	public boolean add_multimedia(Multimedia elemento) {
		boolean added = false;
		for (int i = 0; i < cat.length; i++) {
			if (cat[i] == null) {
				cat[i] = elemento;
				added = true;
				break;
			}
		}
		return added;
	}
	

}
