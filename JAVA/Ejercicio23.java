package unico;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String num;	
		
		System.out.print("Introduce un numero: ");
		num = entrada.nextLine();		
		
		System.out.println("Las introducido el numero: " + num);
		System.out.print("Al revez quedaria: ");
		for (int i = num.length()-1; i >= 0; i--) {
			System.out.print(num.charAt(i));
		}
	}
}