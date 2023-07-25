package start;

import banco.CuentaCorriente;
import banco.TipoCC;
import banco.Banco;

public class Principal {

	public static void main(String[] args) {
		CuentaCorriente cuenta2 = new CuentaCorriente(new Banco("BBVA"), "Pablo Merinas", "47265430Q");
		//Banco banco1 = new Banco("Santander");
		
		//System.out.println(cuenta2);
		//cuenta2.sacarDinero(1150);
		//System.out.println();

		
		//System.out.println(cuenta2.getBanco().getNombre());
		
		cuenta2.getBanco().setNombre("Santander");
		System.out.println(cuenta2.toString());
		System.out.println("------INFO DEL BANCO-----");
		System.out.println(cuenta2.getBanco().toString());
		
		

		
	}

}
