package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import model.Alumno;

public class Instituto implements Serializable {

	private static final long serialVersionUID = 1L;

	
	
	private final String NOMBRE_FICHERO = "alumnos.dat";

	private Map<String, Alumno> alumnado = new TreeMap<String, Alumno>();

	public Instituto() {
	}

	public boolean insertar_alumno(Alumno alumno) {
		boolean ok = false;
		if (!alumnado.containsKey(alumno.getDNI())) {
			alumnado.put(alumno.getDNI(), alumno);
			ok = true;
		}
		return ok;
	}

	public boolean borrar_alumno(String dni) {
		boolean ok = false;
		if (alumnado.containsKey(dni)) {
			alumnado.remove(dni);
			ok = true;
		}
		return ok;
	}

	public List<Alumno> mostrar_alumnos() {
		List<Alumno> alumnos = new ArrayList<Alumno>();
		for (Alumno a : alumnado.values()) {
			alumnos.add(a);
		}
		return alumnos;
	}

	public List<Alumno> mostrar_alumnos_de_un_curso(String curso) {
		List<Alumno> alumnos = new ArrayList<Alumno>();
		for (Alumno a : alumnado.values()) {
			if (a.getCurso().equals(curso)) {
				alumnos.add(a);
			}
		}
		return alumnos;
	}

	public boolean modificar_alumno(Alumno alumno) {
		boolean ok = false;
		if (alumnado.containsKey(alumno.getDNI())) {
			alumnado.replace(alumno.getDNI(), alumno);
			ok = true;
		}
		return ok;
	}

	@SuppressWarnings("unchecked")
	public void leerFchAlumnado() {
		try {
			ObjectInputStream fichero = new ObjectInputStream(new FileInputStream(NOMBRE_FICHERO));
			alumnado = (TreeMap<String, Alumno>) fichero.readObject();
			fichero.close();
		} catch (Exception e) {
			System.err.println("ERROR: " + e.getMessage());
		}
	}

	public void escribirFchAlumnado() {
		try {
			ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream(NOMBRE_FICHERO));
			fichero.writeObject(alumnado);
			fichero.close();
		} catch (Exception e) {
			System.err.println("ERROR: " + e.getMessage());
		}
	}

}