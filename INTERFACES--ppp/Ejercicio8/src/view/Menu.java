package view;

import java.util.Scanner;

import controller.Catalogo;
import model.Libro;
import model.Pelicula;
import model.Serie;

public class Menu {
	static Scanner entrada = new Scanner(System.in);
	static Catalogo c = new Catalogo();

	public static void inicio() {

		do {
			int opc;
			System.out.println("********************************");
			System.out.println("               Menú    ");
			System.out.println("********************************");
			System.out.println("1. Añadir elemento multimedia");
			System.out.println("2. Eliminar elemento multimedia");
			System.out.println("3. Listar multimedia");
			System.out.println("********************************");
			opc = Integer.parseInt(entrada.nextLine());
			switch (opc) {
			case 1:
				opc1();
				break;
			case 2:
				opc2();
				break;
			case 3:
				opc3();
				break;
			}
		} while (salir());
		System.out.println("Adioooos");
	}

	public static boolean opc1() {
		System.out.println("Que elemento quieres añadir?\n1. Pelicula\n2. Serie\n3. Libro");
		int opc = Integer.parseInt(entrada.nextLine());
		switch (opc) {
		case 1:
			if (c.addMultimedia(new Pelicula()))
				System.out.println("Añadido correctamente");

			break;
		case 2:
			if (c.addMultimedia(new Serie()))
				System.out.println("Añadido correctamente");

			break;
		case 3:
			if (c.addMultimedia(new Libro()))
				System.out.println("Añadido correctamente");

			break;
		}
		return true;
	}

	public static boolean opc2() {
		System.out.println("Introduce el nombre de la Pelicula, Serie o Libro a eliminar");
		String opc = entrada.nextLine();
		for (int i = 0; i < c.getElementos().length; i++) {
			if (c.getElementos()[i].getTitulo().equals(opc) && c.getElementos()[i] != null) {
				c.getElementos()[i] = null;
				break;
			}else {
				System.out.println("No se encuentra ese titulo");
				break;
			}
		}
		return true;

	}

	public static boolean opc3() {
		boolean tiene = false;
		for (int i = 0; i < c.getElementos().length; i++) {
			if(c.getElementos()[i] != null) {
				tiene = true;
			}
		}
		for (int i = 0; i < c.getElementos().length; i++) {
			if(c.getElementos()[i] != null) {
				System.out.println(c.getElementos()[i]);
			}
		}
		if(!tiene) System.out.println("NO HAY ELEMENTOS MULTIMEDIA");
		return true;

	}

	public static boolean salir() {
		boolean r = false;
		System.out.println("\nDeseas volver al menu anterior");
		System.out.println("1. Si\n2. No");
		int opc = Integer.parseInt(entrada.nextLine());
		if (opc == 1)
			r = true;
		return r;
	}
}
