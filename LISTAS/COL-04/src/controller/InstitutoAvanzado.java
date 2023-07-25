package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import model.Alumno;

public class InstitutoAvanzado {

	private final String NOMBRE_FICHERO = "alumnos.dat";

	private Map<String, Alumno> alumnado = new TreeMap<String, Alumno>();

	public InstitutoAvanzado() {
	}

	public Map<String, Alumno> getAlumnado() {
		return alumnado;
	}

	public boolean insertar_alumno(Alumno alumno) {
		return !alumnado.containsKey(alumno.getDNI()) && alumnado.put(alumno.getDNI(), alumno) == null;
	}

	public boolean borrar_alumno(String dni) {
		return alumnado.remove(dni) != null;
	}

	public List<Alumno> motrar_alumnos() {
		return alumnado.values().stream().collect(Collectors.toList());
	}

	public List<Alumno> motrar_alumnos_de_un_curso(String curso) {
		return alumnado.values().stream().filter(a -> a.getCurso().equals(curso)).collect(Collectors.toList());
	}

	public boolean modificar_alumno(Alumno alumno) {
		return alumnado.replace(alumno.getDNI(), alumno) != null;
	}
	
	@SuppressWarnings("unchecked")
	public void cargarCotizaciones() {
		try {
			ObjectInputStream fichero = new ObjectInputStream(new FileInputStream(NOMBRE_FICHERO));
			alumnado = (TreeMap<String, Alumno>) fichero.readObject();
			fichero.close();
		} catch (Exception e) {
			System.err.println("ERROR: " + e.getMessage());
		}
	}

	public void guardarCotizaciones() {
		try {
			ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream(NOMBRE_FICHERO));
			fichero.writeObject(alumnado);
			fichero.close();
		} catch (Exception e) {
			System.err.println("ERROR: " + e.getMessage());
		}
	}

}