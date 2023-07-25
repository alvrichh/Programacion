package unico;

import java.util.Scanner;

public class Ejercicio3 {

	
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);	
	
	double base;
	double altura;
	int opc;
	
	System.out.println("Introduce la base: ");
	base = Double.parseDouble(entrada.nextLine());
	System.out.println("Introduce la altura");
	altura = Double.parseDouble(entrada.nextLine());
	
	System.out.println("Que quieres calcular? 1. Area 2. Volumen");
	opc = Integer.parseInt(entrada.nextLine());
	switch(opc) {
	case 1: areaCilindro(base,altura); break;
	case 2: volumenCilindro(base,altura); break;
	}
	
	
	
	
	}

	private static void volumenCilindro(double base, double altura) {
		double resultado;
		resultado = 2 * 3.14 * base * (base + altura);
		System.out.println("El volumen es: " + resultado);
		
	}

	private static void areaCilindro(double base, double altura) {
		double resultado;
		resultado = 3.14 * base * base * altura;
		System.out.println("El area es: " + resultado);
		
	}
	

}
