package unico;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int counter;
		int producto;
		
		producto = 1;
		counter = 0;
		
		for (int i = 1; i <= 100; i++) {
			if(i%2 != 0 && counter < 10) {
				counter ++;
				producto *= i;
			}
		}
		
		
		System.out.println("Producto: " + producto);
	}

}
