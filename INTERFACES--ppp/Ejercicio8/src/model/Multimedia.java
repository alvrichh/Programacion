package model;

public abstract class Multimedia {

	private String titulo;
	private Integer anyoEstreno;
	static private Integer counter = 0;
	private boolean finalizado;

	public Multimedia() {
		this("", 0);
		counter++;
	}

	public Multimedia(String titulo, int añoEstreno) {
		counter++;
		this.titulo = titulo;
		this.anyoEstreno = añoEstreno;
	}

	public String darPorFinalizado() {
		this.finalizado = true;
		return "Ha sido finalizado el elemento numero: " + counter;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAnyoEstreno() {
		return anyoEstreno;
	}

	public void setAnyoEstreno(int añoEstreno) {
		this.anyoEstreno = añoEstreno;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public static Integer getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Multimedia.counter = counter;
	}

	@Override
	public String toString() {
		return "Multimedia [getTitulo()=" + getTitulo() + ", getAnyoEstreno()=" + getAnyoEstreno() + ", isFinalizado()="
				+ isFinalizado() + "]";
	}

}
