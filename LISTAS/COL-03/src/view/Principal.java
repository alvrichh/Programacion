package view;

import java.util.List;
import java.util.Random;
import java.util.Set;

import controller.Exchange;
import controller.ExchangeNormal;
import controller.ExchangeStream;
import model.Criptomoneda;
import model.Divisa;
import model.Fiat;
import model.ParCotizacion;

public class Principal {

	private static Exchange cotizaciones = new ExchangeNormal();
//	private static Exchange cotizaciones = new ExchangeStream();

	public static void main(String[] args) {

		boolean leerDelFichero = false;
		if (leerDelFichero) {
			cotizaciones.cargarFchCotizaciones();
		} else {
			generarDatos();
			cotizaciones.guardarFchCotizaciones();
		}

		gestionNormal();
//		gestionStream();
	}

	private static void gestionNormal() {
		System.out.println("\nMostrar todo el Exchange:");
		Set<ParCotizacion> ex = cotizaciones.getExchange();
		for (ParCotizacion par : ex) {
			System.out.println(par);
		}
		
		System.out.println("\nMostrar todas las divisas ordenadas por su símbolo:");
		List<Divisa> divisas = cotizaciones.mostrarDivisasOrdenadas();
		for (Divisa a : divisas) {
			System.out.println(a);
		}

		String simbolo = "EUR";
		System.out.println("\nPares de cotización asociados con la divisa: " + simbolo);
		Set<ParCotizacion> paresAsociados = cotizaciones.obtenerCotizaciones(simbolo);
		for (ParCotizacion par : paresAsociados) {
			System.out.println(par);
		}

		System.out.println("\nPares de cotización en los que la divisa base tiene una cotización superior a 0.");
		Set<ParCotizacion> paresCot0 = cotizaciones.mostrarCotizacionesAlAlzaUnaHora();
		for (ParCotizacion par : paresCot0) {
			System.out.println(par);
		}

	}

	private static void gestionStream() {
		System.out.println("\nMostrar todo el Exchange:");
		cotizaciones.getExchange().stream().forEach(System.out::println);
		
		System.out.println("\nMostrar todas las divisas ordenadas por símbolo:");
		cotizaciones.mostrarDivisasOrdenadas().stream().forEach(System.out::println);

		String simbolo = "BTC";
		System.out.println("\nPares de cotización asociados con la divisa: " + simbolo);
		cotizaciones.obtenerCotizaciones(simbolo).stream().forEach(System.out::println);

		System.out.println("\nPares de cotización en los que la divisa base tiene una cotización superior a 0.");
		cotizaciones.mostrarCotizacionesAlAlzaUnaHora().stream().forEach(System.out::println);
	}

	private static void generarDatos() {

		Criptomoneda d1 = new Criptomoneda("Bitcoin", "BTC");
		d1.setPrecioUSD(11.0);
		d1.setVolumen24(111L);
		d1.setRanking(2);
		Criptomoneda d2 = new Criptomoneda("Ethereum", "ETH");
		d2.setPrecioUSD(22.0);
		d2.setVolumen24(222L);
		d2.setRanking(4);
		Criptomoneda d3 = new Criptomoneda("Cardano", "ADA");
		d3.setPrecioUSD(33.0);
		d3.setVolumen24(333L);
		d3.setRanking(6);

		Fiat d4 = new Fiat("Euro", "EUR");
		d4.setPais("Europa");
		Fiat d5 = new Fiat("Dólar", "USD");
		d5.setPais("Estados Unidos");
		Fiat d6 = new Fiat("Yuán", "CNY");
		d6.setPais("China");

		ParCotizacion par01 = new ParCotizacion(d1, d2);
		par01.setPrecio(getRandomPrecio());
		par01.setVariacion(getRandomVariacion());

		ParCotizacion par02 = new ParCotizacion(d1, d3);
		par02.setPrecio(getRandomPrecio());
		par02.setVariacion(getRandomVariacion());

		ParCotizacion par03 = new ParCotizacion(d1, d4);
		par03.setPrecio(getRandomPrecio());
		par03.setVariacion(getRandomVariacion());

		ParCotizacion par04 = new ParCotizacion(d1, d5);
		par04.setPrecio(getRandomPrecio());
		par04.setVariacion(getRandomVariacion());

		ParCotizacion par05 = new ParCotizacion(d1, d6);
		par05.setPrecio(getRandomPrecio());
		par05.setVariacion(getRandomVariacion());

		ParCotizacion par06 = new ParCotizacion(d2, d3);
		par06.setPrecio(getRandomPrecio());
		par06.setVariacion(getRandomVariacion());

		ParCotizacion par07 = new ParCotizacion(d2, d4);
		par07.setPrecio(getRandomPrecio());
		par07.setVariacion(getRandomVariacion());

		ParCotizacion par08 = new ParCotizacion(d2, d5);
		par08.setPrecio(getRandomPrecio());
		par08.setVariacion(getRandomVariacion());

		ParCotizacion par09 = new ParCotizacion(d2, d6);
		par09.setPrecio(getRandomPrecio());
		par09.setVariacion(getRandomVariacion());

		ParCotizacion par10 = new ParCotizacion(d3, d4);
		par10.setPrecio(getRandomPrecio());
		par10.setVariacion(getRandomVariacion());

		ParCotizacion par11 = new ParCotizacion(d3, d5);
		par11.setPrecio(getRandomPrecio());
		par11.setVariacion(getRandomVariacion());

		ParCotizacion par12 = new ParCotizacion(d3, d6);
		par12.setPrecio(getRandomPrecio());
		par12.setVariacion(getRandomVariacion());

		ParCotizacion par13 = new ParCotizacion(d4, d5);
		par13.setPrecio(getRandomPrecio());
		par13.setVariacion(getRandomVariacion());

		ParCotizacion par14 = new ParCotizacion(d4, d6);
		par14.setPrecio(getRandomPrecio());
		par14.setVariacion(getRandomVariacion());

		ParCotizacion par15 = new ParCotizacion(d5, d6);
		par15.setPrecio(getRandomPrecio());
		par15.setVariacion(getRandomVariacion());

		cotizaciones.addCotizacion(par01);
		cotizaciones.addCotizacion(par02);
		cotizaciones.addCotizacion(par03);
		cotizaciones.addCotizacion(par04);
		cotizaciones.addCotizacion(par05);
		cotizaciones.addCotizacion(par06);
		cotizaciones.addCotizacion(par07);
		cotizaciones.addCotizacion(par08);
		cotizaciones.addCotizacion(par09);
		cotizaciones.addCotizacion(par10);
		cotizaciones.addCotizacion(par11);
		cotizaciones.addCotizacion(par12);
		cotizaciones.addCotizacion(par13);
		cotizaciones.addCotizacion(par14);
		cotizaciones.addCotizacion(par15);

	}

	private static double getRandomVariacion() {
		return Math.random() * (new Random().nextBoolean() ? +1 : -1);
	}
	
	private static double getRandomPrecio() {
		return Math.random() * 10;
	}


}