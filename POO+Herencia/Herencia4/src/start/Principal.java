package start;

import model.Caja;
import model.Caja.Unidades;
import model.CajaCarton;

public class Principal {

	public static void main(String[] args) {
		
		Caja c1 = new Caja(200,100,23,Unidades.CM);
		Caja c2 = new Caja(200,100,23,Unidades.M);
		
		CajaCarton cc = new CajaCarton(200,100,23);
		CajaCarton cc2 = new CajaCarton(200,100,23);
		
		System.out.println(cc.superficieCajasCarton());
		System.out.println(cc2.getIdEtiqueta());

		
		
	}

}
