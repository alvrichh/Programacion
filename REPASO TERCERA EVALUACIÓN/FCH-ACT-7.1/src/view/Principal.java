package view;

import controller.RegistroLibros;
import model.NombreNoValidoException;

public class Principal {

	static RegistroLibros reg = new RegistroLibros(10);

	public static void main(String[] args) {
		//escribirDatos();
		leerDatos();
	}

	private static void escribirDatos() {
		try {
			reg.addLibro("mitituloA", "miautorA");
			reg.addLibro("mitituloB", "miautorB");
			reg.addLibro("mitituloC", "miautorC");
			reg.cargarRegistroEnFichero("datos.txt");
			System.out.println("Fin del programa.");
		} catch (NombreNoValidoException e) {
			System.err.println("FALLO EN LOS DATOS. " + e.getMessage());
		} catch (Exception e) {
			System.err.println("FALLO. " + e.getMessage());
		}
	}

	private static void leerDatos() {
		try {
			reg.cargarRegistroDesdeFichero("datos.txt");
			for (int i = 0; i < reg.getRegistro().length; i++) {
				System.out.println(reg.getRegistro()[i]);
			}
			System.out.println("Fin del programa.");
		} catch (NombreNoValidoException e) {
			System.err.println("FALLO EN LOS DATOS. " + e.getMessage());
		} catch (Exception e) {
			System.err.println("FALLO. " + e.getMessage());
		}
	}

}