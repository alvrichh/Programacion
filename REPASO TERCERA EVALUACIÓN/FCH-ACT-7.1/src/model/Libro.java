package model;

import java.util.Objects;

public class Libro implements Datos, Comparable<Libro> {

	private String titulo;
	private String autor;

	public Libro(String titulo, String autor) throws NombreNoValidoException {
		setTitulo(titulo);
		setAutor(autor);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) throws NombreNoValidoException {
		if (contieneNumero(autor)) {
			throw new NombreNoValidoException();
		}
		this.autor = autor;
	}

	@Override
	public String toString() {
		return getTitulo() + SEPARADOR + getAutor();
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		Libro other = (Libro) obj;
		return Objects.equals(titulo, other.titulo);
	}

	@Override
	public int compareTo(Libro o) {
		return this.getTitulo().compareToIgnoreCase(o.getTitulo());
	}

	public static boolean contieneNumero(String texto) {
		boolean contiene = false;
		for (int i = 0; i < texto.length(); i++) {
			if (Character.isDigit(texto.charAt(i))) {
				contiene = true;
				break;
			}
		}
		return contiene;
	}

}