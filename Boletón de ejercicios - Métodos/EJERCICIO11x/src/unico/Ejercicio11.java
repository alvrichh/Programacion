package unico;

public class Ejercicio11 {

	public static void main(String[] args) {

		char peticion;
		double radio;
		double resultado;
		
		peticion = Util.leerChar("Quieres calcular la superficie ( S ) o el volumen ( V ): ");
		radio = Util.leerDouble("Indica el radio");
		resultado = superficieOvolumen(peticion,radio);
		System.out.println(resultado);
	}
	
	static double superficieOvolumen(char peticion, double radio) {
		double resultado;
		if(peticion == 'S') {
			System.out.println("Superficie");
			resultado = 4 * 3.14 * radio * radio;
		}else {
			System.out.println("Volumen");
			resultado = (double) 4/3 * 3.14 * radio + radio * radio;
		}
		
		
		return resultado;

	}



}
