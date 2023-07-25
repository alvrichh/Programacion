package unico;

public class NumeroMayor {
//Implementar un método que reciba como parámetros dos números enteros y que devuelva el mayor de los dos.
//Ampliación : Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números. Piensa un poco, 
//no hagas el algoritmo de comparación de los 3 números desde cero.
	public static void main(String[] args) {
		// CONSTANTES
		final String MENSAJE = "El número mayor es: ";
		// VARIABLES
		int n1;
		int n2;
		int n3;
		int m;
		// Método leer
		n1 = Util.leerLineaInt("Introduzca un número: ");
		n2 = Util.leerLineaInt("Introduzca otro número: ");
		n3 = Util.leerLineaInt("Introduzca otro número: ");
		m = (n1 > n2 && n1 > n3) ? n1 : ((n2 > n3) ? n2 : n3);
		System.out.println(MENSAJE + m);
	}
}
