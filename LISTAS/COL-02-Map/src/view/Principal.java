package view;

import java.util.List;

import controller.InstitutoMap;
import controller.InstitutoMapNormal;
import controller.InstitutoMapStream;
import model.Alumno;
import model.Unidad;

public class Principal {

//static InstitutoMap insti = new InstitutoMapNormal("ALIXAR");
static InstitutoMap insti = new InstitutoMapStream("ALIXAR");

	public static void main(String[] args) {

		boolean leerDelFichero = false;
		if (leerDelFichero) {
			insti.cargarAlumnos();
		} else {
			generarDatos();
			insti.guardarAlumnos();
		}
		
		System.out.println("GESTION DEL INSTITUTO: " + insti.getNombre());
		
//		gestionNormal();
		gestionStream();
	}

	private static void gestionNormal() {
		System.out.println("\nListado ordenado de todos los alumnos del Instituto:");
		List<Alumno> todos = insti.obtenerTodosAlumnosOrdenados();
		for (Alumno a : todos) {
			System.out.println(a);
		}

		System.out.println("\nObtener la Unidad en la que está un alumno por Id:");
		int id = 5;
		Unidad u = insti.obtenerUnidadAlumno(id);
		System.out.print("El alumno " + id + " ");
		if (u == null) {
			System.out.println("no está matriculado.");
		} else {
			System.out.println("está matriculado en " + u.getUnidad());
		}

		System.out.println("\nAlumnos matriculados en una Unidad.");
		List<Alumno> aux = insti.obtenerAlumnosUnidad("2ºB");
		for (Alumno a : aux) {
			System.out.println(a);
		}

	}

	private static void gestionStream() {
		System.out.println("\nListado ordenado de todos los alumnos del Instituto:");
		insti.obtenerTodosAlumnosOrdenados().stream().forEach(System.out::println);

		System.out.println("\nObtener la Unidad en la que está un alumno por Id:");
		int id = 5;
		Unidad u = insti.obtenerUnidadAlumno(id);
		System.out.print("El alumno " + id + " ");
		if (u == null) {
			System.out.println("no está matriculado.");
		} else {
			System.out.println("está matriculado en " + u.getUnidad());
		}

		System.out.println("\nAlumnos matriculados en una Unidad.");
		insti.obtenerAlumnosUnidad("2ºB").stream().forEach(System.out::println);

	}

	private static void generarDatos() {
		Alumno a01 = new Alumno("Carlos", "García", "123");
		Alumno a02 = new Alumno("Ana", "Torres", "234");
		Alumno a03 = new Alumno("Marcos", "Olmo", "345");
		Alumno a04 = new Alumno("Margarita", "Suárez", "456");
		Alumno a05 = new Alumno("Luís", "Campos", "567");
		Alumno a06 = new Alumno("Manuel", "Fernández", "678");
		Alumno a07 = new Alumno("Antonio", "González", "789");

		Unidad u1 = new Unidad(1, "A");
		Unidad u2 = new Unidad(2, "B");

		insti.addUnidad(u1);
		insti.addUnidad(u2);

		insti.addAlumnoUnidad("1ºA", a01);
		insti.addAlumnoUnidad("1ºA", a02);
		insti.addAlumnoUnidad("1ºA", a03);
		insti.addAlumnoUnidad("1ºA", a04);

		insti.addAlumnoUnidad("2ºB", a05);
		insti.addAlumnoUnidad("2ºB", a06);
		insti.addAlumnoUnidad("2ºB", a07);
	}

}