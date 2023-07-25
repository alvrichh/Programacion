package start;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import dbm.ConexionBD;
 
public class App {
	/**
	 * Inicio de la apliación
	 */
	public static void main(String[] args) {
		App miApp = new App();

		if (miApp.leerConfig()) {
			System.out.println("hola buenas");
		}
	}
	/**
	 * Lee el archivo de configuración con parámetros de la base de datos
	 * d
	 */
	private boolean leerConfig() {
		final String NOMBRE_FCH = "config.txt";
		boolean isOK = false;
		BufferedReader fichero = null;
		try {
			fichero = new BufferedReader(new FileReader(NOMBRE_FCH));
			String dbType = fichero.readLine().split(":")[1];
			String dbName = fichero.readLine().split(":")[1];
			String dbHost = fichero.readLine().split(":")[1];
			String dbUser = fichero.readLine().split(":")[1];
			String dbPass = fichero.readLine().split(":")[1];
			new ConexionBD(dbType, dbName, dbHost, dbUser, dbPass);  
			isOK = true;
		} catch (FileNotFoundException fnfe) {
			System.err.println("ERROR con el fichero. NO SE ENCUENTRA. " + fnfe.getMessage());
		} catch (IOException ioe) {
			System.err.println("ERROR leyendo del fichero. " + ioe.getMessage());
		} catch (Exception e) {
			System.err.println("ERROR GENERAL. " + e.getMessage());
		} finally {
			if (fichero != null) {
				try {
					fichero.close();
				} catch (IOException ioe) {
					System.err.println("ERROR cerrado el fichero. " + ioe.getMessage());
				}
			}
		}
		return isOK;

	}
}
