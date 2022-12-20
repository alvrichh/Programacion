package unico;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int valorMin;
		int valorMax;
		int numEntrada;
		
		System.out.print("Introduce el valor minimo: ");
		valorMin = Integer.parseInt(entrada.nextLine());
		System.out.print("Introduce el valor maximo: ");
		valorMax = Integer.parseInt(entrada.nextLine());
	
		do {
			System.out.println("Introduce un numero entre " + valorMin + " y " + valorMax);
			numEntrada = Integer.parseInt(entrada.nextLine());
		} while (numEntrada < valorMin || numEntrada > valorMax);
		
		System.out.println("Muy bien");
	}

}
