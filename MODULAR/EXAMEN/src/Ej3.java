import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// VARIABLES
		int n1;
		int n2;
		n1 = leerLineaInt("Introduce un número: ");
		n2 = leerLineaInt("Introduce otro número: ");
		escribir("RESULTADO " + calcular(n1, n2));
	}

	static int calcular(int num1, int num2) {// Se llama desde el main y devuelve RESULTADO
		int resultado;
		resultado = num1 + num2;
		return resultado;
	}

	static int sumarSiPrimos(int a, int b) { // Calcula la suma de los números sí primos comprendidos entre a y b
		if (esPrimo = true) {
			int suma;
			suma = a + b;
			return suma;
		}
	}

	static int sumarNoPrimos(int a, int b) {// Calcula la suma de los números no primos comprendidos entre a y b
		if ( esPrimo = false) {
			int suma;
			suma = a + b;
			return suma;
		}
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

	static double media(int a, int b) { // Calcula la media aritmética entre los números a y b
		double res;
		for (int i = 0; i >= b; i++) {
			i += a + i;
		}
		res = i;
		return res;
	}

//UTILS
	public static int leerLineaInt(String pregunta) {
		Scanner leer = new Scanner(System.in);
		int respuesta;
		escribirEnLinea(pregunta);
		respuesta = Integer.parseInt(leer.nextLine());
		return respuesta;
	}

	public static void escribir(String texto) {
		System.out.println(texto);
	}

	public static void escribirEnLinea(String texto) {
		System.out.print(texto);
	}
}