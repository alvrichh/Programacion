package model;

public class Coro extends AgrupacionOficial {

	private int numeroBandurrias;
	private int numeroGuitarras;

	public Coro() {
		this(0, 0, 0, "", "", "", "", "");
	}

	public Coro(int numeroBandurrias, int numeroGuitarras, int puntosObtenidos, String nombre, String autor,
			String autorMusica, String autorLetra, String tipo) {
		super(puntosObtenidos, nombre, autor, autorMusica, autorLetra, tipo);
		this.numeroBandurrias = numeroBandurrias;
		this.numeroGuitarras = numeroGuitarras;
	}

	public int getNumeroBandurrias() {
		return numeroBandurrias;
	}

	public void setNumeroBandurrias(int numeroBandurrias) {
		this.numeroBandurrias = numeroBandurrias;
	}

	public int getNumeroGuitarras() {
		return numeroGuitarras;
	}

	public void setNumeroGuitarras(int numeroGuitarras) {
		this.numeroGuitarras = numeroGuitarras;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del Coro de nombre " + getNombre();
	}

	@Override
	public String hacerTipo() {
		return "El Coro " + getNombre() + " va de " + getTipo();
	}

	@Override
	public String caminitoFalla() {
		return "El Coro " + getNombre() + " va caminito del Falla";
	}

	@Override
	public String toString() {
		return "Coro [getNumeroBandurrias()=" + getNumeroBandurrias() + ", getNumeroGuitarras()=" + getNumeroGuitarras()
				+ ", toString()=" + super.toString() + "]";
	}

}
