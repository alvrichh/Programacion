package unico;

//Implementar un método al que se le pase un número entero y devuelva el número total de divisores primos que tiene.

public class Divprimo {
	public static void main(String[] args) {
		int n;
		int p;
		boolean es;
		n = Util.leerInt("introduzca numero");
		p =primos(n);
		es = esPrimo(n);
		Util.escribir("El número " + n + " ¿es primo? " + es + " tiene " + p + " divisores primos.");
	}

	public static int primos(int num) {
		int respuesta = 0;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0 && esPrimo(i)) {
				respuesta++;
			}
		}
		return respuesta;
	}

	public static boolean esPrimo(int numero) {

		boolean respuesta;
		respuesta = true;

		if (numero == 0 || numero == 1 || numero == 4) {
			respuesta = false;
		}
		for (int x = 2; x < numero / 2; x++) {
			// Si es divisible por cualquiera de estos números, no es primo
			if (numero % x == 0)
				respuesta = false;
		}

		return respuesta;
	}

}
