package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import model.Unidad;

public abstract class InstitutoSet implements Instituto, Serializable {

	private static final long serialVersionUID = 1L;

	private final String NOMBRE_FICHERO = "alumnos.dat";

	private Set<Unidad> unidades = new HashSet<Unidad>();
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Unidad> getUnidades() {
		return unidades;
	}

	public void addUnidad(Unidad unidad) {
		unidades.add(unidad);
	}

	@SuppressWarnings("unchecked")
	public void cargarAlumnos() {
		try {
			ObjectInputStream fichero = new ObjectInputStream(new FileInputStream(NOMBRE_FICHERO));
			unidades = (HashSet<Unidad>) fichero.readObject();
			fichero.close();
		} catch (Exception e) {
			System.err.println("ERROR: " + e.getMessage());
		}
	}

	public void guardarAlumnos() {
		try {
			ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream(NOMBRE_FICHERO));
			fichero.writeObject(unidades);
			fichero.close();
		} catch (Exception e) {
			System.err.println("ERROR: " + e.getMessage());
		}
	}

}