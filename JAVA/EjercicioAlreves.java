package unico;

public class EjercicioAlreves {

	static double[] num;

	public static void main(String[] args) {

		num = new double[5];

		pedirNumeros();

		mostrarNumeros();
	}

	private static void pedirNumeros() {
		for (int i = 0; i < num.length; i++) {
			num[i] = Util.leerLineaDouble("Introduzca un número " + (i + 1) + "/" + num.length + ": ");
		}
	}

	private static void mostrarNumeros() {
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.println("En la posición " + (i + 1) + " hay " + num[i]);
		}
	}
}
