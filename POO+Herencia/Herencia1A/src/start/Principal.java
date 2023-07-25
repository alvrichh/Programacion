package start;

import model.Hora;

public class Principal {

	public static void main(String[] args) {
		Hora h1 = new Hora(23,59);
		
		
		h1.inc();
		System.out.println(h1);
	}

}
