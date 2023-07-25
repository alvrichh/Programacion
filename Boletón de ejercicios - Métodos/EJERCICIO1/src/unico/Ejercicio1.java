package unico;

import java.util.Scanner;

public class Ejercicio1 {

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		
		System.out.print("Introduce un numero: ");
		n = Integer.parseInt(entrada.nextLine());
		
		eco(n);
		
	}
	
	public static void eco(int reps) {
		for (int i = 1; i <= reps; i++) {
			System.out.println("Eco...");
		}
	}

}
