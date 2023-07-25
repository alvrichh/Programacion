package unico;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		int n;
		int digitos;
		
		n = Util.leerInt("Introduce el número");
		
		digitos = nDigitos(n);
		System.out.println("El numero " + n + " tiene " + digitos + " digitos");
		
	}

	private static int nDigitos(int n) {
		int nDigitos;
		nDigitos = 1;
		if(n > 0) {
			while (n/10 > 0) {
				nDigitos++;
				n/=10;
			}
		}else {
			nDigitos = 0;
			while (n*10 < 0) {
				nDigitos++;
				n/=10;
			}
		}

		
		return nDigitos;
	}

}
