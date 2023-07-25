package start;

import banco.CuentaCorriente;
import banco.TipoCC;
import banco.Titular;
import banco.Banco;

public class Principal {

	public static void main(String[] args) {
		
		CuentaCorriente cuenta2 = new CuentaCorriente();
		//CuentaCorriente cuenta2 = new CuentaCorriente(new Titular("Pablo","Merinas","333444"),100);
		//CuentaCorriente cuenta2 = new CuentaCorriente(200, "47265430Q");
		//Banco banco1 = new Banco("Santander");

		
		
		System.out.println(cuenta2);
		
		
		

		
	}

}
