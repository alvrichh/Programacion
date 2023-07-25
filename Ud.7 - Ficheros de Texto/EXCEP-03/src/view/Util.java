package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Util {

	static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	public static String leerString(String pregunta) {
		String respuesta = "";
		escribirEnLinea(pregunta);
		try {
			respuesta = teclado.readLine();
		} catch (Exception e) {
			escribirError(e.getMessage());
		}
		return respuesta;
	}

	public static double leerDouble(String pregunta) {
		double respuesta = 0.0;
		boolean ok;

		do {
			escribirEnLinea(pregunta);
			try {
				respuesta = Double.parseDouble(teclado.readLine());
				ok = true;
			} catch (Exception e) {
				escribirError("Debes introducir un número válido.");
				ok = false;
			}
		} while (!ok);

		return respuesta;
	}

	public static int leerInt(String pregunta) {
		int respuesta = 0;
		boolean ok;

		do {
			escribirEnLinea(pregunta);
			try {
				respuesta = Integer.parseInt(teclado.readLine());
				ok = true;
			} catch (Exception e) {
				escribirError("Debes introducir un número válido.");
				ok = false;
			}
		} while (!ok);

		return respuesta;
	}

	public static void escribirEnLinea(String texto) {
		System.out.print(texto);
	}

	public static void escribir(String texto) {
		System.out.println(texto);
	}

	public static void escribirError(String texto) {
		System.err.println(texto);
	}

}