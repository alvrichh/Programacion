package unico;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double num;

		do {
			System.out.println("Introduce un numero diferente a 0");
			num = Double.parseDouble(entrada.nextLine());
			if(num%2 == 0) {
				System.out.println("Es par");
			}else {
				System.out.println("No es par");
			}
			if(num >= 0) {
				System.out.println("Es positivo");
			}
			System.out.println(num + " al cuadrado: " + (num*num));
		}while(num != 0);
	}

}
