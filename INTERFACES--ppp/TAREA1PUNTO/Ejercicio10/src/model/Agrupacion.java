package model;

public abstract class Agrupacion implements Comparable<Agrupacion> {

	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetra;
	private String tipo;

	protected Agrupacion() {
		this("", "", "", "", "");
	}

	Agrupacion(String nombre, String autor, String autorMusica, String autorLetra, String tipo) {
		this.nombre = nombre;
		this.autor = autor;
		this.autorMusica = autorMusica;
		this.autorLetra = autorLetra;
		this.tipo = tipo;
	}

	public abstract String cantarPresentacion();

	public abstract String hacerTipo();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutorMusica() {
		return autorMusica;
	}

	public void setAutorMusica(String autorMusica) {
		this.autorMusica = autorMusica;
	}

	public String getAutorLetra() {
		return autorLetra;
	}

	public void setAutorLetra(String autorLetra) {
		this.autorLetra = autorLetra;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Agrupacion [getNombre()=" + getNombre() + ", getAutor()=" + getAutor() + ", getAutorMusica()="
				+ getAutorMusica() + ", getAutorLetra()=" + getAutorLetra() + ", getTipo()=" + getTipo() + "]";
	}

	@Override
	public int compareTo(Agrupacion o) {
		int resultado = 0;
		if ( o.getNombre() != null)
			resultado = this.nombre.compareTo(o.getNombre());
		return resultado;
	}

}
