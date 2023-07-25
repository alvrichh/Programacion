package unico;

public class Ejercicio7 {

	public static void main(String[] args) {
		int n;
		
		n = Util.leerInt("Indica un numero: ");
		
		divisores(n);
				
	}

	private static void divisores(int n) {
		for (int i = 1; i <= n; i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
		
	}

}
