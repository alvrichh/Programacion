package start;

import banco.CuentaCorriente;
import banco.Direccion;
import banco.Persona;
import banco.TipoCC;

import java.util.Scanner;

import com.google.gson.Gson;

import banco.Banco;

public class Principal {

	public static void main(String[] args) {
		Gson g = new Gson();

		CuentaCorriente cc1 = pedirDatosCC();
		//mostrarCC(cc1);
		System.out.println(g.toJson(cc1));
		
		
		
	}
	
	private static CuentaCorriente pedirDatosCC() {
		CuentaCorriente ccFinal = null;
		Scanner entrada = new Scanner(System.in);
		int cuentaCorrienteSaldo;
		Integer cuentaCorrientelimiteDeDescubrimiento;
		Integer cuentaCorrienteTipo;
		String bancoNombre;
		double bancoCapital;
		String direccionBancoCalle;
		int direccionBancoNumero;
		int direccionBancoCodPostal;
		String direccionPersonaCalle;
		int direccionPersonaNumero;
		int direccionPersonaCodPostal;
		String personaNombre;
		String personaApellidos;
		String personaDni;
		TipoCC tipo = null;
		
		
		System.out.print("Introduce el saldo de la cuenta corriente: ");
		cuentaCorrienteSaldo = Integer.parseInt(entrada.nextLine());
		System.out.print("Introduce el limite de descubrimiento: ");
		cuentaCorrientelimiteDeDescubrimiento = Integer.parseInt(entrada.nextLine());
		System.out.print("Selecciona el tipo de cuenta corriente: 1. Credito 2. Debito 3. Black ");
		cuentaCorrienteTipo = Integer.parseInt(entrada.nextLine());
		System.out.print("Introduce el nombre del banco: ");
		bancoNombre = entrada.nextLine();
		System.out.print("Introduce el capital del banco: ");
		bancoCapital = Double.parseDouble(entrada.nextLine());
		System.out.print("Introduce la calle del banco: ");
		direccionBancoCalle = entrada.nextLine();
		System.out.print("Introduce el numero del banco: ");
		direccionBancoNumero = Integer.parseInt(entrada.nextLine());
		System.out.print("Introduce el codigo postal del banco: ");
		direccionBancoCodPostal = Integer.parseInt(entrada.nextLine());
		System.out.print("Introduce el nombre del titular: ");
		personaNombre = entrada.nextLine();
		System.out.print("Introduce los apellidos del titular: ");
		personaApellidos = entrada.nextLine();
		System.out.print("Introduce el Dni del titular: ");
		personaDni = entrada.nextLine();
		System.out.print("Introduce la calle del titular: ");
		direccionPersonaCalle = entrada.nextLine();
		System.out.print("Introduce el numero: ");
		direccionPersonaNumero = Integer.parseInt(entrada.nextLine());
		System.out.print("Introduce el codigo postal: ");
		direccionPersonaCodPostal = Integer.parseInt(entrada.nextLine());
		
		switch(cuentaCorrienteTipo) {
		case 1: tipo = TipoCC.CREDITO; break;
		case 2: tipo = TipoCC.DEBITO; break;
		case 3: tipo = TipoCC.BLACK;
	}
		ccFinal = new CuentaCorriente(cuentaCorrienteSaldo,cuentaCorrientelimiteDeDescubrimiento,new Persona(personaNombre,personaApellidos,personaDni,new Direccion(direccionPersonaCalle,direccionPersonaNumero,direccionPersonaCodPostal)),tipo,new Banco(bancoNombre,bancoCapital,new Direccion(direccionBancoCalle,direccionBancoNumero,direccionBancoCodPostal)));
		return ccFinal;
	}

	public static void mostrarCC(CuentaCorriente cc){
		System.out.println("---Datos de la cuenta corriente---");
		System.out.println("Saldo: " + cc.getSaldo());
		System.out.println("Limite de descubrimiento: " + cc.getLimiteDeDescubrimiento());
		System.out.println("Tipo de cuenta: " + cc.getTipo());
		System.out.println("---Datos del titular de la cuenta---");
		System.out.println("Nombre del titular: " + cc.getTitular().getNombre());
		System.out.println("Apellidos del titular: " + cc.getTitular().getApellidos());
		System.out.println("Dni del titular: " + cc.getTitular().getDni());
		System.out.print("Direccion del titular: ");
		System.out.println("Calle " + cc.getTitular().getDireccionFiscal().getCalle() + " Numero " + cc.getTitular().getDireccionFiscal().getNumero() + " CP: " + cc.getTitular().getDireccionFiscal().getCodPostal());
		System.out.println("---Datos del Banco asociado---");
		System.out.println("Nombre del banco: " + cc.getBanco().getNombre());
		System.out.println("Capital del banco: " + cc.getBanco().getCapital());
		System.out.print("Direccion del banco: " );
		System.out.println("Calle " + cc.getBanco().getDireccionPostal().getCalle() + " Numero " + cc.getBanco().getDireccionPostal().getNumero() + " CP: " + cc.getBanco().getDireccionPostal().getCodPostal());
	}

}
