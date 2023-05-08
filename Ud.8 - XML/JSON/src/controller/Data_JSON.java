package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.bco.CuentaCorriente;
import model.pc.Torre;
import model.post.Post;

public class Data_JSON {

	private Gson g = new GsonBuilder().setPrettyPrinting().create();
	
	/**
	 * Obtiene un Array de objetos Post a partir del String retornado por una petición HTTP
	 */
	public Post[] getPosts(String myURL) throws MalformedURLException, IOException {
		String jsonString = peticionHttpGet(myURL);
		Post[] listado = g.fromJson(jsonString, Post[].class);
		return listado;
	}
	
	/**
	 * Obtiene un String como respuesta de una petición HTTP usando el método GET
	 */
	public String peticionHttpGet(String myURL) throws MalformedURLException, IOException {
		StringBuilder resultado = new StringBuilder();
		
		// Crear un objeto de tipo URL y abrimos la conexión
		URL url = new URL(myURL);
		HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
			String linea;
			while ((linea = bufferedReader.readLine()) != null) {
				resultado.append(linea);
			}
		}
		catch (IOException e) { System.err.println(e.getMessage()); }
		finally {
			try { if (bufferedReader != null) bufferedReader.close();   }
			catch (IOException e) { System.err.println(e.getMessage()); }
		}

		// Devolver resultado, pero como String, no como StringBuilder
		return resultado.toString();
	}
	
	/**
	 * Convertir en un Styring un objeto del tipo T
	 */
	public <T> String printJson(T obj) {
		return g.toJson(obj).toString();
	}

	/**
	 * Escribir en un fichero un objeto del tipo T
	 */
	public <T> void writeJsonInFile(String fileName, T obj) {
		BufferedWriter bufferedWriter = null;
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(fileName));
			bufferedWriter.write(g.toJson(obj));
		}
		catch (IOException e) { System.err.println(e.getMessage()); }
		finally {
			try { if (bufferedWriter != null) bufferedWriter.close();   }
			catch (IOException e) { System.err.println(e.getMessage()); }
		}
	}
	
	/**
	 * Leer de un fichero un objeto Torre
	 */
	public Torre leerTorre(String fileName) {
		Torre torre = null;
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(fileName));
			torre = g.fromJson(bufferedReader, Torre.class);
		}
		catch (FileNotFoundException e) { System.err.println(e.getMessage()); }
		finally {
			try { if (bufferedReader != null) bufferedReader.close();   }
			catch (IOException e) { System.err.println(e.getMessage()); }
		}
		return torre;
	}

	
	/**
	 * Leer de un fichero un List de objetos CuentaCorriente
	 */
	@SuppressWarnings("unchecked")
	public List<CuentaCorriente> leerListCuentas(String fileName) {
		List<CuentaCorriente> cuentas = null;
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(fileName));
			cuentas = (List<CuentaCorriente>) g.fromJson(bufferedReader, CuentaCorriente.class);
		}
		catch (FileNotFoundException e) { System.err.println(e.getMessage()); }
		finally {
			try { if (bufferedReader != null) bufferedReader.close(); }
			catch (IOException e) { System.err.println(e.getMessage()); }
		}
		return cuentas;
	}

	/**
	 * Leer de un fichero un Array de objetos CuentaCorriente
	 */
	public CuentaCorriente[] leerArrayCuentas(String fileName) {
		CuentaCorriente[] cuentas = null;
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(fileName));
			cuentas = g.fromJson(bufferedReader, CuentaCorriente[].class);
		}
		catch (FileNotFoundException e) { System.err.println(e.getMessage()); }
		finally {
			try { if (bufferedReader != null) bufferedReader.close(); }
			catch (IOException e) { System.err.println(e.getMessage()); }
		}
		return cuentas;
	}

}