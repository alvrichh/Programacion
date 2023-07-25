
import java.util.Scanner;

public class Util {

	/////////////////////// LEER////////////////////

	public static double leerLineaDouble(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		double respuesta;
		escribirEnLinea(pregunta);
		respuesta = Double.parseDouble(teclado.nextLine());
		return respuesta;

	}

	public static double leerDouble(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		double respuesta;
		escribir(pregunta);
		respuesta = Double.parseDouble(teclado.nextLine());
		return respuesta;

	}

	public static int leerLineaInt(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		int respuesta;
		escribirEnLinea(pregunta);
		respuesta = Integer.parseInt(teclado.nextLine());
		return respuesta;
	}

	public static int leerInt(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		int respuesta;
		escribir(pregunta);
		respuesta = Integer.parseInt(teclado.nextLine());
		return respuesta;
	}

	public static float leerLineaFloat(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		float respuesta;
		escribirEnLinea(pregunta);
		respuesta = Float.parseFloat(teclado.nextLine());
		return respuesta;
	}

	public static float leerFloat(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		float respuesta;
		escribir(pregunta);
		respuesta = Float.parseFloat(teclado.nextLine());
		return respuesta;
	}

	public static char leerChar(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		char respuesta;
		escribir(pregunta);
		respuesta = teclado.nextLine().charAt(0);
		return respuesta;

	}

	public static String leerString(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		String respuesta;
		escribir(pregunta);
		respuesta = teclado.nextLine();
		return respuesta;

	}

	public static int generarAleatorio(int max) {
		return (int) (Math.random() * max) + 1;
	}

/////////////////////Escribir//////////////////////////////////////////

	// Escribir debajo
	public static void escribir(String texto) {
		System.out.println(texto);
	}
	// Escribir en línea

	public static void escribirEnLinea(String texto) {
		System.out.print(texto);
	}

}