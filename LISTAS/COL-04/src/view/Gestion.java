package view;

import java.util.stream.Collectors;

import controller.Instituto;
import model.Alumno;

public class Gestion {

	private static Instituto insti = new Instituto();

	public Gestion() {
		insti.leerFchAlumnado();
	}

	public static void salir() {
		insti.escribirFchAlumnado();
		Util.escribir("\nFin del programa.");
	}

	public static void insertarAlumno() {
		String curso;
		String dni;
		String nombre;
		String apellidos;
		String direccion;
		String email;
		Boolean dual;

		Util.escribir("\nInsertar nuevo alumno:");
		curso = Util.leerString("Curso     : ");
		dni = Util.leerString("DNI       : ");
		nombre = Util.leerString("Nombre    : ");
		apellidos = Util.leerString("Apellidos : ");
		direccion = Util.leerString("Dirección : ");
		email = Util.leerString("eMail     : ");
		dual = Util.leerString("Dual (S/N): ").equalsIgnoreCase("S");

		Alumno a = new Alumno(dni, nombre, apellidos, curso);
		a.setDireccion(direccion);
		a.setEmail(email);
		a.setDual(dual);

		if (insti.insertar_alumno(a)) {
			Util.escribir("Inserción correcta!");
		} else {
			Util.escribirError("No se ha podido insertar el alumno !");
		}

	}

	public static void borrarAlumno() {
		String dni;

		Util.escribir("\nBorrar un alumno:");
		insti.mostrar_alumnos().stream().map(Alumno::getDNI).forEach(System.out::println);
		dni = Util.leerString("Indique un DNI: ");

		if (insti.borrar_alumno(dni)) {
			Util.escribir("Borrado correcto!");
		} else {
			Util.escribirError("No se ha podido borrar el alumno !");
		}
	}

	public static void mostrarAlumnos() {
		System.out.println("\nMostrar todos los alumnos:");
		insti.mostrar_alumnos().stream().forEach(System.out::println);
	}

	public static void mostrarAlumnosUnCurso() {
		String curso;

		System.out.println("\nMostrar los alumnos de un curso:");
		insti.mostrar_alumnos().stream().map(Alumno::getCurso).sorted().collect(Collectors.toSet()).forEach(System.out::println);
		curso = Util.leerString("Indique un Curso: ");
		insti.mostrar_alumnos_de_un_curso(curso).stream().forEach(System.out::println);
	}

	public static void modificarAlumno() {
		String curso;
		String dni;
		String nombre;
		String apellidos;
		String direccion;
		String email;
		Boolean dual;

		Util.escribir("\nModificar alumno:");
		insti.mostrar_alumnos().stream().map(Alumno::getDNI).forEach(System.out::println);
		dni = Util.leerString("Indique un DNI: ");

		Alumno alu = insti.mostrar_alumnos().stream().filter(a -> a.getDNI().equalsIgnoreCase(dni)).findFirst().orElse(null);
		if (alu == null) {
			Util.escribirError("No existe alumno con ese DNI.");
		} else {
			curso = Util.leer("Curso", alu.getCurso());
			nombre = Util.leer("Nombre", alu.getNombre());
			apellidos = Util.leer("Apellidos", alu.getApellidos());
			direccion = Util.leer("Dirección", alu.getDireccion());
			email = Util.leer("eMail", alu.getEmail());
			dual = Util.leer("Dual (S/N)", alu.getDual() ? "S" : "N").equalsIgnoreCase("S");

			alu.setCurso(curso);
			alu.setNombre(nombre);
			alu.setApellidos(apellidos);
			alu.setDireccion(direccion);
			alu.setEmail(email);
			alu.setDual(dual);

			if (insti.modificar_alumno(alu)) {
				Util.escribir("Modificación correcta!");
			} else {
				Util.escribirError("No se ha podido modificar el alumno !");
			}

		}

	}

}