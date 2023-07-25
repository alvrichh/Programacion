package view;

import java.util.Map;

import controller.GestionCalificaciones;
import model.Calificacion;

public class CalificarPruebas {

	GestionCalificaciones gest = new GestionCalificaciones();

	public CalificarPruebas() {
		try {
			gest.leerDatos();
			introducirCalificaciones();
			gest.escribirDatos();
		} catch (Exception e) {
			Util.escribirError(e.getMessage());
		}
	}

	private void introducirCalificaciones() {
		for(Map.Entry<Integer, Calificacion> entry : gest.getCalificaciones().entrySet()) {
			Integer id = entry.getKey();
			Calificacion c = pedirNotas(id);
			gest.addCalificacion(id, c);
		}
	}

	private Calificacion pedirNotas(Integer id) {
		Double nota1;
		Double nota2;
		Double nota3;
		Double nota4;
		
		Util.escribir("\nCALIFICACIONES DEL ASPIRANTE CON ID: " + id);
		nota1 = Util.leerDouble("Nota Temario   = ");
		nota2 = Util.leerDouble("Nota Prácticas = ");
		nota3 = Util.leerDouble("Nota Prog.Did  = ");
		nota4 = Util.leerDouble("Nota Ud.Didac  = ");
		
		return new Calificacion(nota1, nota2, nota3, nota4);
	}

}