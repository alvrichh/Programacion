package model;

public class Libro extends Multimedia {
	private String autor;
	private String editorial;
	private String ISBN;
	private Integer paginas;
	
	public Libro() {
		
	}
	
	@Override
	public String toString() {
		return "[Libro]"
	+super.toString()
	+ "Autor: " + getAutor() 
	+ ",Editorial: " + getEditorial() 
	+ ", ISBN: " + getISBN()
	+ ", Paginas: " + getPaginas();
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

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}


}
