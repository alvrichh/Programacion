package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Alumno;
import model.CompAlumnoPorDni;
import model.Unidad;

public class InstitutoMapNormal extends InstitutoMap {

	private static final long serialVersionUID = 1L;

	public InstitutoMapNormal() {
		this("");
	}

	public InstitutoMapNormal(String nombre) {
		setNombre(nombre);
	}

	@Override
	public List<Alumno> obtenerTodosAlumnosOrdenados() {
		List<Alumno> alumnos = new ArrayList<Alumno>();
		for (Unidad u : getUnidades().keySet()) {
			alumnos.addAll(getUnidades().get(u));
		}
		Collections.sort(alumnos);

		return alumnos;
	}

	@Override
	public Unidad obtenerUnidadAlumno(Integer id) {
		Unidad unidad = null;
		for (Unidad u : getUnidades().keySet()) {
			for (Alumno a : getUnidades().get(u)) {
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
		for (Unidad u : getUnidades().keySet()) {
			if (u.equals(unidad)) {
				alumnos.addAll(getUnidades().get(u));
				break;
			}
		}
		Collections.sort(alumnos, new CompAlumnoPorDni());

		return alumnos;
	}

	@Override
	public void addAlumnoUnidad(String strUnidad, Alumno alumno) {
		Unidad unidad = Unidad.convertStrToUnidad(strUnidad);
		
		for (Unidad u : getUnidades().keySet()) {
			if (u.equals(unidad)) {
				getUnidades().get(u).add(alumno);
				break;
			}
		}
	}

}