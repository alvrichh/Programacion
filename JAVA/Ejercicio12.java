package unico;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int calificacion;
		int counterSuspensos;
		
		counterSuspensos = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Introduce la calificacion del alumno " + i + ": ");
			calificacion = Integer.parseInt(entrada.nextLine());
			if(calificacion < 5) {
				counterSuspensos++;
			}
		}
		
		System.out.println("Han suspendido " + counterSuspensos + " alumnos");
	}

}
