package unico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrincipalConSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<String> nombre = new TreeSet<String>();
		//Set<String> nombre = new HashSet<String>();
		 List<String> nombre = new ArrayList<String>();

		nombre.add("Ale");
		System.out.println("Hay " + nombre.size() + " nombres.");

		nombre.add("Pepe");
		System.out.println("Hay " + nombre.size() + " nombres.");

		nombre.add("Juan");
		System.out.println("Hay " + nombre.size() + " nombres.");

		nombre.add("Ana");
		System.out.println("Hay " + nombre.size() + " nombres.");
		nombre.add("Ana");
		System.out.println("Hay " + nombre.size() + " nombres.");
		nombre.add("Ana");
		System.out.println("Hay " + nombre.size() + " nombres.");

		for (String n : nombre) {
			System.out.println(n);

		}
		
		System.out.println("Ordenación A->Z");
		Collections.sort(nombre);
		for(String n: nombre) {
			System.out.println(n);
		}
		System.out.println("Ordenación Z->A");
		Collections.sort(nombre,Collections.reverseOrder());
		for(String n: nombre) {
			System.out.println(n);
		}

	}

}