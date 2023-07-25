package start;

import java.util.Scanner;

import model.Pila;
import model.PilaTabla;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Pila p = new PilaTabla();

		for (int i = 0; i < 10; i++) {
			System.out.print("Introduce un número: ");
			int x = scan.nextInt();
			p.push(x);
		}

		while (!p.isEmpty()) {
			System.out.println(p.pop());
		}
	}
}
