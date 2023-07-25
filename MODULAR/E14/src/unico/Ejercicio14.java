package unico;

public class Ejercicio14 {

	public static void main(String[] args) {
		int n;
		boolean esAfortunado;
		String mensaje;
		
		esAfortunado = false;
		
		n = Util.leerInt("Introduzca un número");
		esAfortunado = esAfortunado(n);
		mensaje = esAfortunado ? "El numero " + n + " es afortunado." : "El numero " + n + " no es afortunado.";
		System.out.println(mensaje);
	}

	private static boolean esAfortunado(int n) {
		boolean esAfortunado;
		String nString;
		int counterAfortunados;
		int counterNoAfortunados;
		
		counterAfortunados = 0;
		counterNoAfortunados = 0;
		
		esAfortunado = false;
		nString = Integer.toString(n); 
				
		for (int i = 0; i < nString.length(); i++) {
			if(nString.charAt(i) == '3' || nString.charAt(i) == '7' || nString.charAt(i) == '8' ||
					nString.charAt(i) == '9') {
				counterAfortunados++;
			}else {
				counterNoAfortunados++;
			}
		}
		esAfortunado = counterAfortunados > counterNoAfortunados;
		
		return esAfortunado;
	}

}