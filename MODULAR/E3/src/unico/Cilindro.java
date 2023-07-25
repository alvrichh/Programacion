package unico;

//Implementar un método que calcule o el área o el volumen de un cilindro,
//según se especifique. Para distinguir un cálculo de otro se le pasará un número 1 (para área) o 2 
//(para volumen). Además, hemos de pasarle al método el radio de la base y la altura.
public class Cilindro {
	final static double PI = 3.1416;

	public static void main(String[] args) {
		// CONSTANTES
		final String AREA = "El área del cilindro será: ";
		final String VOLUMEN = "El volumen del cilindro será: ";
		final String ERROR = "Opción no válida, por favor seleccione otra opción ";

		// VARIABLES
		double radio;
		double altura;
		double r;
		int opcion;
		// Nombre del programa
		System.out.println(
				"========================================\n CÁLCULO DE PROPIEDADES DE UN CILINDRO\n========================================");
		// llamar al metodo de pedir tanto peso como altura
		radio = Util.leerLineaInt("Introduzca radio del cilindro: ");
		altura = Util.leerLineaInt("Introduzca altura del cilindro: ");
		// se repetirá la comprovación hasta que se ponga
		do {
			opcion = Util.leerInt("Selecciona una opción: \n[1 - calcular  área]\n[2 - Calcular volumen]");
			// Según la opción escogida hará una cosa u otra:
			if (opcion == 1) {
				r = area(radio, altura);
				System.out.println(AREA + r);
				break;
			} else if (opcion == 2) {
				r = volumen(radio, altura);
				System.out.println(VOLUMEN + r);
				break;
			} else {
				System.out.println(ERROR);
			}
		} while (opcion != 1 && opcion != 2);
	}

	static double volumen(double r, double h) {
		double res;
		res = PI * (r * r) * h;
		return res;
	}

	static double area(double r, double h) {
		double res;
		res = 2 * PI * r * (h + r);
		return res;
	}
}
