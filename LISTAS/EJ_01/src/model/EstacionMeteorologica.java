package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EstacionMeteorologica {

	
	/*
	Una lista de objetos de tipo Medicion
	Un atributo de tipo Coordenadas que determinará la localización de la estación.
	El constructor de la EstacionMeteorológica recibirá un nombre de un fichero binario que contendrá las mediciones, y un objeto de tipo Coordenadas.
	Deberás por tanto insertar los elementos del fichero en el atributo de tipo lista, y el objeto de tipo Coordenadas determinará su localización. 
	Para probarlo al principio, create un archivo vacío "datos.dat" o con el nombre que quieras.
	Un método addMedicion que reciba una medición y la introduzca en la lista.
	Un método ordenaTemperaturasAsc que ordene la lista por orden ascendente de temperaturas, teniendo en cuenta que consideramos este orden el orden natural de objetos de tipo Medicion.
	Un método ordenaHumedadesDesc que ordene la lista por orden descendente de humedades. Este no es el orden natural de los objetos Medicion, por lo que, ¿qué debes crear?.
	Un método presionMaxima que devuelva el objeto Medicion de mayor presion. Deberás recorrer la lista e ir buscando el objeto Medicion de presión máxima.
	Un método buscaMedicion que reciba un objeto de tipo Medicion y devuelva true o false dependiendo de si lo encuentra o no. Recuerda que para comparar objetos de un tipo nuevo (en este caso Medicion), deberás implementar el método equals de Object. Cuidado con que el prototipo del método sea exactamente igual que el de Object, si no, no funcionará.
	Un método guardarFichero que reciba el nombre de un fichero y guarde los datos de la lista en ese fichero binario. */
		
	private List<Medicion> mediciones;
	private Coordenadas cords;
	
	
	public EstacionMeteorologica() {
		mediciones = new ArrayList<Medicion>();
		setCords(new Coordenadas());
	}

	
	public void leerFichero(String nombreFichero) {
		  try{
		     ObjectInputStream fichero = new ObjectInputStream (new FileInputStream(nombreFichero));
		       mediciones = (ArrayList<Medicion>) fichero.readObject();
		       fichero.close();
		  } catch (Exception e) {
			  	System.err.print("ERROR Leyendo del fichero: " + nombreFichero);
		  }
		}  
	
	public static void escribirFichero(String nombreFichero, List<Medicion> myLista) {
		  try{
		     ObjectOutputStream fichero = new ObjectOutputStream (new FileOutputStream(nombreFichero));
		     fichero.writeObject(myLista);
		     fichero.close();
		  } catch (Exception e) {
			  	System.err.print("ERROR Leyendo del fichero: " + nombreFichero);
		  }
		}


	public void addMedicion(Medicion a) {
		mediciones.add(a);
		
	}
	public void ordenaTemperaturasAsc(){                      
		Collections.sort(mediciones);
	}
		
	public Coordenadas getCords() {
		return cords;
	}
	public void setCords(Coordenadas cords) {
		this.cords = cords;
	}
	
	
	
	
	
}
