package start;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import model.Electrodomestico;
import model.Electrodomestico.Color;
import model.Electrodomestico.ConsumoEnergetico;
import model.Lavadora;
import model.Television;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Lavadora l = new Lavadora(300,50,31); Television t = new Television(1560,
		 * true, 300, Color.NEGRO, ConsumoEnergetico.F, 50);
		 * 
		 * System.out.println(l); System.out.println(t);
		 */

		// Crea un array de Electrodomesticos de 10 posiciones.
		Electrodomestico[] electrodomestico = new Electrodomestico[10];
		// Asigna a cada posición un objeto de las clases anteriores con los valores que
		// desees.
		for (int i = 0; i < electrodomestico.length; i++) {
			if ((int) (Math.random() * 2 + 1) == 1) {
				electrodomestico[i] = new Lavadora((int) (Math.random() * 1000 + 1),
						Color.values()[new Random().nextInt(Color.values().length)],
						ConsumoEnergetico.values()[new Random().nextInt(ConsumoEnergetico.values().length)],
						(int) (Math.random() * 90 + 1));
			} else {
				electrodomestico[i] = new Television((int) (Math.random() * 100 + 1), (Math.random() < 0.5),
						(int) (Math.random() * 1000 + 1), Color.values()[new Random().nextInt(Color.values().length)],
						ConsumoEnergetico.values()[new Random().nextInt(ConsumoEnergetico.values().length)],
						(int) (Math.random() * 90 + 1));
			}

		}
		// Deberás mostrar el contenido del array. (Fíjate sobre todo en que el precio
		// que muestra es el correspondiente a la clase correcta).

		for (int i = 0; i < electrodomestico.length; i++) {
			System.out.println(i + 1 + " " + electrodomestico[i]);
		}

		// Crea después un array de objetos Lavadora, y ordena el array con la
		// ordenación por defecto de objetos Lavadora.
		System.out.println("----------------------------------------------");
		Lavadora[] lavadora = new Lavadora[10];

		for (int i = 0; i < lavadora.length; i++) {
			lavadora[i] = new Lavadora((int) (Math.random() * 1000 + 1),
					Color.values()[new Random().nextInt(Color.values().length)],
					ConsumoEnergetico.values()[new Random().nextInt(ConsumoEnergetico.values().length)],
					(int) (Math.random() * 90 + 1));
		}
		for (int i = 0; i < lavadora.length; i++) {
			System.out.println(i + 1 + " " + lavadora[i]);
		}
		// Ordenamos
		System.out.println("Ordenados por precio base");
		for (int i = 0; i < lavadora.length - 1; i++) {
			Lavadora temporal;
			if (lavadora[i].compareTo(lavadora[i + 1]) == 1) {
				temporal = lavadora[i + 1];
				lavadora[i + 1] = lavadora[i];
				lavadora[i] = temporal;
				i = 0;
			}

		}

		// Mostramos array
		for (int i = 0; i < lavadora.length; i++) {
			System.out.println(i + 1 + " " + lavadora[i]);
		}

		Lavadora l1 = new Lavadora();
		Lavadora l2 = new Lavadora();

		System.out.println(l1.equals(l2));
		
		
		Television[] t1 = new Television[10];
		for (int i = 0; i < t1.length; i++) {
			t1[i] = new Television();
		}
		
		Arrays.sort(t1);
		for (int i = 0; i < t1.length; i++) {
			System.out.println(t1[i]);
		}
		
	}

}
