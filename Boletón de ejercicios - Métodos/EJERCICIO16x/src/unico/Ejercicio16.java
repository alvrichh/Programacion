package unico;

public class Ejercicio16 {

	public static void main(String[] args) {
		int n;
		int decimal;
		
		n = Util.leerInt("Introduce un numero binario");
		
		decimal = conversionABinario(n);
		System.out.println(decimal);
	}

	private static int conversionABinario(int n) {
		int decimal;
		String nString;
		nString = String.valueOf(n);
		
		decimal = 0;
		for (int i = 0; i < nString.length() ; i++) {
			if(nString.charAt(i) == '1') {
				decimal += Math.pow(2, nString.length()-i-1);
			}
		}
		
		return decimal;
	}

}
