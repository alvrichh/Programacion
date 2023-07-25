package unico;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		int año;
		boolean bisiesto;
		String mensaje;
		
		año = Util.leerInt("Indica un año");
		
		bisiesto = comprobarBisiesto(año);
		mensaje = bisiesto ? "Es bisiesto" : "No es bisiesto";
		System.out.println(mensaje);
	}

	private static boolean comprobarBisiesto(int año) {
		boolean bisiesto;
		bisiesto = false;
		if(año%4 == 0 && año%100 == 0 && año%400 == 0) {
			bisiesto = true;
		}
		return bisiesto;
		
	}

}
