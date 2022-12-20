package dia3;

import java.util.Scanner;

public class Segun_condicional {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int a;
		int b;

		a = 2;

		switch (a) {
		case 1:
		case 2:
			b = 30;
			break;
		default:
			b = 9; // No hace falta break
		}
		System.out.println("b = " + b);
	}
}
