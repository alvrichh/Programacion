package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Se pide crear otro fichero, de nombre: maximo.txt, que contendrá, en cada
 * línea, la temperatura máxima de las temperaturas alcanzadas ese mismo día por
 * los tres meses.
 * 
 * Se almacenarán únicamente, lo correspondiente a los 5 primeros días.
*/

public class Principal {
	public static void main(String[] args) {
		String[] meses = { "enero.txt", "febrero.txt", "marzo.txt" };
		String maximoArchivo = "maximo.txt";

		try {
			// Abrir el archivo maximo.txt para escribir
			BufferedWriter writer = new BufferedWriter(new FileWriter(maximoArchivo));

			// Recorrer los archivos de los meses
			for (String mes : meses) {
				// Abrir el archivo del mes para leer
				BufferedReader reader = new BufferedReader(new FileReader(mes));

				// Leer las temperaturas de los primeros 5 días del mes
				int[] temperaturas = new int[5];
				for (int i = 0; i < 5; i++) {
					String linea = reader.readLine();
					if (linea == null) {
						// Si el archivo no tiene suficientes líneas, salir del ciclo
						break;
					}
					temperaturas[i] = Integer.parseInt(linea);
				}

				// Encontrar la temperatura máxima de los 5 días
				int maximo = Integer.MIN_VALUE;
				for (int temperatura : temperaturas) {
					if (temperatura > maximo) {
						maximo = temperatura;
					}
				}

				// Escribir la temperatura máxima en el archivo maximo.txt
				writer.write(String.valueOf(maximo));
				writer.newLine();

				// Cerrar el archivo del mes
				reader.close();
			}

			// Cerrar el archivo maximo.txt
			writer.close();

			System.out.println("Se ha creado el archivo maximo.txt con las temperaturas máximas.");
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error: " + e.getMessage());
		}
	}
}
