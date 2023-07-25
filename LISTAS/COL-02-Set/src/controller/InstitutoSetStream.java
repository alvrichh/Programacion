package controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Alumno;
import model.Unidad;

public class InstitutoSetStream extends InstitutoSet{

	private static final long serialVersionUID = 1L;

	public InstitutoSetStream() {
		this("");
	}
	
	public InstitutoSetStream(String nombre) {
		setNombre(nombre);
	}

	@Override
	public List<Alumno> obtenerTodosAlumnosOrdenados() {
		List<Alumno> alumnos = getUnidades().stream()
			    			.flatMap(u -> u.getAlumnos().stream())
			    			.sorted()
			    			.collect(Collectors.toList());
		return alumnos;
	}

	@Override
	public Unidad obtenerUnidadAlumno(Integer id) {
		Unidad unidad = getUnidades().stream()
							.filter(u -> u.getAlumnos().stream().anyMatch(a -> a.getId() == id))
							.findFirst()
							.orElse(null);
		return unidad;
	}
	
	@Override
	public List<Alumno> obtenerAlumnosUnidad(String strUnidad) {
		Unidad unidad = Unidad.convertStrToUnidad(strUnidad);
		
		List<Alumno> alumnos = getUnidades().stream()
							.filter(u -> u.getUnidad().equalsIgnoreCase(unidad.getUnidad()))
							.findFirst()
							.map(Unidad::getAlumnos)
							.orElse(Collections.emptyList())
							.stream()
							.sorted(Comparator.comparing(Alumno::getDni))
							.collect(Collectors.toList());
		return alumnos;
	}
	
	@Override
	public void addAlumnoUnidad(String strUnidad, Alumno alumno) {
		Unidad unidad = Unidad.convertStrToUnidad(strUnidad);

		getUnidades().stream()
    						.filter(u -> u.equals(unidad))
    						.findFirst()
    						.ifPresent(u -> u.addAlumno(alumno));
	}

}