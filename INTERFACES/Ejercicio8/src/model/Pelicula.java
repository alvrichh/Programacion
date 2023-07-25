package model;

public class Pelicula extends Multimedia implements Reproducible {

	private String director;
	private double duracion;
	private String productora;
	private String pais;

	public Pelicula() {
		this("", 0, "", 0, "", "");
	}

	public Pelicula(String titulo, int añoEstreno, String director, double duracion, String productora, String pais) {
		super(titulo, añoEstreno);
		this.director = director;
		this.duracion = duracion;
		this.productora = productora;
		this.pais = pais;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Pelicula [getDirector()=" + getDirector() + ", getDuracion()=" + getDuracion() + ", getProductora()="
				+ getProductora() + ", getPais()=" + getPais() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public String play() {
		return "Reproduciendo pelicula: " + getTitulo();
	}

	@Override
	public String pause() {
		return "Pausando pelicula: " + getTitulo();
	}

	@Override
	public String stop() {
		return "Parando pelicula: " + getTitulo();
	}

}
