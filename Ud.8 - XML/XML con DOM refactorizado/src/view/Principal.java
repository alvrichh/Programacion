package view;

import java.util.List;

import controller.XML_DOM;
import model.Arbitro;
import model.Jugador;

public class Principal {

	public static void main(String[] args) {
		
		final String FILE_NAME = "campeonato.xml";

		try {
			XML_DOM gest = new XML_DOM(FILE_NAME);

			System.out.println("\nCONTENIDO ACTUAL: JUGADORES");
			List<Jugador> lstJugadores = gest.getJugadores();
			lstJugadores.stream().forEach(System.out::println);
			System.out.println("\nCONTENIDO ACTUAL: ARBITROS");
			List<Arbitro> lstArbitros = gest.getArbitros();
			lstArbitros.stream().forEach(System.out::println);
			
			System.out.println("\nAÑADIR NUEVO JUGADOR");
			gest.addJugador(new Jugador(123, "Miguel Angel", "Cifredo Campos", "ElProfe", 1200));
			lstJugadores = gest.getJugadores();
			lstJugadores.stream().forEach(System.out::println);
			
			System.out.println("\nBORRAR UN JUGADOR");
			gest.delJugador(593);
			lstJugadores = gest.getJugadores();
			lstJugadores.stream().forEach(System.out::println);
			
//			gest.writeXML(FILE_NAME);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}