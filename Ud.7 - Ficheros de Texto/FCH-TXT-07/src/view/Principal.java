package view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//CONSTANTES
		final String NOMBRE_FCH_DEFAULT = "prueba.txt";
		final String FILE_NAME = "C:\\Users\\TuUsuario\\Documentos\\trenes.dat";

		final String TXT_PAUSA = "« pulse INTRO para continuar »";
		final String TXT_EOF = "« fin del fichero »";
		final Integer LINEAS_POR_PAGINA = 10;
		//VARIABLES
		String nombreFch = "";
		String lineaLeida = "";
		int cont = 0;

		BufferedReader fichero = null;
		/**
		En Java, el BufferedReader se utiliza para leer caracteres de un flujo de entrada de manera eficiente. Se usa para leer texto de una 
		variedad de fuentes de entrada, como un archivo en disco, una conexión de red o la entrada estándar del usuario.

		El BufferedReader funciona al leer grandes bloques de caracteres de la fuente de entrada y almacenarlos en un búfer temporal en memoria.
		Luego, a medida que se solicita la lectura de caracteres, el BufferedReader devuelve los caracteres desde el búfer en lugar de leer directamente
		desde la fuente de entrada. Esto hace que la lectura de datos sea más eficiente, ya que se minimiza la cantidad de operaciones de E/S necesarias.

		Además, el BufferedReader también proporciona varios métodos útiles para leer caracteres de la fuente de entrada, como readLine(),
		que lee una línea completa de texto, y read() que lee un solo carácter.

		En resumen, el BufferedReader es una clase muy útil en Java para leer texto de forma eficiente desde diferentes fuentes de entrada.
		 */

		try {
			// Pedir el nombre del fichero al ususario
			System.out.print("Nombre del fichero [" + NOMBRE_FCH_DEFAULT + "] : ");
			Scanner teclado = new Scanner(System.in);
			nombreFch = teclado.nextLine();
			if (nombreFch.length() == 0) {
				nombreFch = NOMBRE_FCH_DEFAULT;
			}
			// Abrir el fichero para mostrar su contenido
			fichero = new BufferedReader(new FileReader(nombreFch));
			lineaLeida = fichero.readLine();
			while (lineaLeida != null) {
				System.out.println(lineaLeida);
				cont++;
				if (cont == LINEAS_POR_PAGINA) {
					cont = 0;
					System.out.print(TXT_PAUSA);
					teclado.nextLine();
				}
				lineaLeida = fichero.readLine();
			}
			System.out.print(TXT_EOF);
		}
		
		catch (FileNotFoundException fnfe) { System.err.println("ERROR con el fichero. NO SE ENCUENTRA. " + fnfe.getMessage()); }
		catch (IOException ioe)            { System.err.println("ERROR con el fichero. LECTURA/ESCRITURA. " + ioe.getMessage());}
		catch (Exception e)                { System.err.println("ERROR con el teclado. " + e.getMessage());                     }
		
/*
En Java, el try-catch se utiliza para manejar excepciones, que son errores que pueden ocurrir durante la ejecución del programa.

La estructura básica de un try-catch es la siguiente:	
try {
    // Código que puede generar una excepción
} catch (Exception e) {
    // Código que maneja la excepción
}
El código que puede generar una excepción se coloca dentro del bloque try. Si se produce una excepción, el programa salta al bloque catch,
donde se maneja la excepción. El tipo de excepción que se espera manejar se especifica en el paréntesis después de la palabra clave catch.

Por ejemplo, si se está leyendo un archivo y hay un error al intentar abrir el archivo, 
se puede usar un try-catch para manejar la excepción y mostrar un mensaje de error al usuario:

try {
    FileReader fileReader = new FileReader("archivo.txt");
    // Código para leer el archivo
} catch (IOException e) {
    System.out.println("Error al abrir el archivo: " + e.getMessage());
}
En este ejemplo, se usa try-catch para manejar la excepción IOException, 
que puede ocurrir si hay un error al abrir el archivo. 
Si se produce una excepción, se muestra un mensaje de error al usuario.

En resumen, try-catch es una estructura en Java para manejar excepciones
y dar solucion a los errores que no tienen solucion. :)
 */
		finally {
			try {
				if (fichero != null)
					fichero.close();
			} catch (Exception e) {
				System.err.println("ERROR con el fichero. CIERRE. " + e.getMessage());
			}
			// el fichero se cerrará si no encuentra ninguna excepción
		}
	}

}