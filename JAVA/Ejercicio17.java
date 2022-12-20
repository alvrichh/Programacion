package unico;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		final int PASSWORD = 1234;
		final String MSGCORRECTO = "La caja fuerte se ha abierto satisfactoriamente";
		final String MSGINCORRECTO = "Lo siento, esa no es la combinación";
		
		int passwordInput;
		
		for (int i = 1; i <= 4; i++) {
			System.out.print("Introduce la contraseña: ");
			passwordInput = Integer.parseInt(entrada.nextLine());
			if(passwordInput != PASSWORD) {
				System.out.println(MSGINCORRECTO);
			}else {
				System.out.println(MSGCORRECTO);
				i = 5;
			}
			
		}
		
	}

}
