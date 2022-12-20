package unico;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.print("Introduce un numero: ");
		num = Integer.parseInt(entrada.nextLine());
		System.out.println("Numero Cuadrado Cubo");
		for (int i = num+1; i <= num+6; i++) {
			System.out.print(i);
			System.out.print("   |    " + (i*i));
			System.out.print("   |    " + (i*i*i));
			System.out.println();
		}
	}

}
