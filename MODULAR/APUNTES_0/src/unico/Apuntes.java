package unico;

import java.util.Scanner;

public class Apuntes {

	public static void main(String[] args) {

		int a;
		int b;
		int s;
		
		a= leerInt("Instroduzca un valor para a = ");
		b= leerInt("Instroduzca un valor para b = ");

		s = sumar(a, b);
		escribir(s);
	}
	public static int leerInt(String pregunta) {
		Scanner leer = new Scanner(System.in);
		int respuesta;
		escribirEnLinea(pregunta);
		respuesta = Integer.parseInt(leer.nextLine());
		return respuesta;
	}
	
	public static int sumar(int n1, int n2) {
		int resultado;
		resultado = n1 + n2;
		return resultado;
	}
//EL PROGRAMA VA A LLAMAR AL MÉTODO DEPENDIENDO DE LA ENTRADA, ESTO SE LLAMA SOBRECARGA DE MÉTODO
	
	public static void escribirEnLinea(String texto) {
		System.out.print(texto);
	}
	public static void escribir(String texto) {
		System.out.println(texto);
	}
	public static void escribir(int valor) {
		escribir("" + valor);
	}
	static void opcionNoValida() {
		System.err.println("opcion no valida! ");
	}
}
