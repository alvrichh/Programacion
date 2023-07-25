package view;

import controller.GestionAspirantes;
import model.Aspirante;

public class IntroducirAspirantes {

	GestionAspirantes gest = new GestionAspirantes();

	public IntroducirAspirantes() {
		boolean otroMas = false;
		do {
			Aspirante a = pedirDatos();
			gest.addAspirante(a);
			otroMas = Util.leerString("Otro aspirante más? (S/N): ").equalsIgnoreCase("S");
		} while (otroMas);

		try {
			gest.guardarDatosFichero();
		} catch (Exception e) {
			Util.escribirError(e.getMessage());
		}

	}

	private Aspirante pedirDatos() {
		Aspirante aux = null;
		String nombre;
		String dni;
		String telefono;
		
		Util.escribir("\nDATOS DEL ASPIRANTE");
		nombre = Util.leerString("Nombre: ");
		dni = Util.leerString("DNI: ");
		telefono = Util.leerString("Teléfono: ");
		
		aux = new Aspirante(nombre, dni, telefono);
		return aux;
	}

}