package start;

import model.Hora;
import model.Hora12;
import model.Hora12.Meridian;

public class Principal {

	public static void main(String[] args) {

		Hora h = new Hora(23, 12);
		
		System.out.println(h);
		
		Hora12 h2 = new Hora12(11, 2);
		
		
		System.out.println(h2);
	}
	
}
