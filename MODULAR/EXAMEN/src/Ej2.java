import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		int n;
		char c;
		n = leerLineaInt("Introduce un número: ");
		c = leerLineaChar("Introduce un carácter: ");
		escribir(conversor(n, c));
		
	}

	static String conversor(int num, char c) {
		String conversor(c * num);
		return conversor;
	}

	// UTILS
	public static void escribir(String texto) {
		System.out.println(texto);
	}

	public static void escribirEnLinea(String texto) {
		System.out.print(texto);
	}

	public static int leerLineaInt(String pregunta) {
		Scanner leer = new Scanner(System.in);
		int respuesta;
		escribirEnLinea(pregunta);
		respuesta = Integer.parseInt(leer.nextLine());
		return respuesta;
	}

	public static char leerLineaChar(String pregunta) {
		Scanner leer = new Scanner(System.in);
		char respuesta;
		escribirEnLinea(pregunta);
		respuesta = leer.nextLine().charAt(0);
		return respuesta;

	}
}
