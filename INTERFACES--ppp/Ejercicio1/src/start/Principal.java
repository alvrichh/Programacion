package start;

import java.util.Arrays;

import model.Cliente;
import model.ComparacionEdad;
import model.ComparacionEdadSueldo;
import model.ComparacionNombre;

public class Principal {

	public static void main(String[] args) {
		Cliente[] c = new Cliente[5];
		c[0] = new Cliente("47265430Q", "Pablo", 25, 1200);
		c[1] = new Cliente("27543829J", "Jorge", 25, 1400);
		c[2] = new Cliente("28399423K", "Pepe", 20, 12678);
		c[3] = new Cliente("21234241P", "Paula", 13, 900);
		c[4] = new Cliente("12292992J", "Luis", 59, 1800);

		System.out.println("Sin ordenar");
		for (int i = 0; i < c.length; i++) {
			System.out.println("Index: " + i + " " + c[i]);
		}

		System.out.println("Ordenados por defecto (Dni)");
		Arrays.sort(c);
		for (int i = 0; i < c.length; i++) {
			System.out.println("Index: " + i + " " + c[i]);
		}

		System.out.println("Ordenados por el nombre.");
		Arrays.sort(c, new ComparacionNombre());
		for (int i = 0; i < c.length; i++) {
			System.out.println("Index: " + i + " " + c[i]);
		}

		System.out.println("Ordenados por la edad.");
		Arrays.sort(c, new ComparacionEdad());
		for (int i = 0; i < c.length; i++) {
			System.out.println("Index: " + i + " " + c[i]);
		}
		
		System.out.println("Ordenados por edad y luego sueldo");
		Arrays.sort(c, new ComparacionEdadSueldo());
		for (int i = 0; i < c.length; i++) {
			System.out.println("Index: " + i + " " + c[i]);
		}
	}

}
