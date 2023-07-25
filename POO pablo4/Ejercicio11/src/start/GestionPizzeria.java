package start;

import java.util.Scanner;

import pizzeria.Pedido;

public class GestionPizzeria {

	static Pedido[] pedidos;
	static int capacidad;

	public static void abrirPizzeria() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Indica la capacidad de pedidos, si indicas 0 se pondra por defecto 5: ");
		capacidad = Integer.parseInt(entrada.nextLine());
		pedidos = new Pedido[capacidad];
	}

	public static void añadirPedido() {
		pedidos = new Pedido[capacidad + 1];
	}

	public static void mostrarPedidos() {
		for (int i = 0; i < pedidos.length; i++) {
			System.out.println(pedidos[i]);
		}
	}

	public static int numeroPedidos() {
		int resultado = 0;
		for (int i = 0; i < pedidos.length; i++) {
			if (pedidos[i] != null)
				resultado++;
		}

		return resultado;
	}
	
	
}
