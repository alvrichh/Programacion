package unico;

public class ejercicio3 {
//Implementar un método que reciba frase pedida al usuario por teclado e indique cuántos espacios en blanco tiene.

	public static void main(String[] args) {

		System.out.println(esEspacio(Util.leerString("Introduzca una frase: ")));

//	String cad =Util.leerString("Introduzca una frase: ") ;
//	boolean si = cad .charAt(1)== ' ' ? true : false;
//	System.out.println(si);
	}

	private static int esEspacio(String cad) {
		int res = 0;
		int j = 0;
		for (int i = 0; i < cad.length(); i++) {
			res = cad.charAt(i) == ' ' ? j++ : j + res;
		}
		return res;

	}
}
