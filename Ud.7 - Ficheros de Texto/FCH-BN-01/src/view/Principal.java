package view;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class Principal {
	

	public static void main(String[] args) {
		/////////////////////////////////////////
		ObjectOutputStream fichero = null;
		BufferedReader teclado = null;
		
		try {
		
		System.out.println("Introduzca un número con decimales: ");
		teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = teclado.readLine();
		Double numero = Double.parseDouble(respuesta);
		fichero = new ObjectOutputStream(new FileOutputStream("entero.dat"));
		fichero.writeDouble(numero);
		fichero.close();
		
		
		
		} catch(IOException ioe) {
			System.err.println("Fallo con el dispositivo E/S." + ioe.getMessage());
		} catch(NumberFormatException nfe){
			System.err.println("el texto introducido no se puede convertir a número decimal.");
		} catch (Exception e) {
			System.err.println("Fallo General. " + e.getMessage());
		}
		
	
		finally {
			try{
				if (teclado != null) teclado.close();
				if (fichero != null) fichero.close();
			} catch (IOException ioe) {
				System.err.println("Fallo cerrando el dispositivo E/S." + ioe.getMessage());
				
			}
		}
		
		
	}

}
