package view;

import controller.CantidadProductosNoValidoException;
import controller.Tienda;

public class Principal {

	protected static Tienda ControllerTienda;

	public static void main(String[] args) {
		final int TOTAL_PRODUCTOS = 10; 

		try {
			ControllerTienda = new Tienda(TOTAL_PRODUCTOS);
			start();
		} catch (CantidadProductosNoValidoException e) {
			Util.escribirError(e.getMessage());
		}
	}

	private static void start() {
		int opc;
		do {
			showMenu();
			opc = Util.leerInt("Opción [0-SALIR] : ");
			switch (opc) {
			case 1 -> GestionTienda.opcAnadir();
			case 2 -> GestionTienda.opcBorrar();
			case 3 -> GestionTienda.opcObtener();
			case 4 -> GestionTienda.opcListar();
			case 5 -> GestionTienda.opcValor();
			}
		} while (opc != 0);
		opcSalir();
	}

	private static void opcSalir() {
		Util.escribir("Fin del programa.");
		System.exit(0);
	}

	private static void showMenu() {
		Util.escribir("");
		Util.escribir("MENU DE LA TIENDA");
		Util.escribir("==================================");
		Util.escribir("1 - AÑADIR NUEVO PRODUCTO");
		Util.escribir("2 - BORRAR PRODUCTO POR POSICION");
		Util.escribir("3 - OBTENER PRODUCTO POR POSICION");
		Util.escribir("4 - LISTAR TODOS LOS PRODUCTOS");
		Util.escribir("5 - VALOR ALMACENADO DE UN PRODUCTO");
	}

}