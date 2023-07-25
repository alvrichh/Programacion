package ejercicio;

public class Arrays { // conocido como un vector

	public static void main(String[] args) 
	{
		Integer[] a = new Integer[5];
		imprimirVector(a);
		
		
		//Integer da valor nulo a las variables no iniciados, si es int asigna el valor = 0;
	}
		/*int[] a = new int[5];
		a[2] = 89;

		System.out.println(a[2]);
		cambiarArray(a);
		System.out.println(a[2]);

		int v = 7;

		cambiarVariable(v);

	}
	
	 * int[][] datos = new int [5][5];
	 * 
	 * 
	 * 
	 */

	static void cambiarArray(int[] a) {
		a[2] = 123;
	}

	static void cambiarVariable(int v) {
		v = v * 2;
	}

	static void rellenarVector(int[] v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = 100;
		}
	}

	static void imprimirVector(Integer[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
