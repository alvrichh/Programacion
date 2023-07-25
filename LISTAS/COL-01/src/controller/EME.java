package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.Coordenada;
import model.EstacionMeteorologica;
import model.Medicion;

public class EME {

	private Set<EstacionMeteorologica> estaciones = new HashSet<EstacionMeteorologica>();

	public EME(String nombreFichero) {
		leerFicheroEME(nombreFichero);
	}

	public Set<EstacionMeteorologica> getEstaciones() {
		return estaciones;
	}

	public void addEM(EstacionMeteorologica em) {
		estaciones.add(em);
	}

	public void deleteEM(EstacionMeteorologica em) {
		estaciones.remove(em);
	}

	public EstacionMeteorologica getEME(Integer latitud, Integer longitud) {
		return getEstaciones().stream().filter(e -> e.getCoord().equals(new Coordenada(latitud, longitud))).findFirst().orElse(null);
	}

	public List<Medicion> getMediciones(Integer latitud, Integer longitud) {
		EstacionMeteorologica em = getEME(latitud, longitud);
		return (em == null) ? null : getEME(latitud, longitud).getMediciones();
	}

	private void leerFicheroEME(String nombreFichero) {
		try {
			ObjectInputStream fichero = new ObjectInputStream(new FileInputStream(nombreFichero));
			estaciones = (HashSet<EstacionMeteorologica>) fichero.readObject();
			fichero.close();
		} catch (Exception e) {
			System.err.println("ERROR leyendo del fichero: " + nombreFichero);
			System.err.println(e.getMessage());
		}
	}

	public void escribirFicheroEME(String nombreFichero) {
		try {
			ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream(nombreFichero));
			fichero.writeObject(estaciones);
			fichero.close();
		} catch (Exception e) {
			System.err.println("ERROR escribiendo en el fichero: " + nombreFichero);
			System.err.println(e.getMessage());
		}
	}

}