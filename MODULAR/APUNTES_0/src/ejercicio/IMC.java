package ejercicio;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {

		double peso;
		double altura;
		double r;

		peso = LeerDouble("Introduce peso: ");
		altura = LeerDouble("Introduce altura: ");
		double imc;
		r = imc(peso, altura);
		escribir(r);
	}

	public static double LeerDouble(String pregunta) {

		Scanner leer = new Scanner(System.in);
		double res;
		escribir(pregunta);
		res = Double.parseDouble(leer.nextLine());
		return res;
	}

	public static void escribir(String texto) {
		System.out.println(texto);
	}

	public static void escribir(double valor) {
		escribir("" + valor);
	}

	public static double imc(double p, double h) {
		double res;
		res = p * h * h;
		return res;
	}
}
