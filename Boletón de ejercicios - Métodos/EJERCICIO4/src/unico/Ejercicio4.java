package unico;

import java.util.Scanner;

public class Ejercicio4 {
Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n1;
		int n2;
		int n3;
		int opc;

		
		opc = Util.leerInt("Cuantos numeros quieres comparar? 2 o 3");
		if(opc == 2) {
			n1 = Util.leerInt("Introduce un numero");
			n2 = Util.leerInt("Introduce un numero");
			numMayor(n1,n2);
		}else {
			n1 = Util.leerInt("Introduce un numero");
			n2 = Util.leerInt("Introduce un numero");
			n3 = Util.leerInt("Introduce un numero");
			numMayor(n1,n2,n3);
		}

	}

	private static void numMayor(int n1, int n2, int n3) {
		int mayor;
		if (n1 > n2) {
			if(n1 > n3) {
				mayor = n1;
			}else {
				mayor = n2;
			}
		}else {
			if(n2 > n3) {
				mayor = n2;
			}else {
				mayor = n3;
			}
		}
		System.out.println("El numero mayor es: " + mayor);
	}

	private static void numMayor(int n1, int n2) {
		int mayor;
		mayor = n1 > n2 ? n1 : n2;
		System.out.println("El numero mayor es: " + mayor);
	}

}
