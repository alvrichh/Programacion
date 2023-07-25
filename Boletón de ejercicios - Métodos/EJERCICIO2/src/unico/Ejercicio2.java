package unico;

import java.util.Scanner;

public class Ejercicio2 {

	
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

		
	int n1;
	int n2;
	
	System.out.print("Introduce el numero 1: ");
	n1 = Integer.parseInt(entrada.nextLine());
	System.out.print("Introduce el numero 2: ");
	n2 = Integer.parseInt(entrada.nextLine());
	
	comprendidos(n1,n2);
	}

	private static void comprendidos(int n1, int n2) {
		for (int i = n1; i <= n2; i++) {
			System.out.println(i);
		}
		
	}

}
