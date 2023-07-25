package controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Alumno;
import model.CompAlumnoPorDni;
import model.Unidad;

public class InstitutoMapStream extends InstitutoMap {

	private static final long serialVersionUID = 1L;

	public InstitutoMapStream() {
		this("");
	}

	public InstitutoMapStream(String nombre) {
		setNombre(nombre);
	}

	@Override
	public List<Alumno> obtenerTodosAlumnosOrdenados() {
		List<Alumno> alumnos = getUnidades().keySet().stream() // obtener un stream de claves (unidades)
	            			.flatMap(u -> getUnidades().get(u).stream()) // combinar las listas de alumnos en un solo stream
	            			.sorted() // ordenar los alumnos según su orden natural
	            			.collect(Collectors.toList()); // recolectarlos en una lista
		return alumnos;
	}


	@Override
	public Unidad obtenerUnidadAlumno(Integer id) {
		Unidad unidad = getUnidades().entrySet().stream()
	            			.filter(entry -> entry.getValue().stream().anyMatch(alumno -> alumno.getId() == id))
	            			.map(Map.Entry::getKey)
	            			.findFirst()
	            			.orElse(null);
		return unidad;
	}
	
	@Override
	public List<Alumno> obtenerAlumnosUnidad(String strUnidad) {
		Unidad unidad = Unidad.convertStrToUnidad(strUnidad);
		
		List<Alumno> alumnos = getUnidades().entrySet().stream()
		            		.filter(entry -> entry.getKey().equals(unidad))
		            		.flatMap(entry -> entry.getValue().stream())
		            		.sorted(new CompAlumnoPorDni())
		            		.collect(Collectors.toList());
		return alumnos;
	}
	
	@Override
	public void addAlumnoUnidad(String strUnidad, Alumno alumno) {
		Unidad unidad = Unidad.convertStrToUnidad(strUnidad);
		
		getUnidades().entrySet().stream()
		  					.filter(entry -> entry.getKey().equals(unidad))
		  					.findFirst()
		  					.ifPresent(entry -> entry.getValue().add(alumno));
	}

}