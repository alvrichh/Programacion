package start;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<String> coches = new ArrayList<String>();

		coches.add("Megane");
		coches.add("BMW");
		coches.add("Dacia");
		coches.add("Audi");

		System.out.println(coches);
		System.out.println(coches.get(1));
		coches.set(1, "Peugeot");

		System.out.println(coches.get(1));
		// coches.clear();
		System.out.println(coches);
		System.out.println(coches.size());
		for (int i = 0; i < coches.size(); i++) {
			System.out.println(coches.get(i));
		}

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(2);
		numeros.add(2);
		numeros.set(numeros.size() - 1, 5);
		System.out.println(numeros);

		ArrayList<Double> doubles = new ArrayList<Double>();
		doubles.add(2.3);
		doubles.add(8.2);
		doubles.clear();
		System.out.println(doubles);
		
		ArrayList<Integer> listaNums = new ArrayList<>();
		
		for (int i = 1; i <= 100; i++) {
			listaNums.add(i);
		}
		System.out.println(listaNums);
	}

}
