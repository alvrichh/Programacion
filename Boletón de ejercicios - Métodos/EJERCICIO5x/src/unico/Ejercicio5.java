package unico;

public class Ejercicio5 {
	static boolean esVocal;
	public static void main(String[] args) {
		
		String letra;
		
		letra = Util.leerChar("Indica una letra");
		comprobarVocal(letra);
	}

	private static void comprobarVocal(String letra) {
		if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || 
		letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || 
		letra.equalsIgnoreCase("u")) {
			esVocal = true;
		}else {
			esVocal = false;
		}
		
		if(esVocal) {
			System.out.println("Es una vocal");
		}else {
			System.out.println("No es una vocal");
		}
		
	}

}
