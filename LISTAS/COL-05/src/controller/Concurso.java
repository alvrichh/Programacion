package controller;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import model.Perro;

public class Concurso {

	private String nombre;
	private String localidad;
	private Map<String, TreeSet<Perro>> perros;

	public Concurso() {
		this("", "");
	}

	public Concurso(String nombre, String localidad) {
		setNombre(nombre);
		setLocalidad(localidad);
		setPerros(new TreeMap<String, TreeSet<Perro>>());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	protected Map<String, TreeSet<Perro>> getPerros() {
		return perros;
	}

	private void setPerros(TreeMap<String, TreeSet<Perro>> treeMap) {
		this.perros = treeMap;
	}

}