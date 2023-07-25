package view;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import model.Camion;

public class Principal extends Exception{
	/*
	 * Realiza una aplicación Java que permita crear objetos de la clase Camion,
	 * sabiendo que:
	 * 
	 * Atributos = {num_ejes<integer>, capacidad <double>, frenos<string>,
	 * precio<double>}
	 * 
	 * Restricciones para cada atributo:
	 * 
	 * num_ejes: sólo serán válidos los valores: 4, 8 y 16 (no utilizar enumerados).
	 * capacidad: entre 2000.0 4000.0 y además sea un valor par. frenos: sólo serán
	 * válidos los valores: "ABS" y "HDS" (en mayúsculas) (no utilizar enumerados).
	 * precio: positivo y mayor que 50.000'00 € Consideraciones:
	 * 
	 * Los valores no admitidos para cada atributo deberán levantar una excepción
	 * personalizada con un mensaje apropiado. Las excepciones personalizadas para
	 * el num_ejes (EjesException), la capacidad (CapacidadException), los frenos
	 * (FrenoException) deberán de heredar de ComponenteException, la cual
	 * almacenará el mensaje exacto del error correspondiente. El método constructor
	 * de la clase Ordenador sólo deberá elevar las excepciones: ComponenteException
	 * y PrecioException. El método main (view) sólo deberá gestionar las
	 * excepciones: ComponenteException, PrecioException y Exception, para mostrar
	 * el correspondiente mensaje de error.
	 */
	

	
	public static void main(String[] args){

    	//VARIABLES
    	Integer num_ejes;
    	Double capacidad;
    	String frenos;
    	Double precio;
    	
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de ejes (4, 8 o 16): ");
		num_ejes = teclado.nextInt();
		System.out.print("Introduce la capacidad (entre 2000.0 y 4000.0, y par): ");
		capacidad = teclado.nextDouble();
		teclado.nextLine(); // Consumir el \n que queda en el buffer
		System.out.print("Introduce el tipo de frenos (ABS o HDS): ");
		frenos = teclado.nextLine().toUpperCase();
		System.out.print("Introduce el precio (mayor que 50,000.00 €): ");
		precio = teclado.nextDouble();
		
		Camion camion = new Camion(num_ejes, capacidad, frenos, precio);
		while (num_ejes != 4 || num_ejes != 8 || num_ejes != 16) {
			System.out.println("Número de ejes incorrectos");
			throws EjesException;
			
		}
     }catch (EjesException ejes) 	{System.err.println("Ejes incorrectos"  + getMessage());
     }catch (CapacidadException cap){System.err.println("Ejes incorrectos"  + getMessage());
     }catch (FrenoException fre)	{System.err.println("Ejes incorrectos"  + getMessage());

     }
}
	


