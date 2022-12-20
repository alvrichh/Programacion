package unico;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}

}
