package start;

import model.Empleado;
import model.Fijo;
import model.Persona;

public class Principal {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		Empleado e = new Empleado();
		
		Fijo f = new Fijo();
		
		Fijo f2 = new Fijo("leña", "Pablo", "pueblop", "aaa33456J");
		
		System.out.println(f2);
		
	}
	
}
