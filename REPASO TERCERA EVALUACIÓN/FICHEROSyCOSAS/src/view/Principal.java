package view;

import model.EdadNoValidaExcepcion;
import model.Persona;

public class Principal {

	public static void main(String[] args) throws EdadNoValidaExcepcion {
		
		String n = Util.leerString("¿Cómo se llama?");
		Integer e = Util.leerInt("¿Qué edad tiene?");
		Double p = Util.leerDouble("¿Cuánto pesa?");
		try {
			new Persona (n, e, p);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
