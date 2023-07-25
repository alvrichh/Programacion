package start;

public class Principal {

	public static void main(String[] args) {

		Integer[] tabla = new Integer[10];

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100 + 1);
		}
		System.out.println("TABLA SIN ORDENAR");
		for (int i = 0; i < tabla.length; i++) {
			System.out.println((i + 1) + " " + tabla[i]);
		}

		ordenarDecreciente(tabla);
		System.out.println("TABLA ORDENADA");
		for (int i = 0; i < tabla.length; i++) {
			System.out.println((i + 1) + " " + tabla[i]);
		}
	}

	public static void ordenarDecreciente(Integer[] tabla) {
		Integer t;
		for (int i = 0; i < tabla.length - 1; i++) {
			if (tabla[i].compareTo(tabla[i + 1]) == -1) {
				t = tabla[i + 1];
				tabla[i + 1] = tabla[i];
				tabla[i] = t;
				i = 0;

			}
			if(tabla[0].compareTo(tabla[1]) == -1) {
				t = tabla[i + 1];
				tabla[i + 1] = tabla[i];
				tabla[i] = t;
			}

		}

	}

}
