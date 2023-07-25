package view;

public class Pantalla {

	public static void menuPrincipal() {
		int opc = 0;
		do {
			opcionesMenuPrincipal();
			opc = Util.leerInt("Opción [0-Salir] : ");
			switch (opc) {
				case 1 -> menuEmpleados();
				case 2 -> menuProductos();
				case 0 -> SalirDelPrograma();
			}
		} while (opc != 0);
	}

	private static void menuEmpleados() {
		int opc = 0;
		do {
			opcionesMenuEmpleados();
			opc = Util.leerInt("Opción [0-Volver] : ");
			switch (opc) {
				case 1 -> GestEmpleados.listadoCompletoEmpleados();
			}
		} while (opc != 0);

	}

	private static void menuProductos() {
		int opc = 0;
		do {
			opcionesMenuProductos();
			opc = Util.leerInt("Opción [0-volver] : ");
			switch (opc) {
				case 1 -> GestProductos.mostrarListadoCompleto();
				case 2 -> GestProductos.mostrarListadoFiltro();
				case 3 -> GestProductos.mostrarProductosPorCategoria();
				case 4 -> GestProductos.obtenerUnProducto();
				case 5 -> GestProductos.eliminarUnProducto();
				case 6 -> GestProductos.insertarUnProducto();
			}
		} while (opc != 0);
	}

	private static void SalirDelPrograma() {
		Util.escribir("\nFin del programa.");
	}

	private static void opcionesMenuPrincipal() {
		Util.escribir("\nMENU PRINCIPAL");
		Util.escribir("========================");
		Util.escribir("1 - Gestión de empleados");
		Util.escribir("2 - Gestión de productos");
	}

	private static void opcionesMenuEmpleados() {
		Util.escribir("\nGestión de Empleados");
		Util.escribir("----------------------");
		Util.escribir("1 - Listado completo");
	}

	private static void opcionesMenuProductos() {
		Util.escribir("\nGestión de Productos");
		Util.escribir("------------------------------------------------");
		Util.escribir("1 - Listado completo");
		Util.escribir("2 - Listado de productos con stock superior");
		Util.escribir("3 - Listado de productos por líneas de productos");
		Util.escribir("4 - Buscar un producto");
		Util.escribir("5 - Eliminar un producto");
		Util.escribir("6 - Insertar un producto");
	}

}