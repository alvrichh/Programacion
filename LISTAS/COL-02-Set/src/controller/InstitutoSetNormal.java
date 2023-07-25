package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Alumno;
import model.CompAlumnoPorDni;
import model.Unidad;

public class InstitutoSetNormal extends InstitutoSet {

	private static final long serialVersionUID = 1L;

	public InstitutoSetNormal() {
		this("");
	}

	public InstitutoSetNormal(String nombre) {
		setNombre(nombre);
	}

	@Override
	public List<Alumno> obtenerTodosAlumnosOrdenados() {
		List<Alumno> alumnos = new ArrayList<Alumno>();
		for (Unidad u : getUnidades()) {
			alumnos.addAll(u.getAlumnos());
		}
		Collections.sort(alumnos);

		return alumnos;
	}

	@Override
	public Unidad obtenerUnidadAlumno(Integer id) {
		Unidad unidad = null;
		for (Unidad u : getUnidades()) {
			for (Alumno a : u.getAlumnos()) {
				if (a.getId().equals(id)) {
					unidad = u;
					break;
				}
			}
		}
		return unidad;
	}

	@Override
	public List<Alumno> obtenerAlumnosUnidad(String strUnidad) {
		Unidad unidad = Unidad.convertStrToUnidad(strUnidad);

		List<Alumno> alumnos = new ArrayList<Alumno>();
		for (Unidad u : getUnidades()) {
			if (u.getUnidad().equalsIgnoreCase(unidad.getUnidad())) {
				alumnos.addAll(u.getAlumnos());
				break;
			}
		}
		Collections.sort(alumnos, new CompAlumnoPorDni());

		return alumnos;
	}

	@Override
	public void addAlumnoUnidad(String strUnidad, Alumno alumno) {
		Unidad unidad = Unidad.convertStrToUnidad(strUnidad);

		for (Unidad u : getUnidades()) {
			if (u.equals(unidad)) {
				u.addAlumno(alumno);
				break;
			}
		}
	}

}