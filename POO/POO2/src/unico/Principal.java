package unico;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import banco.*;

/*
 * 		  {-> ATRIBUTOS
 * CLASE {		 +		  {-> CONSTRUCTORES
 * 		  {-> MÉTODOS ----{-> GETTERS & SETTERS
 * 						  {-> FUNCIONAL(ES)
 * 						  {-> DE CLASE(toString, clone, equals, )
 * 
 * 
 */
//UN TO STRING NUNCA HAY QUE PONERLO BONITO POR QUE ES PARA MOSTRARLO
//PARA NOSOTROS SABER COMO FUNCIONA
public class Principal {
	static String msj;

	public static void main(String[] args) {
		// String msj;
		final String bbva = "Ha seleccionado BBVA";
		final String sntd = "Ha seleccionado Santander";
		final String caixa = "Ha seleccionado CaixaBank";
		final String error = "Opción no válida, por favor seleccione una correcta: ";
		
//====================PETICIÓN AL USUARIO===============================

		String n = Util.leerString("Introduzca su nombre: ");
		String a = Util.leerString("Introduzca sus apellidos: ");
		String d = Util.leerString("Introduzca su DNI: ");

//====================PETICIÓN DE DIRECCION=============================

		String c = Util.leerString("Introduzca su calle: ");
		String num = Util.leerString("Introduzca el número: ");
		String cod = Util.leerString("Introduzca su código postal: ");

//====================SELECCIÓN DE BANCO===============================

		do {
			int banco = Util.leerInt("[1 - BBVA]\n[2 - SANTANDER]\n[3 - CAIXABANK]");
			switch (banco) {
			case 1:
				msj = bbva; break;
			case 2:
				msj = sntd; break;
			case 3:
				msj = caixa;break;
			default:
				msj = error;
			}
			System.out.println(msj);

		} while (msj == error);
		
//====================SELECCIÓN TIPO DE CUENTA=========================

//====================CREACION DE CUENTAS==============================
		CuentaCorriente[] cuenta = new CuentaCorriente[10];

		cuenta[2] = new CuentaCorriente();
		
		Gson g = new GsonBuilder().setPrettyPrinting().create();

//====================ASIGNACIÓN DE VALORES============================

		Direccion d1 = new Direccion(c, num, cod);
		Persona[] p  = new Persona[10];
		
		p[1] = new Persona(n, a, d, d1);
		
		Banco b = new Banco("BBVA", d1);
		
		cuenta[1] = new CuentaCorriente(num, TipoCC.BLACK, null, p, b);

		System.out.println(g.toJson(cuenta));		

//		CuentaCorriente cc1 = new CuentaCorriente("", TipoCC.DEBITO, 0.00, p1, b1);
//
//		System.out.println(cc1.getTipo());
//		System.out.println(cc1.getTitular());
//		System.out.println(cc1.getTitular().getDireccFiscal());

//		boolean haSidoPosible = cc1.setSaldo(12.0);
//		msj = haSidoPosible ? "CORRECTO" : "ERROR";
//		System.out.println(msj);
//		System.out.println(cc2);
//		
//		System.out.println(cc1.getSaldo());
//
//		System.out.println( cc2.toString());
	}

}
