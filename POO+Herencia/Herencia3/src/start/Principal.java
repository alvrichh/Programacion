package start;

import transporte.Caja;
import transporte.Caja.Unidades;

public class Principal {

	public static void main(String[] args) {
		
		Caja c1 = new Caja(200000,100000,23000,Unidades.CM);
		Caja c2 = new Caja(200,100,23,Unidades.M);
		
		System.out.println(c1.getVolumen());
		System.out.println(c2.getVolumen());
		
		System.out.println(c2);
		
		
		
	}

}
