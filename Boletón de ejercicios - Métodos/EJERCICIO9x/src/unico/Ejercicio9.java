package unico;

public class Ejercicio9 {

	public static void main(String[] args) {
		int n1;
		int n2;
		
		do {
			n1 = Util.leerInt("Indica un numero");
			n2 = Util.leerInt("Indica otro numero");
		} while (n1 < 0 && n2 < 0);
		


		sonAmigos(n1,n2);
	}

	private static void sonAmigos(int n1, int n2) {
		int sumaN1;
		int sumaN2;
		
		sumaN1 = 0;
		sumaN2 = 0;
		
		for (int i = 1; i < n1; i++) {
			if(n1%i == 0) {
				sumaN1+= i;
			}
			if(n2%i == 0) {
				sumaN2+= i;
			}
		}
		if(sumaN1 == n2 && sumaN2 == n1) {
			System.out.println("Los numeros son hermanos");
		}else {
			System.out.println("No son hermanos");
		}
		
	}

}
