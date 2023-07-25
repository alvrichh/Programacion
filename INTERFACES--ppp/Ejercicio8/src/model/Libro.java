package model;

public class Libro extends Multimedia {

	private String autor;
	private String editorial;
	private String isbn;
	private int numPags;

	public Libro() {
		this("", 0, "", "", "", 0);
	}

	public Libro(String titulo, int añoEstreno, String autor, String editorial, String isbn, int numPags) {
		super(titulo, añoEstreno);
		this.autor = autor;
		this.editorial = editorial;
		this.isbn = isbn;
		this.numPags = numPags;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getNumPags() {
		return numPags;
	}

	public void setNumPags(int numPags) {
		this.numPags = numPags;
	}

	@Override
	public String toString() {
		return "Libro [getAutor()=" + getAutor() + ", getEditorial()=" + getEditorial() + ", getIsbn()=" + getIsbn()
				+ ", getNumPags()=" + getNumPags() + ", toString()=" + super.toString() + "]";
	}

}
