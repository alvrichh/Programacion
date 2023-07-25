package view.menu.integrante;

import java.util.Scanner;

import controller.COAC;
import view.Util;

public class MenuIntegrante {

	private static final int INTDEFECTO = 0;
	private static final String STRINGDEFECTO = "VACIO";
	private static final String MSGSTRINGDEFECTO = "VALOR INTRODUCIDO INCORRECTO, GUARDADO VALOR POR DEFECTO [ "
			+ STRINGDEFECTO + " ]";
	private static final String MSGINTDEFECTO = "VALOR INTRODUCIDO INCORRECTO, GUARDADO VALOR POR DEFECTO [ "
			+ INTDEFECTO + " ]";

	private static Scanner entrada = new Scanner(System.in);
	public static COAC coac = view.menu.Menu.coac;

	// Opcion 1. Gestión de Participantes.

	public static void opcIntegrantes() {
		int opc;
		int opcT;
		do {
			mostrarMenuIntegrantes();
			try {
				opc = Util.leerInt("Opción [0 - Salir] : ");
			} catch (Exception e) {
				System.err.println(MSGINTDEFECTO);
				opc = INTDEFECTO;
			}
			switch (opc) {
			case 1 -> opc1();

			case 2 -> opc2();

			case 3 -> opc3();

			case 4 -> {
				System.out.println(coac.listarParticipante());
				introVolver();
			}
			case 5 -> opc5();

			case 6 -> opc6();

			}
			if (opc > 6 || opc < 0)
				System.err.print("\nOpcion incorrecta!");
		} while (opc != 0);
	}

	// Comprobado
	private static void opc6() {
		if (coac.getNumeroDeIntegrantesActual() != 1) {
			if (!coac.listarParticipante().contains("VACIA")) {
				System.out.println("\nLista Anterior");
				System.out.println(coac.listarParticipante());
				coac.ordenarParticipantesPorNombre();
				System.out.println("\nLista Ordenada");
				System.out.println(coac.listarParticipante());
				introVolver();
			} else {
				System.out.println("\n***Lista De Participantes***\n---------------------------\n        LISTA VACIA");
			}
		} else {
			System.err.println("Solo hay un participante, no se puede ordenar!");
			introVolver();
		}
	}

	// Comrpobado
	private static void opc5() {
		int opcT;
		if (coac.getNumeroDeIntegrantesActual() > 0) {
			do {
				System.out
						.print(coac.listarParticipante() + "\nQue integrante quieres comprobar?\nOpcion[0 - Volver]: ");
				try {
					opcT = Integer.parseInt(entrada.nextLine());
				} catch (Exception e) {
					opcT = INTDEFECTO;
					System.err.println(MSGINTDEFECTO);
				}
				if (opcT > 0 && opcT <= coac.getNumeroDeIntegrantesActual()) {
					System.out.println(coac.agrupacionesDeParticipante(opcT - 1));
					introVolver();
				} else {
					System.err.println("Introduce una posicion válida");
				}

			} while (opcT != 0);
		} else {
			System.out.println("\n***Lista De Participantes***\n---------------------------\n        LISTA VACIA");
		}
	}

