package view;

import controller.Garaje;
import model.Coche;
import model.Vehiculo;

public class Principal {
	
	static Garaje g;

	public static void main(String[] args) {
		gestionBasica();

	}
	private static void gestionBasica() {
		g = new Garaje(6);
		g.anadirVehiculo(new Coche());
		g.anadirVehiculo(new Coche());
		g.anadirVehiculo(new Motocicleta());
		g.anadirVehiculo(new Motocicleta());
		
		Helicoptero h = new Helicoptero("Libelula negra", 10, 1000, "ESPAÑA")
		for (int i = 1; i <= 9; i++) {
			h.anadirPersona();	
		}
		g.anadirVehiculo(h);
		g.anadirVehiculo(new Avioneta());
		
		Vehiculo[] v = g.verVehiculos();
		for (int i = 1; i < v.length; i++) {
			System.out.println(v[i]);
	}
}
	
	
	
}
