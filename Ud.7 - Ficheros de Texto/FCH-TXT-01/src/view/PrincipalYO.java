package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class PrincipalYO {
	
	public static void main(String[] args) {
		
		String nombreFch = "";

		
		try {
			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Nombre del fichero: ");
			nombreFch = teclado.readLine();
			if(nombreFch.length() == 0) {
				nombreFch = "probando.txt";
			}
			teclado.close();
			} catch (Exception e) {
				System.err.println("Error con el teclado. " + e.getMessage());
			}
		
		try {
			BufferedReader fichero = new BufferedReader(new FileReader(nombreFch));
			String contenidoFch = "";
			String lineaLeida = fichero.readLine();
			while (lineaLeida != null) {
				contenidoFch += lineaLeida;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			FileWriter fichero = new FileWriter(nombreFch); 
			
			fichero.write("Hola muy buenas bro!!!");
			fichero.close();
		} catch (Exception e) {
			// TODO: handle exception
		}}
	
	

}
