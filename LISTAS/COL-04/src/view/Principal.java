package view;

public class Principal {

	public static void main(String[] args) {
		new Gestion();
		inicio();
	}

	private static void inicio() {
		int opc;
		do {
			mostrarMenu();
			opc = Util.leerInt("Opción [0-salir] : ");
			switch (opc) {
			case 0 -> Gestion.salir();
			case 1 -> Gestion.insertarAlumno();
			case 2 -> Gestion.borrarAlumno();
			case 3 -> Gestion.mostrarAlumnos();
			case 4 -> Gestion.mostrarAlumnosUnCurso();
			case 5 -> Gestion.modificarAlumno();
			}
		} while (opc != 0);
	}

	private static void mostrarMenu() {
		Util.escribir("");
		Util.escribir("===============================");
		Util.escribir("MENÚ GESTIÓN: IES DUALXAR");
		Util.escribir("===============================");
		Util.escribir("1 INSERTAR ALUMNO");
		Util.escribir("2 BORRAR ALUMNO");
		Util.escribir("3 MOSTRAR ALUMNOS");
		Util.escribir("4 MOSTRAR ALUMNOS DE UN CURSO");
		Util.escribir("5 MODIFICAR ALUMNO");
	}
}