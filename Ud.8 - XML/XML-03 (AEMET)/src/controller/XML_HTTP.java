package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class XML_HTTP {
	
	public void updateInfo(String myURL, String nomFile) throws MalformedURLException, IOException {
		String datosLeidos = peticionHttpGet(myURL);
		writeFile(nomFile, datosLeidos);
	} 
	
	private void writeFile(String nomFile, String txt) {
		BufferedWriter bufferedWriter = null;
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(nomFile));
			bufferedWriter.write(txt);
		}
		catch (IOException e) { System.err.println(e.getMessage()); }
		finally {
			try { if (bufferedWriter != null) bufferedWriter.close();   }
			catch (IOException e) { System.err.println(e.getMessage()); }
		}
	}

	private String peticionHttpGet(String myURL) throws MalformedURLException, IOException {
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

}
