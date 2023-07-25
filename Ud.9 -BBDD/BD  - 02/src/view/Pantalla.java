package view;

public class Pantalla {

	public static void main (String[] args) {
		menuPrincipal();
	}

	private static void menuPrincipal() {
		int opc = 0;
		do {
			opcionesMenuPrincipal();
			opc = Util.leerInt("Opción [0-Salir] : ");
			switch (opc) {
				case 1 -> menuClientes();
				case 2 -> menuPedidos();
				case 0 -> SalirDelPrograma();
			}
		} while (opc != 0);
	}

	private static void menuClientes() {
		int opc = 0;
		do {
			opcionesMenuClientes();
			opc = Util.leerInt("Opción [0-Volver] : ");
			switch (opc) {
				case 1 -> GestClientes.insertarCliente();
				case 2 -> GestClientes.asignarEmpleadoCliente();
			}
		} while (opc != 0);
	}

	private static void menuPedidos() {
		int opc = 0;
		do {
			opcionesMenuPedidos();
			opc = Util.leerInt("Opción [0-volver] : ");
			switch (opc) {
				case 1 -> GestPedidos.addProductoEnPedido();
				case 2 -> GestPedidos.mostrarDetallePedido();
			}
		} while (opc != 0);
	}

	private static void SalirDelPrograma() {
		Util.escribir("\nFin del programa.");
	}

	private static void opcionesMenuPrincipal() {
		Util.escribir("\nMENU PRINCIPAL");
		Util.escribir("========================");
		Util.escribir("1 - Gestión de clientes");
		Util.escribir("2 - Gestión de pedidos");
	}

	private static void opcionesMenuClientes() {
		Util.escribir("\nGestión de Clientes");
		Util.escribir("------------------------------");
		Util.escribir("1 - Insertar cliente");
		Util.escribir("2 - Asignar empleado a cliente");
	}

	private static void opcionesMenuPedidos() {
		Util.escribir("\nGestión de Pedidos");
		Util.escribir("---------------------------------");
		Util.escribir("1 - Añadir producto a pedido");
		Util.escribir("2 - Mostrar con detalle un pedido");
	}

}