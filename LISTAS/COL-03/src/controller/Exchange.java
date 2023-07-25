package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

import model.ParCotizacion;

public abstract class Exchange implements IExchange {

	private final String NOMBRE_FICHERO = "cotizaciones.dat";

	private Set<ParCotizacion> exchange = new HashSet<ParCotizacion>();

	public Set<ParCotizacion> getExchange() {
		return exchange;
	}

	@Override
	public void addCotizacion(ParCotizacion cotizacion) {
		exchange.add(cotizacion);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void cargarFchCotizaciones() {
		try {
			ObjectInputStream fichero = new ObjectInputStream(new FileInputStream(NOMBRE_FICHERO));
			exchange = (HashSet<ParCotizacion>) fichero.readObject();
			fichero.close();
		} catch (Exception e) {
			System.err.println("ERROR: " + e.getMessage());
		}
	}

	@Override
	public void guardarFchCotizaciones() {
		try {
			ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream(NOMBRE_FICHERO));
			fichero.writeObject(exchange);
			fichero.close();
		} catch (Exception e) {
			System.err.println("ERROR: " + e.getMessage());
		}
	}

}