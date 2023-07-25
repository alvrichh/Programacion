package model;

public class Agrupacion implements Comparable {
	
	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetras;
	private String tipo;
	
	public Agrupacion(){
		
	}
	public String cantarPresentacion(){
		
		return null;
	}
	public String hacerTipo() {
		return null;
	}
	
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
	public String getAutorLetras() {
		return autorLetras;
	}
	public void setAutorLetras(String autorLetras) {
		this.autorLetras = autorLetras;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



}
