package unico;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int nPositivos;
		int nNegativos;
		int numInput;
		
		nPositivos = 0;
		nNegativos = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ". Introduce un numero: ");
			numInput = Integer.parseInt(entrada.nextLine());
			if(numInput >= 0) {
				nPositivos++;
			}else {
				nNegativos++;
			}
		}
		System.out.println("Hay " + nPositivos + " numeros positivos");
		System.out.println("Hay " + nNegativos + " numeros negativos");
	}

}
