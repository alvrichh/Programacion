package start;

import banco.CuentaCorriente;

import java.util.Scanner;


public class Principal {
	static CuentaCorriente[] cuentas = new CuentaCorriente[10];
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

		menu();
	}

	static void menu() {
		int opc;
		boolean salir = false;
		do {
			System.out.println("-----Menú-----");
			System.out.println("1. Dar de alta una cuenta corriente");
			System.out.println("2. Dar de baja una cuenta corriente");
			System.out.println("3. Consulta una cuenta corriente");
			System.out.println("4. Lista todas las cuentas corrientes");
			System.out.println("5. Modificar un dato de una cuenta corriente");
			System.out.println("0. SALIR");
			opc = Integer.parseInt(entrada.nextLine());
			switch (opc) {
			case 0:
				salir = true;
				break;
			case 1:
				salir = GestionCC.altaCuenta();
				break;
			case 2:
				salir = GestionCC.bajaCuenta();
				break;
			case 3:
				salir = GestionCC.consultarCuenta();
				break;
			case 4:
				salir = GestionCC.listarCuentas();
				break;
			case 5:
				salir = menuDatoAModificar();
				break;
			}
		} while (!salir);
		System.out.println();
		System.out.println("Fin del programa. Buen dia");

	}

	static boolean menuDatoAModificar() {
		boolean volver = false;
		int cuenta;
		int dato;
		System.out.println("----Menu de modificacion de datos----");
		System.out.print("Que cuenta quieres modificar?: ");
		cuenta = Integer.parseInt(entrada.nextLine());
		System.out.println("Que dato quieres modificar??");
		System.out.println("1. Saldo de la cuenta corriente");
		System.out.println("2. Limite de descubrimiento");
		System.out.println("3. Tipo de cuenta");
		System.out.println("4. Nombre del banco");
		System.out.println("5. Capital del banco");
		System.out.println("6. Calle del banco");
		System.out.println("7. Numero de la calle del banco");
		System.out.println("8. Codigo postal del banco");
		System.out.println("9. Nombre del titular");
		System.out.println("10. Apellidos del titular");
		System.out.println("11. Dni del titular");
		System.out.println("12. Calle del titular");
		System.out.println("13. Numero de la calle del titular");
		System.out.println("14. Codigo postal del titular");
		dato = Integer.parseInt(entrada.nextLine());
		GestionCC.modificarDato(cuenta, dato);
		volver = volver();
		return volver;
	}

	static boolean volver() {
		System.out.println();
		boolean resultado = false;
		int opc;
		System.out.println("Desea volver al menú anterior?\n1. Si\n2. No");
		opc = Integer.parseInt(entrada.nextLine());
		if(opc == 2) resultado = true;
		return resultado;

	}
}
