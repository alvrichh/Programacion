package controller;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Vivienda;

public class ViviendasJSON {
	
	static Gson g = new GsonBuilder().setPrettyPrinting().create();

	public static String printJson(String fileName, List<Vivienda> lista) {
		return g.toJson(lista);
}
}
