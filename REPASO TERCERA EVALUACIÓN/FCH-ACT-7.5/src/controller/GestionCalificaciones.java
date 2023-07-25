package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Calificacion;

public class GestionCalificaciones implements FileConfig {

	private static Map<Integer, Calificacion> calificaciones = new HashMap<Integer, Calificacion>();

	public Map<Integer, Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void addCalificacion(Integer id, Calificacion calificacion) {
		calificaciones.put(id, calificacion);
	}

	@SuppressWarnings("unchecked")
	public void leerDatos() throws Exception {

		String fileName = FILE_IDS;
		ObjectInputStream fichero = null;

		try {
			fichero = new ObjectInputStream(new FileInputStream(fileName));
			List<Integer> lstIds = (List<Integer>) fichero.readObject();
			for (Integer id : lstIds) {
				addCalificacion(id, new Calificacion());
			}
		}
		catch (IOException ioe) { throw new Exception("Fallo leyendo del fichero: " + fileName + " " + ioe.getMessage()); }
		catch (Exception e)     { throw new Exception("Fallo general. " + e.getMessage()); }

		finally {
			try { if (fichero != null) fichero.close(); }
			catch (IOException ioe) { throw new Exception("Fallo cerrando el fichero: " + fileName + " " + ioe.getMessage()); }
		}

	}

	public void escribirDatos() throws Exception {
		String fileName = FILE_CAL;
		ObjectOutputStream fichero = null;

		try {
			fichero = new ObjectOutputStream(new FileOutputStream(fileName));
			fichero.writeObject(calificaciones);
		}
		catch (IOException ioe) { throw new Exception("Fallo escribiendo en el fichero: " + fileName + " " + ioe.getMessage()); }
		catch (Exception e)     { throw new Exception("Fallo general. " + e.getMessage()); }

		finally {
			try { if (fichero != null)  fichero.close(); }
			catch (IOException ioe) { throw new Exception("Fallo cerrando en el fichero: " + fileName + " " + ioe.getMessage()); }
		}
	}

}