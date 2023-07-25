package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Alumno;
import model.Unidad;

public abstract class InstitutoMap implements Instituto, Serializable {

	private static final long serialVersionUID = 1L;

	private final String NOMBRE_FICHERO = "alumnos.dat";

	private Map<Unidad, List<Alumno>> unidades = new HashMap<Unidad, List<Alumno>>();
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<Unidad, List<Alumno>> getUnidades() {
		return unidades;
	}

	public void addUnidad(Unidad unidad) {
		unidades.put(unidad, new ArrayList<Alumno>());
	}

	@SuppressWarnings("unchecked")
	public void cargarAlumnos() {
		try {
			ObjectInputStream fichero = new ObjectInputStream(new FileInputStream(NOMBRE_FICHERO));
			unidades = (HashMap<Unidad, List<Alumno>>) fichero.readObject();
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