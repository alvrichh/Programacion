package unico;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int rangoMin = 1;
		final int rangoMax = 10;
		
		int num;
		
		do {
			System.out.println("Introduce un numero entre el " + rangoMin + " y " + rangoMax);
			num = Integer.parseInt(entrada.nextLine());
		} while (num < rangoMin || num > rangoMax);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}

}
