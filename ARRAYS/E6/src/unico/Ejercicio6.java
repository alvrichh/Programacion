package unico;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int NUM = 7;
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);

			if(i%NUM == 0) {
				System.out.println(i);
			}
		}
		
	}

}
