package view;

public class Principal {

	public static void main(String[] args) {
		int opc;
		do {
			mostrarMenu();
			opc = Util.leerInt("Opción [0-Salir]: ");
			switch (opc) {
			case 1 -> new IntroducirAspirantes();
			case 2 -> new CalificarPruebas();
			case 3 -> new Aprobados();
			case 0 -> new Salir();
			}
		} while (opc != 0);
	}

	private static void mostrarMenu() {
		Util.escribir("\nMENU");
		Util.escribir("----------------------------------");
		Util.escribir(" 1. Introducir datos de aspirantes");
		Util.escribir(" 2. Calificar prueba");
		Util.escribir(" 3. Aprobados");
	}

}