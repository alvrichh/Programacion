package view;

import com.google.gson.GsonBuilder;

import controller.EME;
import model.EstacionMeteorologica;
import model.Medicion;

public class Principal {

	final static String NOMBRE_FICHERO = "datos2023.dat";

	public static void main(String[] args) {
		EME eme = new EME(NOMBRE_FICHERO);
		
		//inicializarEME(eme);
		gestion(eme);

	}

	private static void gestion(EME eme) {
		// De la Estación Meteorológica que está en las coordenadas (10, 10)
		// Tomar la primera de sus mediciones (la de índice 0)
		// y asignar como Temperatura = -1
		
		
		eme.getEME(10, 10).getMediciones().get(0).setTemperatura(-1);

		// Nuevo método para simplificar la acción anterior,
		// el primer parámetro indica el índice de la medición a actualizar
		// el segundo parámetro indica el nuevo valor
		eme.getEME(10, 10).updateTemperatura(0, -5);

		// A la Estación Meteorológica que está en las coordenadas (10, 10)
		// Añadir una nueva medición
		eme.getEME(10, 10).addMedicion(new Medicion(10, 20, 30));

		// De la Estación Meteorológica que está en las coordenadas (10, 10)
		// Ordenamos todas sus mediciones por el criterio por defecto (temperatura)
		eme.getEME(10, 10).ordenaTemperaturasAsc();

		// De la Estación Meteorológica que está en las coordenadas (10, 10)
		// ¿Cuál es el valor de mayor Presión registrada?
		Integer pm = eme.getEME(10, 10).presionMaxima();
		System.out.println("Presión máxima = " + pm);

		// En la Estación Meteorológica que está en las coordenadas (10, 10)
		// ¿Se ha registrado alguna vez los valores T=10, H=20, P=30?
		boolean med = eme.getEME(10, 10).buscaMedicion(new Medicion(10, 20, 30));
		System.out.println("Existe medición? " + med);

		// Mostrar toda la información del conjunto de Estaciones Meteorológicas:

		// Usando: stream
		// eme.getEstaciones().stream().forEach(System.out::println);

		// Usando: Formato Json
		// System.out.println(new
		// GsonBuilder().setPrettyPrinting().create().toJson(eme));

		// Programación standard
		for (EstacionMeteorologica em : eme.getEstaciones()) {
			System.out.println(em.getCoord());
			for (Medicion md : em.getMediciones()) {
				System.out.println("T:" + md.getTemperatura() + "\tH:" + md.getHumedad() + "\tP:" + md.getPresion());
			}
			System.out.println();
		}

		// Escribir las modificaciones en el fichero
		 eme.escribirFicheroEME(NOMBRE_FICHERO);
	}

	private static void inicializarEME(EME eme) {

		EstacionMeteorologica em1 = new EstacionMeteorologica(10, 10);
		EstacionMeteorologica em2 = new EstacionMeteorologica(15, 25);
		EstacionMeteorologica em3 = new EstacionMeteorologica(30, 16);

		eme.deleteEM(em1);
		eme.deleteEM(em2);
		eme.deleteEM(em3);

		for (int i = 1; i < 4; i++)
			em1.addMedicion(generaMedicion());
		for (int i = 1; i < 3; i++)
			em2.addMedicion(generaMedicion());
		for (int i = 1; i < 5; i++)
			em3.addMedicion(generaMedicion());

		eme.addEM(em1);
		eme.addEM(em2);
		eme.addEM(em3);

		eme.escribirFicheroEME("datos2023.dat");
	}

	private static Medicion generaMedicion() {
		Integer t = (int) (Math.random() * 20);
		Integer h = (int) (Math.random() * 50);
		Integer p = (int) (Math.random() * 99);
		return new Medicion(t, h, p);
	}
}
