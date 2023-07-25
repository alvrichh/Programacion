package view;

import model.Aprobado;

public class Aprobados {

	GestionAprobados gest = new GestionAprobados();

	public Aprobados() {
		try {
			gest.leerDatos();
			mostrarAprobados();
		} catch (Exception e) {
			Util.escribirError(e.getMessage());
		}
	}

	private void mostrarAprobados() {
		Util.escribir("\nAPROBADOS");
		Util.escribir("Nombre            DNI            Media");
		Util.escribir("--------------------------------------");
		for (Aprobado a : gest.getAprobados()) {
			Util.escribir(a.getNombre() + "\t" + a.getDNI() + "\t" + a.getMedia());
		}
		Util.escribir("--------------------------------------");
	}

}