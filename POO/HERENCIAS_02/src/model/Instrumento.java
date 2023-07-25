package model;

public abstract class Instrumento {
	
	private final int MAX_NOTAS = 100;
	private Nota cancion[];
	private int pos;
	
	public Instrumento() {
		cancion = new Nota[MAX_NOTAS];
		pos = 0;
	}
	
	public void add(Nota n) {
		if(pos +1 < MAX_NOTAS) {
			cancion[pos++] = n;
		}
	}
	
	public Nota[] getCancion() {
		return cancion;
	}
	public abstract void interpretar();
	
	
}
