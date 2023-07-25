package unico;

public class Ejercicio6 {

	public static void main(String[] args) {
		int n;
		boolean esPrimo;
		String mensaje;
		
		n = Util.leerInt("Indica un numero");
		
		esPrimo = esPrimo(n);
		
		mensaje = esPrimo ? "Es primo" : "No es primo";
		
		System.out.println(mensaje);
	}

	private static boolean esPrimo(int n) {
		boolean esPrimo;
		esPrimo = true;
		for (int i = 2; i <= n-1; i++) {
			if(n%i == 0) {
				esPrimo = false;
			}
		}
		return esPrimo;
		
	}

}
