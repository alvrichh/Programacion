package unico;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		int factorialNum;
		
		factorialNum = 1;
		
		System.out.print("Introduce un numero para calcular su factorial: ");
		num = Integer.parseInt(entrada.nextLine());
		
		for (int i = 1; i <= num; i++) {
			factorialNum *= i;
		}
		
		
		System.out.println("El factorial de " + num + " es: " + factorialNum);
	}

}
