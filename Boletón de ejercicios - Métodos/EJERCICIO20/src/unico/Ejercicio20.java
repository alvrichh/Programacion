package unico;

public class Ejercicio20 {

	public static void main(String[] args) {

		
		int n;
		
		n = Util.leerInt("Introduce un número");
		
		conversor(n);
	}

	private static void conversor(int n) {
		String nString;
		nString = String.valueOf(n);
		System.out.print("El número 4351 traducido al sistema de asteriscos es: ");
		System.out.println();
		int dig1;
		for (int i = 0; i < nString.length(); i++) {
			for (int j = 1; j <= Integer.parseInt(nString.substring(i,i+1)); j++) {
				System.out.print("*");
			}
			if(i != nString.length()-1) {
				System.out.print("_");
			}
			
		}
	}
	
	
}
