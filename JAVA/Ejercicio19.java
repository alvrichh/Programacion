package unico;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		int num;
		int numShow;
		
		int nInput;
		
		num = 0;
		numShow = 0;
		
		System.out.print("Cuantos numeros quieres ver?: ");
		nInput = 5;//Integer.parseInt(entrada.nextLine());
		System.out.println();
		for (int i = 0; i <= nInput; i++) {
		
			numShow = i + num;
			num = i;
			System.out.println(numShow);
			
			
		}
	}

}
