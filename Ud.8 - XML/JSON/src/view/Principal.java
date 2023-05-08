package view;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import controller.Data_JSON;
import model.bco.CuentaCorriente;
import model.pc.Torre;
import model.post.Post;

public class Principal {

	public static void main(String[] args) throws Exception {
//		ejemplo1();
//		ejemplo2();
		ejemplo3();
		
		System.out.println("\nFin del programa.");
	}

	private static void ejemplo1() {
		final String FILE_NAME = "torre.json";

		Data_JSON json = new Data_JSON();

		// Crear un objeto Torre y mostrarlo en formato Json
		System.out.println("\nCrear un objeto Torre y mostrarlo en formato Json:");
		Torre t1 = new Torre(16, 250, "Intel");
		System.out.println(json.printJson(t1));

		// Escribir ese objeto Torre en un fichero
		System.out.println("\nEscribir ese objeto Torre en el fichero: " + FILE_NAME);
		json.writeJsonInFile(FILE_NAME, t1);

		// Leer un objeto Torre de un fichero que contiene un objeto Torre
		System.out.println("\nLeer un objeto Torre del fichero: " + FILE_NAME +  " y mostrarlo por pantalla.");
		Torre t2 = json.leerTorre(FILE_NAME);
		System.out.println(json.printJson(t2));

	}

	private static void ejemplo2() {
		final String FILE_NAME = "cuentas.json";

		Data_JSON json = new Data_JSON();

		// Mostrar un Array de 10 objetos CuentCorriente, sólo se añade una en la posición 2
		System.out.println("\nMostrar un Array de 10 objetos CuentaCorriente, sólo se añade una en la posición 2.");
		CuentaCorriente[] cuentas = new CuentaCorriente[10];
		cuentas[2] = new CuentaCorriente();
		System.out.println(json.printJson(cuentas));

		// Escribir ese Array de 10 objetos CuentaCorriente en un fichero
		System.out.println("\nEscribir ese Array de 10 objetos CuentaCorriente en el fichero: " + FILE_NAME);
		json.writeJsonInFile(FILE_NAME, cuentas);

		// Leer un Array de objetos CuentaCorriente del fichero y mostrarlo por pantalla
		System.out.println("\nLeer un Array de objetos CuentaCorriente del fichero: " + FILE_NAME + " y mostrarlo por pantalla.");
		CuentaCorriente[] cuentas2 = json.leerArrayCuentas(FILE_NAME);
		System.out.println(json.printJson(cuentas2));

	}

	private static void ejemplo3() {
		final String FILE_NAME = "post.json";
		final String MY_URL = "http://jsonplaceholder.typicode.com/posts/";

		Data_JSON json = new Data_JSON();

		try {
			// Mostrar todos los caracteres leídos de una URL
			System.out.println("\nMostrar todos los caracteres leídos de la URL: " + MY_URL);
			String datosLeidos = json.peticionHttpGet(MY_URL);
			System.out.println(datosLeidos);
			
			// Obtener un Array de objetos Post datos de la URL y convertimos ese Array en un List
			Post[] myArray = json.getPosts(MY_URL);
			List<Post> lst = Arrays.asList(myArray);
			
			// Mostrar todos los Posts almacenados en el List
			System.out.println("\nMostrar todos los Posts almacenados en el List:");
			lst.stream().forEach(System.out::println);
			
			// Escribir ese List de objetos Post en un fichero
			System.out.println("\nEscribir ese List 10 objetos Post en el fichero: " + FILE_NAME);
			json.writeJsonInFile(FILE_NAME, lst);
			
		} catch (IOException e) {
			System.err.println("Fallo accediendo a la URL. \n" + e.getMessage());
		}
	}

}