import java.util.Scanner;

public class Recursivo {

	public static void main(String[] args) {
		int num = leerLineaInt("Introduce un número entero positivo: ");
		escribir("El número de dígitos del número "+ num + " es: " + cuentaCifras(num));
	}

	static int cuentaCifras(int num) {
		if (num < 10)
			return 1;
		else {
			return 1 + cuentaCifras(num / 10);
		}
	}
	//UTILS
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
}