	private static void opc3() {
		int pos;
		if (!coac.listarParticipante().contains("VACIA")) {
			do {
				System.out.println(coac.listarParticipante());
				System.out.print("Indica la posicion del participante que quieres modificar");
				try {
					pos = Util.leerInt("\nOpción [0 - Salir] : ");
				} catch (Exception e) {
					System.err.println(MSGINTDEFECTO);
					pos = INTDEFECTO;
				}
				if (pos > 0 && pos <= coac.getNumeroDeIntegrantesActual()) {
					String nombre;
					int edad;
					String localidad;
					System.out.println();
					System.out.print("Introduce su nombre[" + coac.getDatosParticipante(pos - 1).split(",")[0] + "]: ");
					nombre = entrada.nextLine();
					do {
						System.out
								.print("Introduce su edad[" + coac.getDatosParticipante(pos - 1).split(",")[1] + "]: ");
						edad = Integer.parseInt(entrada.nextLine());
						if (edad < 18) {
							if (edad < 0)
								System.err.println("Esta muerto o que?");
							else {
								System.err.println("Debe ser mayor de edad");
							}
						}

						if (edad > 150) {
							System.err.println("Nada, es tutancamon, MAXIMO 150 años y ya mucho duras!!");
						}

					} while (edad < 18 || edad > 150);

					System.out.print(
							"Introduce su localidad[" + coac.getDatosParticipante(pos - 1).split(",")[2] + "]: ");
					localidad = entrada.nextLine();
					if (coac.editarParticipante(pos - 1, nombre, edad, localidad)) {
						System.out.println("\nModificado correctamente");
						break;
					}

					else {
						System.err.println("No se ha podido modificar");

					}
				}
				if (pos >= coac.getNumeroDeIntegrantesActual() || pos < 0) {
					System.err.print("\nPosicion incorrecta");
				}

			} while (pos != 0);

		} else {
			System.err.println("No hay participantes");
		}
	}

	// Comprobado
	private static void opc2() {
		if (!coac.listarParticipante().contains("VACIA")) {
			int pos;
			do {
				System.out.println(coac.listarParticipante());
				System.out.print("Indica la posicion del participante que quieres eliminar\nOpción [0 - Volver] : ");
				try {
					pos = Integer.parseInt(entrada.nextLine());
				} catch (Exception e) {
					pos = INTDEFECTO;
					System.err.println(MSGINTDEFECTO);
				}
				if (pos > 0 && pos <= coac.getNumeroDeIntegrantesActual()) {
					if (coac.borrarParticipante(pos - 1)) {
						System.out.println("\nEliminado correctamente");
						break;
					} else {
						System.err.println("No se ha podido eliminar");
					}
				} else {
					System.err.print("\nPosicion incorrecta");
				}
			} while (pos != 0);

		} else {
			System.err.println("No hay participantes");
		}
	}

	// Comprobado
	private static void opc1() {
		String nombre;
		int edad;
		String localidad;
		System.out.print("Introduce su nombre: ");
		try {
			nombre = entrada.nextLine();
		} catch (Exception e) {
			nombre = STRINGDEFECTO;
			System.err.println(MSGSTRINGDEFECTO);
		}
		if (nombre.length() <= 0)
			nombre = STRINGDEFECTO;
		do {
			System.out.print("Introduce su edad(+18): ");
			try {
				edad = Integer.parseInt(entrada.nextLine());
			} catch (Exception e) {
				edad = INTDEFECTO;
				System.err.println(MSGINTDEFECTO);
			}
			if (edad < 18)
				System.err.println("La edad minima son 18 años");
			if (edad > 150)
				System.err.println("La edad maxima son 150 años y mucho es");
		} while (edad < 18 || edad > 150);
		System.out.print("Introduce su localidad: ");
		try {
			localidad = entrada.nextLine();
		} catch (Exception e) {
			localidad = STRINGDEFECTO;
			System.err.println(MSGSTRINGDEFECTO);
		}
		if (localidad.length() <= 0)
			localidad = STRINGDEFECTO;
		if (coac.addParticipante(nombre, edad, localidad))
			System.out.println("\nAñadido correctamente");
		else {
			System.err.println("No se ha podido añadir");
		}
	}

	private static void introVolver() {
		System.out.print("\nPulsa Intro para volver");
		entrada.nextLine();
	}

	public static void mostrarMenuIntegrantes() {
		Util.escribir("\n");
		Util.escribir("┌──────────────────────────┐");
		Util.escribir("│ GESTION DE PARTICIPANTES │");
		Util.escribir("└──────────────────────────┘");
		Util.escribir("  1. Añadir un participante.");
		Util.escribir("  2. Borrar un participante.");
		Util.escribir("  3. Editar los datos de un participante.");
		Util.escribir("  4. Listar todos los participantes.");
		Util.escribir("  5. Listar agrupaciones donde es integrante.");
		Util.escribir("  6. Ordenar por el nombre.");
	}
}
