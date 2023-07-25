package view;

import java.util.List;

import controller.GestionConcurso;
import model.Perro;
import model.Propietario;

public class Principal {

	public static void main(String[] args) {

		// Llamada al controlador
		GestionConcurso c = new GestionConcurso("1concurso", "Sevilla");

		// Creación de un banco de datos
		Propietario p1 = new Propietario("Pepe", "Gómez", 123L);
		Propietario p2 = new Propietario("Ana", "Díaz", 246L);

		Perro pr1 = new Perro("nombre1", "R1", p1);
		pr1.setPeso(10.0);
		pr1.setEdad(323);
		Perro pr2 = new Perro("nombre2", "R1", p1);
		pr2.setPeso(18.0);
		pr2.setEdad(234);
		Perro pr3 = new Perro("nombre3", "R2", p2);
		pr3.setPeso(3.0);
		pr3.setEdad(645);
		Perro pr4 = new Perro("nombre4", "R2", p2);
		pr4.setPeso(5.6);
		pr4.setEdad(945);
		Perro pr5 = new Perro("nombre5", "R3", p2);
		pr5.setPeso(12.3);
		pr5.setEdad(230);

		// añadir perros
		c.addDog("R1", pr1);
		c.addDog("R1", pr2);
		c.addDog("R2", pr3);
		c.addDog("R2", pr4);
		c.addDog("R3", pr5);
		
		
		// descalificar un perro
		c.disqualifyDog(pr5);

		
		// perros de un determinado propietario
		System.out.println();
		List<Perro> lst1 = c.ownerDogs(246L);
		if (lst1.size() == 0) {
			System.err.println("Ese socio no tiene perros concursando.");
		} else {
			lst1.stream().forEach(System.out::println);
		}

		
		// Perros de una raza ordenados por peso
		System.out.println();
		List<Perro> lst2 = c.perrosPorPeso("R1");
		if (lst2.size() == 0) {
			System.err.println("No hay perros de esa raza.");
		} else {
			lst2.stream().forEach(System.out::println);
		}

		// Perros de una raza ordenados por edad
		System.out.println();
		List<Perro> lst3 = c.perrosPorEdad("R1");
		if (lst3.size() == 0) {
			System.err.println("No hay perros de esa raza.");
		} else {
			lst3.stream().forEach(System.out::println);
		}

	}

}