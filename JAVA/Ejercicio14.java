package unico;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce la altura del triangulo");
		num = Integer.parseInt(entrada.nextLine());
		
		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
