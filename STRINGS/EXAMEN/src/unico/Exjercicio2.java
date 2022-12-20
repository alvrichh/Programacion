package unico;

public class Exjercicio2 {

	public static void main(String[] args) {

		System.out.println(contarPalabraExsistente("Una noche y otra noche oscura", "noche"));
	}

	public static int contarPalabraExsistente(String texto, String palabra) {
		int res = 0;
		while (texto.indexOf(palabra) > -1) {
			texto = texto.substring(texto.indexOf(palabra) + palabra.length(), texto.length());
			res++;
		}
		return res;

	}

}
