package view;

import controller.Garaje;
import model.Avioneta;
import model.Coche;
import model.Helicoptero;
import model.Motocicleta;

public class Principal {
	static Garaje g = new Garaje(6);

	public static void main(String[] args) {
		menu();

//
//		// Crear un garaje con espacio para 6 vehículos.
//		Garaje g = new Garaje(6);
//
//		// Añadir al garaje 2 coches, 2 motos, 1 helicóptero con 9 personas y 1
//		// avioneta. Con datos inventados.
//		g.addVehiculo(new Coche("El furioso", "2215HJX", "2020", Color.AZUL));
//		g.addVehiculo(new Coche("El rapido", "2332PJD", "2010", Color.AMARILLO));
//		g.addVehiculo(new Motocicleta("Moto loca", "2828POK", "1999", Color.AMARILLO));
//		g.addVehiculo(new Motocicleta("Motocleto", "2215HJX", "2000", Color.VERDE));
//		g.addVehiculo(new Helicoptero("El Rapidin", 9));
//
//		// Añadir personas con For
//		for (int i = 0; i < 10; i++) {
//			g.getVehiculos()[4].addPerson();
//		}
//
//		// Añadir personas directamente
//		g.getVehiculos()[4].setnPersonasActual(9);
//		g.addVehiculo(new Avioneta("Avioneta de droga", 9));
//
//		// Mostrar el contenido del garaje.
//		System.out.println(g);
//
//		// Mostrar el contenido del helicóptero.
//		System.out.println(g.getVehiculos()[4]);
//
//		// Eliminar vehiculo
//		g.delVehiculo(new Coche("El furioso", "2215HJX", "2020", Color.AZUL));
//		System.out.println(g);
//		

	}

	public static void menu() {
		System.out.println("*******************");
		System.out.println("  Menu del garaje");
		System.out.println("*******************");
		System.out.println("1. Añadir vehiculo");
		System.out.println("2. Eliminar vehiculo");
		System.out.println("3. Listar vehiculos");
		System.out.println("*******************");
		int opc = 1;
		switch (opc) {
		case 1:
			opcion1();
			break;
		case 2:
			opcion2();
			break;
		case 3:
			opcion3();
			break;
		default:
			System.out.println("mal");

		}
	}

	public static boolean opcion1() {
		boolean resultado = false;
		System.out.println("Que vehiculo quieres añadir?\n1. Coche\n2. Moto\n3. Avioneta\n4. Helicoptero");
		System.out.println("*******************");

		int opc = 1;
		boolean hecho = false;
		switch (opc) {
		case 1:
			g.addVehiculo(new Coche());
			hecho = true;
			break;
		case 2:
			g.addVehiculo(new Motocicleta());
			hecho = true;
			break;
		case 3:
			g.addVehiculo(new Avioneta());
			hecho = true;
			break;
		case 4:
			g.addVehiculo(new Helicoptero());
			hecho = true;
			break;
		}

		return resultado;
	}

	public static boolean opcion2() {
		boolean resultado = false;

		return resultado;
	}

	public static boolean opcion3() {
		boolean resultado = false;
		for (int i = 0; i < g.getVehiculos().length; i++) {
			if (g.getVehiculos()[i] != null) {
				resultado = true;
			}
		}
		if (resultado) {
			for (int i = 0; i < g.getVehiculos().length; i++) {
				if (g.getVehiculos()[i] != null)
					System.out.println((i + 1) + " " + g.getVehiculos()[i]);

			}
		} else {
			System.out.println("NO HAY VEHICULOS");
		}

		return resultado;
	}
}
