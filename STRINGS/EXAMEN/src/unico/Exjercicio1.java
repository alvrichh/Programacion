package unico;

public class Exjercicio1 {

	public static void main(String[] args) {

		System.out.println(encriptar("Manolita", 'a', 'x'));

	}

	public static String encriptar(String texto, char letraAntes, char letraDespues) {
		String res ="";
		for (int i = 0; i < texto.length(); i++) {
			res += (texto.charAt(i)==letraAntes) ? letraDespues: texto.charAt(i);
		}
		return res;

	}
}
