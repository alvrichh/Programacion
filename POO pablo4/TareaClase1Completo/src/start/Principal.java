package start;

import banco.CuentaCorriente;
import banco.TipoCC;
import banco.Banco;

public class Principal {

	public static void main(String[] args) {
		CuentaCorriente cuenta1 = new CuentaCorriente();
		CuentaCorriente cuenta2 = new CuentaCorriente(200, "47265430Q");
		//Banco banco1 = new Banco("Santander");
		
		System.out.println(cuenta2);
		
		cuenta2.setTipo(TipoCC.BLACK);
		cuenta2.sacarDinero(100000);
		System.out.println();
		System.out.println(cuenta2);
		
		
		

		
	}

}
