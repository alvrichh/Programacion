package controller;

import java.util.List;

import model.Alumno;
import model.Unidad;

public interface Instituto {

	public List<Alumno> obtenerTodosAlumnosOrdenados();

	public Unidad obtenerUnidadAlumno(Integer id);

	public List<Alumno> obtenerAlumnosUnidad(String strUnidad);

	public void addAlumnoUnidad(String strUnidad, Alumno alumno);
	
	public void cargarAlumnos();
	
	public void guardarAlumnos();
	
}