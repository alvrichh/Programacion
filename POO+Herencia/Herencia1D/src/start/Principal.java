package start;

import model.HoraExacta;

public class Principal {

	public static void main(String[] args) {

		HoraExacta he = new HoraExacta(1, 59, 59);

		
		
		System.out.println(he.esIgual(new HoraExacta(1, 59, 59)));


	}

}
