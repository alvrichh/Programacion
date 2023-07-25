package unico;

import java.util.Scanner;

public class Util {
	public static int leerInt(String mensaje) {
		Scanner entrada = new Scanner(System.in);
		int n;
		System.out.print(mensaje + ": ");
		n = Integer.parseInt(entrada.nextLine());
		return n;
	}
	public static double leerDouble(String mensaje) {
		Scanner entrada = new Scanner(System.in);
		double n;
		System.out.print(mensaje + ": ");
		n = Double.parseDouble(entrada.nextLine());
		return n;
	}
	

}

