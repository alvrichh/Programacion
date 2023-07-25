import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		menuprincipal(0);
	}

	static void menuprincipal(int opc) {
		do {
			opc = leerInt("MENU PRINCIPAL\n 1 - Gestión de clientes\n 2 - Gestión de productos\n Opción (0-Salir):");
			switch (opc) {
			case 0:
				System.exit(opc);
				break;
			case 1:
				Clientes();
				break;
			case 2:
				Productos();
				break;
			default:
				System.out.println("Escoja una opción válida");
				menu();
				break;
			}
		} while (opc != 0 || opc != 1 || opc != 2);

	}

	static void menu() {
		int opc;
		opc = leerInt("MENU PRINCIPAL\n 1 - Gestión de clientes\n 2 - Gestión de productos\n Opción (0-Salir):");
		
	}

	static void Clientes() {
		char opc;
		opc = leerChar("GESTION DE CLIENTES\n a - Alta\n b - Baja\n c - Consultar\n Opción (0-Volver):");
		if (opc == 'a') {
			escribir("Dándose de alta....\n");

		} else if (opc == 'b') {
			escribir("Dandose de baja....\n");
		} else if (opc == 'c') {
			escribir("Consultando.... \n");
		} else if (opc == 0) {
			menu();
		}
	}

	static void Productos() {
		char opc;
		opc = leerChar("GESTION DE PRODUCTOS\n a - Nuevo\n b - Stock\n c - Ventas\n Opción (0-Volver):");
		if (opc == 'a') {
			escribir("Venta de productos");

		} else if (opc == 'b') {
			escribir("Visionado de Stock");
		} else if (opc == 'c') {
			escribir("Visionado de Ventas");
		}

	}

	// UTILS
	public static void escribir(String texto) {
		System.out.println(texto);
	}

	public static char leerChar(String pregunta) {
		Scanner leer = new Scanner(System.in);
		char respuesta;
		escribir(pregunta);
		respuesta = leer.nextLine().charAt(0);
		return respuesta;

	}

	public static int leerInt(String pregunta) {
		Scanner leer = new Scanner(System.in);
		int respuesta;
		escribir(pregunta);
		respuesta = Integer.parseInt(leer.nextLine());
		return respuesta;
	}
}
