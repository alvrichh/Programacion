package unico;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Crear una colección de 20 números enteros aleatorios menores que 100, y guardarlos en el orden en que se vayan generando.
Muestra por pantalla dicha lista una vez creada. 
Ordenarla en sentido creciente y volverla a mostrar por pantalla.
Ordenarla en sentido decreciente y volverla a mostrar por pantalla.
 */
public class Principal {

	public static void main(String[] args) {

		List<String> palabras = new ArrayList<String>();
		List<String> palabrasSinRepetir = new ArrayList<String>();
		List<String> palabrasRepetidas = new ArrayList<String>();

		String cadena = "Hola qué tal Hola tú bien qué haces tú";

		StringTokenizer st = new StringTokenizer(cadena, " ");

		while (st.hasMoreTokens()) {
			palabras.add(st.nextToken());
		}

		for (String p : palabras) {
			if (!palabrasSinRepetir.contains(p)) 	{
				palabrasSinRepetir.add(p);
			} else {
				palabrasSinRepetir.remove(p);
			}
		}
		System.out.println(palabrasSinRepetir);
		for (String p1 : palabras) {
			if (!palabrasRepetidas.contains(p1)) {
				palabrasRepetidas.remove(p1);
			} else {
				palabrasRepetidas.add(p1);
			}
		}
		System.out.println(palabrasRepetidas);


	}
}
