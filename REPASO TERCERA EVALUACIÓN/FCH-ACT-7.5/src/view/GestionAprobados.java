package view;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import controller.FileConfig;
import model.Aprobado;
import model.Aspirante;
import model.Calificacion;

public class GestionAprobados implements FileConfig{
	
	private static List<Aprobado> aprobados;
	
	public List<Aprobado> getAprobados() {
		Collections.sort(aprobados);
		return aprobados;
	}

	public void leerDatos() throws Exception {
		
		aprobados = new ArrayList<Aprobado>();
		try {
			// leer los 2 mapas
			Map<Integer, Aspirante> aspirantes = leerAspirantes();
			Map<Integer, Calificacion> calificaciones = leerCalificaciones();

//			Leer de un fichero binario genérico
//			Map<Integer, Aspirante> aspirantes = leerFichero(FILE_DAT, new HashMap<Integer, Aspirante>());
//			Map<Integer, Calificacion> calificaciones = leerFichero(FILE_CAL, new HashMap<Integer, Calificacion>());

			// fusionar los 2 mapas en una lista
			for (Map.Entry<Integer, Calificacion> entry : calificaciones.entrySet()) {
				if (entry.getValue().getMedia() >= 5) {
					Aspirante a = aspirantes.get(entry.getKey());
					aprobados.add(new Aprobado(a.getNombre(), a.getDNI(), entry.getValue().getMedia()));
				}
			}

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	private Map<Integer, Aspirante> leerAspirantes() throws Exception {
		Map<Integer, Aspirante> data = null;
		
		String fileName = FILE_DAT;
		ObjectInputStream fichero = null;

		try {
			fichero = new ObjectInputStream(new FileInputStream(fileName));
			data = (Map<Integer, Aspirante>) fichero.readObject();
		}
		catch (IOException ioe) { throw new Exception("Fallo leyendo del fichero: " + fileName + " " + ioe.getMessage()); }
		catch (Exception e)     { throw new Exception("Fallo general. " + e.getMessage()); }

		finally {
			try { if (fichero != null) fichero.close(); }
			catch (IOException ioe) { throw new Exception("Fallo cerrando el fichero: " + fileName + " " + ioe.getMessage()); }
		}
		
		return data;
	}

	@SuppressWarnings("unchecked")
	public Map<Integer, Calificacion> leerCalificaciones() throws Exception {
		
		Map<Integer, Calificacion> data = null;
		
		String fileName = FILE_CAL;
		ObjectInputStream fichero = null;

		try {
			fichero = new ObjectInputStream(new FileInputStream(fileName));
			data = (Map<Integer, Calificacion>) fichero.readObject();
		}
		catch (IOException ioe) { throw new Exception("Fallo leyendo del fichero: " + fileName + " " + ioe.getMessage()); }
		catch (Exception e)     { throw new Exception("Fallo general. " + e.getMessage()); }

		finally {
			try { if (fichero != null) fichero.close(); }
			catch (IOException ioe) { throw new Exception("Fallo cerrando el fichero: " + fileName + " " + ioe.getMessage()); }
		}
		
		return data;

	}

//	Cómo leer de un fichero binario un objeto del tipo T, que se pasa x parámetro.
//  El parámetro 'returnType' no se usa, sólo sirve para tomar su tipo T.
	@SuppressWarnings("unchecked")
	private <T> T leerFichero(String fileName, T returnType) throws Exception {
		T data = null;
		
		ObjectInputStream fichero = null;
		try {
			fichero = new ObjectInputStream(new FileInputStream(fileName));
			data = (T) fichero.readObject();
		}
		catch (IOException ioe) { throw new Exception("Fallo leyendo del fichero: " + fileName + " " + ioe.getMessage()); }
		catch (Exception e)     { throw new Exception("Fallo general. " + e.getMessage()); }

		finally {
			try { if (fichero != null) fichero.close(); }
			catch (IOException ioe) { throw new Exception("Fallo cerrando el fichero: " + fileName + " " + ioe.getMessage()); }
		}
		
		return data;
	}
	
}