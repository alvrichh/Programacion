package model;

import java.util.List;

public class Categoria {
	
	private String nombre;	
	private List<Pelicula> pelicula;
	
	public Categoria() {
		
	}
	public Categoria(String nombre) {
		super();
		setNombre(nombre);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Pelicula> getPelicula() {
		return pelicula;
	}
	public void setPelicula(List<Pelicula> pelicula) {
		this.pelicula = pelicula;
	}
	
	
	
	}
