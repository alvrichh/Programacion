package view;

import java.util.Map;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		
		conUnMapa();
		
	}
	
	private static void conUnMapa() {
		
	}
	
	private static void conDosMapas() {
		final String promoCodigo = "ECODTO";
		final Double promoDrto = 10.0;
		
		Map<String, Double> precios = new TreeMap<String, Double>();
		precios.put("Tomate", 1.59);
		precios.put("Quinoa", 4.50);
		precios.put("Avena", 2.21);
		
		Map<String, Integer> cantidades = new TreeMap<String, Integer>();
		cantidades.put("Tomate", 0);
		cantidades.put("Quinoa", 0);
		cantidades.put("Avena", 0);
		
		
	}

}
