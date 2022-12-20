package unico3;

import java.util.Scanner;

public class Examen3 {
	public static void main(String[] args) {
		
		int n;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca un número: " );
		n = Integer.parseInt(leer.nextLine());

		for (int fila = 1; fila <= n; fila ++) {
		
			for(int e = 1; e <= fila; e ++) { //fila-1
				System.out.print(e);
			}
			for(int a = 1;  a <= fila; a++) { //n-fila+1
				System.out.print(a);
			}
			System.out.println();
		}
	}

}

