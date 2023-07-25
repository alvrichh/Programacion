package start;

import java.util.Date;

class Partida {

	private static int partidaId = 0;

	public Partida() {
		partidaId++;
		switch (partidaId) {
		case 1:
			GestionVideojuego.hora = new Date();
			GestionVideojuego.personaje = new Personaje();
			GestionVideojuego.escenario = new Escenario();
			break;
		case 2:
			GestionVideojuego.hora = new Date();
			GestionVideojuego.personaje = new Personaje(TipoPersonaje.KNUCKLES);
			GestionVideojuego.escenario = new Escenario(5);
			for (int i = 0; i < 4; i++) {
				GestionVideojuego.escenario.generarEnemigo(null);
			}
			break;
		}

	}

	public void estadoPartida() {
		System.out.println("La fecha de inicio del juegos es:\n" + GestionVideojuego.hora);
		System.out.println("\n" + GestionVideojuego.personaje.infoPersonaje());

		System.out.println("\n" + GestionVideojuego.escenario.infoEscenario());
	}

}

public class GestionVideojuego {

	static Date hora;
	static Personaje personaje;
	static Escenario escenario;
	static Partida[] partida;

	public static void iniciarPartida() {
		for (int i = 0; i < partida.length; i++) {
			if(partida[i] == null) partida[i] = new Partida();
		}
	}



	public static Partida[] getPartida() {
		return partida;
	}



	public static void setPartida(Partida[] partida) {
		GestionVideojuego.partida = partida;
	}



	public static void estadoVideojuego() {
		System.out.println("La fecha de inicio del juegos es:\n" + hora);
		System.out.println("\n" + personaje.infoPersonaje());

		System.out.println("\n" + escenario.infoEscenario());
	}

}
