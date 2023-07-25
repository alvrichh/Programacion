package unico;

import java.util.Scanner;

import jdk.jshell.execution.Util;

public class Ejercicio00 {
	Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		boolean salir = false;
		int opcion;
		do {
			mostrarMenuPrincipal();
			
			opcion = Util.leerInt("Opción (0-Volver): ");
			switch (opcion) {
			case 0: salir = true ; break;
			case 1: salir = false;
				break;
				default opcion = 0;
			}
		}
	}

	private static void mostrarMenuPrincipal() {
		
	}

}
