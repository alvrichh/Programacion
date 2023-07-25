package unico;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		double n;
		int nResultado; 
		
		n = Util.leerInt("Indica un numero");
		
		nResultado = raizCuadrada(n);
		System.out.println(nResultado);
	}

	private static int raizCuadrada(double n) {
		int resultado;
		resultado = (int) Math.sqrt(n);
		return resultado;
		
	}

}
