package unico;

import java.util.Scanner;

public class Util {

	/////////////////////// LEER////////////////////

	public static double leerLineaDouble(String pregunta) {
		Scanner leer = new Scanner(System.in);
		double respuesta;
		escribirEnLinea(pregunta);
		respuesta = Double.parseDouble(leer.nextLine());
		return respuesta;

	}

	public static double leerDouble(String pregunta) {
		Scanner leer = new Scanner(System.in);
		double respuesta;
		escribir(pregunta);
		respuesta = Double.parseDouble(leer.nextLine());
		return respuesta;

	}

	public static int leerLineaInt(String pregunta) {
		Scanner leer = new Scanner(System.in);
		int respuesta;
		escribirEnLinea(pregunta);
		respuesta = Integer.parseInt(leer.nextLine());
		return respuesta;
	}

	public static int leerInt(String pregunta) {
		Scanner leer = new Scanner(System.in);
		int respuesta;
		escribir(pregunta);
		respuesta = Integer.parseInt(leer.nextLine());
		return respuesta;
	}

	public static float leerLineaFloat(String pregunta) {
		Scanner leer = new Scanner(System.in);
		float respuesta;
		escribirEnLinea(pregunta);
		respuesta = Float.parseFloat(leer.nextLine());
		return respuesta;
	}

	public static float leerFloat(String pregunta) {
		Scanner leer = new Scanner(System.in);
		float respuesta;
		escribir(pregunta);
		respuesta = Float.parseFloat(leer.nextLine());
		return respuesta;
	}

	public static char leerChar(String pregunta) {
		Scanner leer = new Scanner(System.in);
		char respuesta;
		escribir(pregunta);
		respuesta = leer.nextLine().charAt(0);
		return respuesta;

	}

	public static String leerString(String pregunta) {
		Scanner leer = new Scanner(System.in);
		String respuesta;
		escribir(pregunta);
		respuesta = leer.nextLine();
		return respuesta;

	}
	////////////////////////////////////////////////////////////////////////////////////

	///////////////////// Escribir/////////////////////////////////////////
	// Escribir debajo
	public static void escribir(String texto) {
		System.out.println(texto);
	}

	// Escribir en línea

	public static void escribirEnLinea(String texto) {
		System.out.print(texto);
	}

	public static void solucion(double r) {
		System.out.println(r);
		
	}
}