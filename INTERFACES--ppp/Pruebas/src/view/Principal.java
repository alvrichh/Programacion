package view;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;

		System.out.print("Introduce un numero: ");
		try {
			num = Integer.parseInt(entrada.nextLine());
		} catch (Exception e) {
			System.err.println("Opcion introducida incorrecta, asignado valor por defecto [0]");
			num = 0;
		}

		System.out.println(num);
	}

}
