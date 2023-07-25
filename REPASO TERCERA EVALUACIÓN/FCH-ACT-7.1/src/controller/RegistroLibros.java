package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import model.Datos;
import model.Libro;
import model.NombreNoValidoException;

public class RegistroLibros implements Datos {

	private final String FILE_DEFAULT = "registro.txt";

	private Libro[] Registro;
	private int totalRegistrados;

	public RegistroLibros(int total) {
		Registro = new Libro[total];
		totalRegistrados = 0;
	}

	public Libro[] getRegistro() {
		return Registro;
	}

	public boolean addLibro(String titulo, String autor) throws NombreNoValidoException {
		boolean ok = false;
		if (totalRegistrados < Registro.length) {
			Registro[totalRegistrados] = new Libro(titulo, autor);
			totalRegistrados++;
			ok = true;
		}
		return ok;
	}

	public boolean buscaLibro(String titulo) {
		boolean ok = false;
		for (int i = 0; i < totalRegistrados; i++) {
			if (Registro[i].getTitulo().equalsIgnoreCase(titulo)) {
				ok = true;
				break;
			}
		}
		return ok;
	}

	public void cargarRegistroDesdeFichero(String nombreFichero) throws NombreNoValidoException {
		BufferedReader fichero = null;
		String lineaLeida = "";
		String titulo = "";
		String autor = "";
		totalRegistrados = 0;
		try {
			fichero = new BufferedReader(new FileReader(nombreFichero));
			lineaLeida = fichero.readLine();
			while (lineaLeida != null) {
				titulo = lineaLeida.substring(0, lineaLeida.indexOf(SEPARADOR));
				autor = lineaLeida.substring(lineaLeida.indexOf(SEPARADOR) + 1);
				addLibro(titulo, autor);
				lineaLeida = fichero.readLine();
			}
		} catch (IOException ioe) {
			System.err.println("Fallo leyendo del fichero: " + nombreFichero + " " + ioe.getMessage());
		} catch (Exception e) {
			System.err.println("Fallo general en el método: cargarRegistroDesdeFichero. " + e.getMessage());
		}
		
		finally {
			try {
				if (fichero != null)
					fichero.close();
			} catch (IOException ioe) {
				System.err.println("Fallo cerrando el fichero: " + nombreFichero);
			}
		}
	}

	public void cargarRegistroEnFichero(String nombreFichero) {
		BufferedWriter fichero = null;
		try {
			fichero = new BufferedWriter(new FileWriter(nombreFichero));
			for (int i = 0; i < totalRegistrados; i++) {
				fichero.write(Registro[i].toString());
				if (i < totalRegistrados - 1) {
					fichero.newLine();
				}
			}
		} catch (IOException ioe) {
			System.err.println("Fallo escribiendo en el fichero: " + nombreFichero + " " + ioe.getMessage());
		} catch (Exception e) {
			System.err.println("Fallo general en el método: cargarRegistroAfichero. " + e.getMessage());
		}

		finally {
			try {
				if (fichero != null)
					fichero.close();
			} catch (IOException ioe) {
				System.err.println("Fallo cerrando el fichero: " + nombreFichero);
			}
		}
	}

	public void cargarRegistroEnFichero() {
		cargarRegistroEnFichero(FILE_DEFAULT);
	}

}