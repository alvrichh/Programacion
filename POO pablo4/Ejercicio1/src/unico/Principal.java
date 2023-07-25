package unico;

public class Principal {

	public static void main(String[] args) {
		
		CuentaCorriente cuenta1 = new CuentaCorriente("Pablo","47265430Q");
		CuentaCorriente cuenta2 = new CuentaCorriente("Pablo","47265430Q");
		
		System.out.println("Cuenta1");
		cuenta1.mostrarInformacion();
		System.out.println("Cuenta2");
		cuenta2.ingresarDinero(50);

		cuenta2.mostrarInformacion();
	}

}
