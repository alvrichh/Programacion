package unico;

public class EntreNumeros {
//Implementar un método al que se le pasen dos números enteros y muestre todos los números comprendidos entre ellos.

	public static void main(String[] args) {
		int num1;
		int num2;
		num1 = Util.leerLineaInt("Introduzca un número entero: ");
		num2 = Util.leerLineaInt("Introduzca un otro número entero: ");

		mostrarEntreDosNumeros(num1, num2);
	}

	public static void mostrarEntreDosNumeros(int desde, int hasta) {
		
		for (int i = desde; i <= hasta; i++) {
			System.out.println(i);
		}
	}
}
