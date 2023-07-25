package model;

public class Campana extends Instrumento{

	public Campana() {
		super();
	}
	@Override
	public void interpretar() {
		Nota[] c = getCancion();
		int n = 0;
		StringBuffer partitura = new StringBuffer();
		while ( n < c.length && c[n] != null) {
			partitura.append(c[n] + "\t");
			if((n+1) % 4 == 0) {
				partitura.append("\n");
			}
			n++;
		}
	}
	               
}
