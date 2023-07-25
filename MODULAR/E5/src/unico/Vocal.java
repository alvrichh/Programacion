package unico;

public class Vocal {
//Implementar un método que, mediante un booleano, indique si el carácter que se pasa como parámetro de entrada corresponde con una vocal.

	public static void main(String[] args) {
		boolean vocal;
		char letra;
		String mensaje;
		letra = Util.leerChar("Introduzca una letra: ");
		vocal = (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o'  || letra == 'u'  ) ? true : false;
//		vocal = (letra >= 'a' && letra <= 'u') ? true : false;
		mensaje = vocal ? "Es vocal" : "No es vocal";
		System.out.println(mensaje);
	}

}
