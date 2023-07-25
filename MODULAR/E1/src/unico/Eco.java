package unico;

import java.util.Scanner;

public class Eco {

	public static void main(String[] args) {
		int n;
		final String ECO = "Eco...";
		n = leerInt("introduzca las vece que va a sona el eco pixita: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(ECO);
		}
	}

	public static int leerInt(String pregunta) {
		Scanner leer = new Scanner(System.in);
		int respuesta;
		escribirEnLinea(pregunta);
		respuesta = Integer.parseInt(leer.nextLine());
		return respuesta;
	}

	public static void escribirEnLinea(String texto) {
		System.out.print(texto);
	}

	public static void escribir(int valor) {
		escribirEnLinea("" + valor);
	}

}
