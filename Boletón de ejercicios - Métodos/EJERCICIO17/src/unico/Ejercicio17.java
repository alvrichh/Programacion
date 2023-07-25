package unico;

public class Ejercicio17 {

	public static void main(String[] args) {
		

		
		energiaCinetica();
	}

	private static void energiaCinetica() {
		int resultado;
		int masa;
		int velocidad;
		
		masa = Util.leerInt("Indica la masa");
		velocidad = Util.leerInt("Indica la velocidad");
		
		resultado = (masa*velocidad*velocidad)/2;
		System.out.println("La energia cinetica es de: " + resultado);

	}

}
