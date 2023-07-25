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
	static boolean esPrimo(int numero) {
		  // El 0, 1 y 4 no son primos
		  if (numero == 0 || numero == 1 || numero == 4) {
		    return false;
		  }
		  for (int x = 2; x < numero / 2; x++) {
		    // Si es divisible por cualquiera de estos números, no
		    // es primo
		    if (numero % x == 0)
		      return false;
		  }
		  // Si no se pudo dividir por ninguno de los de arriba, sí es primo
		  return true;
	}
	////////////////////////////////////////////////////////////////////////////////////

	///////////////////// Escribir//////////////////////////////////////////

	// Escribir debajo
	public static void escribir(String texto) {
		System.out.println(texto);
	}

	// Escribir en línea

	public static void escribirEnLinea(String texto) {
		System.out.print(texto);
	}
}