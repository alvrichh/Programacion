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
	public static String leerString(String mensaje) {
		Scanner entrada = new Scanner(System.in);
		String n;
		System.out.print(mensaje + ": ");
		n = entrada.nextLine();
		return n;
	}
	
	public static char leerChar(String mensaje) {
		Scanner entrada = new Scanner(System.in);
		char n;
		System.out.print(mensaje + ": ");
		n = entrada.next().charAt(0);
		return n;
	}
	

}

