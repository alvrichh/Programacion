package unico;

public class ejercicio1 {
	// Implementar un método que reciba 2 palabras y devuelva la más corta.

	public static void main(String[] args) {

		
		System.out.println(palabraCorta("leña al mono", "aseite"));
	}

	private static String palabraCorta(String p1, String p2) {
		String resp;
		resp = (p1.length()< p2.length()) ? p1 : p2;
		return resp;

	}

}
