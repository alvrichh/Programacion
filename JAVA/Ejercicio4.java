package unico;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n;
		
		System.out.print("Introduce un numero: ");
		n = Integer.parseInt(entrada.nextLine());
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		
		
	}

}
