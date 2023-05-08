package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Persona;

public class ParseandoJSONPersona {

	private static Gson g = new GsonBuilder().setPrettyPrinting().create();

	public static <T> void writeJson(String fileName, T obj) {
		BufferedWriter bufferedWriter = null;
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(fileName));
			bufferedWriter.write(g.toJson(obj));
		}
		catch (IOException e) { System.err.println(e.getMessage()); }
		finally {
			try { if (bufferedWriter != null) bufferedWriter.close(); }
			catch (IOException e) { System.err.println(e.getMessage()); }
		}
	}

	public static List<Persona> readListadoPersonas(String fileName) {
		List<Persona> personas = null;
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(fileName));
			personas = Arrays.asList(g.fromJson(bufferedReader, Persona[].class));
		}
		catch (FileNotFoundException e) { System.err.println(e.getMessage()); }
		finally {
			try { if (bufferedReader != null) bufferedReader.close(); }
			catch (IOException e) { System.err.println(e.getMessage()); }
		}
		return personas;
	}

}