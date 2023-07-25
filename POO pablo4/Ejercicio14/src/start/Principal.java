package start;

import examen.Examen;
import examen.Opositor;
import examen.Pregunta;
import examen.Sede;

public class Principal {

	public static void main(String[] args) {

		Examen e = new Examen(new Sede(5));
		
		Sede s1 = new Sede(2);
		
		s1.getPregunta()[0] = new Pregunta();
		s1.getPregunta()[0].setEnunciado("PRUEBA");
		
		System.out.println(s1);
	}

}
