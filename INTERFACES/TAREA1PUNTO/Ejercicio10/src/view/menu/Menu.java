package view.menu;

import java.util.Scanner;

import controller.COAC;
import controller.COAC.TipoOrdenacion;
import controller.COAC.TiposAgrupacion;
import view.Util;
import view.menu.agrupacion.MenuAgrupacion;
import view.menu.concurso.MenuConcurso;
import view.menu.integrante.MenuIntegrante;

public class Menu {

	private static final int INTDEFECTO = 0;
	private static final String MSGINTDEFECTO = "VALOR INTRODUCIDO INCORRECTO, GUARDADO VALOR POR DEFECTO [ "
			+ INTDEFECTO + " ]";

	private static Scanner entrada = new Scanner(System.in);
	public static COAC coac = new COAC();

	// Inicio
	//Comprobado
	public static void gestionPrograma() {
		int opc;
		do {
			mostrarMenuPrincipal();
			try {
				opc = Util.leerInt("Opción [0 - Salir] : ");
			} catch (Exception e) {
				System.err.println(MSGINTDEFECTO);
				opc = INTDEFECTO;
			}

			switch (opc) {
			case 0 -> finDelPrograma();
			case 1 -> MenuIntegrante.opcIntegrantes();
			case 2 -> MenuAgrupacion.opcAñadirAgrupacion();
			case 3 -> opc3();
			case 4 -> MenuAgrupacion.opcEditarAgrupacion();
			case 5 -> MenuConcurso.opcConcurso();
			case 6 -> {
				System.out.println(coac.listarTodo());
				introVolver();
			}
			case 7 -> listasIndividuales(TiposAgrupacion.CHIRIGOTA);

			case 8 -> listasIndividuales(TiposAgrupacion.CORO);

			case 9 -> listasIndividuales(TiposAgrupacion.CUARTETO);

			case 10 -> listasIndividuales(TiposAgrupacion.COMPARSA);

			case 11 -> listasIndividuales(TiposAgrupacion.ROMANCERO);

			case 12 -> opc12();

			case 13 -> opc13();

			case 14 -> opc14();

			}
			if (opc > 14 || opc < 0)
				System.err.print("\nOpcion incorrecta!");
		} while (opc != 0);

		finDelPrograma();

	}

	// Comprobado
	private static void opc14() {
		System.out.println("\nAgrupaciones antes de ordenar");
		System.out.println(coac.listarTodo());
		if (!coac.ordenarAgrupaciones(TipoOrdenacion.MUSICALETRA)) {
			System.out.println("Agrupaciones despues de ordenar");
			System.out.println(coac.listarTodo());
			introVolver();
		} else {
			System.err.println("No hay agrupaciones para ordenar");
			introVolver();
		}
	}

	// Comprobado
	private static void opc13() {
		System.out.println("\nAgrupaciones antes de ordenar");
		System.out.println(coac.listarTodo());
		if (!coac.ordenarAgrupaciones(TipoOrdenacion.AUTOR)) {
			System.out.println("Agrupaciones despues de ordenar");
			System.out.println(coac.listarTodo());
			introVolver();
		} else {
			System.err.println("No hay agrupaciones para ordenar");
			introVolver();

		}
	}

	// Comprobado
	private static void opc12() {
		System.out.println("\nAgrupaciones antes de ordenar");
		System.out.println(coac.listarTodo());
		if (!coac.ordenarAgrupaciones(TipoOrdenacion.NOMBRE)) {
			System.out.println("Agrupaciones despues de ordenar");
			System.out.println(coac.listarTodo());
			introVolver();
		} else {
			System.err.println("No hay agrupaciones para ordenar");
			introVolver();

		}
	}

	// Comprobado
	private static void listasIndividuales(TiposAgrupacion tipo) {
		switch (tipo) {
		case CHIRIGOTA -> System.out.println(coac.listasIndividuales(TiposAgrupacion.CHIRIGOTA));
		case CORO -> System.out.println(coac.listasIndividuales(TiposAgrupacion.CORO));
		case CUARTETO -> System.out.println(coac.listasIndividuales(TiposAgrupacion.CUARTETO));
		case COMPARSA -> System.out.println(coac.listasIndividuales(TiposAgrupacion.COMPARSA));
		case ROMANCERO -> System.out.println(coac.listasIndividuales(TiposAgrupacion.ROMANCERO));
		}
		introVolver();
	}

	// Comprobado
	private static void opc3() {
		int opc;
		do {
			Util.escribir("\n");
			Util.escribir("┌──────────────────────────┐");
			Util.escribir("│    ELIMINAR AGRUPACION   │");
			Util.escribir("└──────────────────────────┘");
			System.out.println(coac.listarTodo());
			if (!coac.listarTodo().contains("VACIA")) {
				try {
					opc = Util.leerInt("Introduce la posicion del que desea eliminar\nOpción [0 - Volver] : ");

				} catch (Exception e) {
					opc = INTDEFECTO;
					System.err.println(MSGINTDEFECTO);
				}
			} else {
				introVolver();
				opc = 0;
			}

			if (opc > 0 && opc <= coac.getNumeroDeAgrupacionesActual()) {
				if (coac.eliminarAgrupacion(opc - 1)) {
					System.out.println("\nEliminado correctamente");
					opc = 0;
				} else {
					System.err.print("\nNo se ha podido eliminar");
					opc = 0;
				}

			} else {
				if (opc != 0)
					System.err.print("La posicion introducida no se encuentra.");
				opc = 0;
			}

		} while (opc != 0);
	}

	private static void mostrarMenuPrincipal() {
		Util.escribir("\n");
		Util.escribir("╔═══════════════════════════════════╗");
		Util.escribir("║      GESTION DE AGRUPACIONES      ║");
		Util.escribir("╚═══════════════════════════════════╝");
		Util.escribir("  1. Gestión de Participantes.");
		Util.escribir("  2. Añadir una agrupación.");
		Util.escribir("  3. Eliminar una agrupación.");
		Util.escribir("  4. Editar datos de una agrupación.");
		Util.escribir("  5. Gestión del Concurso.");
		Util.escribir("Listado de agrupaciones:");
		Util.escribir("  6. Listar todas.");
		Util.escribir("  7. Listar Chirigotas.");
		Util.escribir("  8. Listar Coros.");
		Util.escribir("  9. Listar Cuartetos.");
		Util.escribir(" 10. Listar Comparsas.");
		Util.escribir(" 11. Listar Romanceros.");
		Util.escribir("Ordenar el listado:");
		Util.escribir(" 12. Ordenar por el nombre.");
		Util.escribir(" 13. Ordenar por el autor.");
		Util.escribir(" 14. Ordenar por el autor de música/letra.");

	}

	private static void finDelPrograma() {
		Util.escribir("\nFin del programa.");
		System.exit(0);
	}

	private static void introVolver() {
		System.out.print("\nPulsa Intro para volver");
		entrada.nextLine();
	}

}
