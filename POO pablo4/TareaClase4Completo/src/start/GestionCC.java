package start;

import java.util.Scanner;

import banco.Banco;
import banco.CuentaCorriente;
import banco.Direccion;
import banco.Persona;
import banco.TipoCC;
	
public class GestionCC {
	static CuentaCorriente[] cc = Principal.cuentas;
	static Scanner entrada = new Scanner(System.in);

	static boolean altaCuenta() {
		System.out.println();
		boolean volver = false;
		int pos;
		System.out.print("Hay un total de 10 espacios para una cuenta\nQue espacio quieres guardar?: ");
		pos = Integer.parseInt(entrada.nextLine());
		cc[pos - 1] = pedirDatosCC();
		System.out.println("Datos recopilados correctamente");
		volver = Principal.volver();
		return volver;

	}

	static boolean bajaCuenta() {
		System.out.println();
		boolean volver = false;
		int pos;
		System.out.print("Hay un total de 10 espacios para una cuenta\nQue espacio quieres eliminar?: ");
		pos = Integer.parseInt(entrada.nextLine());
		cc[pos-1] = null;
		System.out.println("Has eliminado la cuenta numero: " + pos);
		volver = Principal.volver();
		return volver;

	}

	static boolean consultarCuenta() {
		System.out.println();
		boolean volver = false;
		int pos;
		System.out.print("Hay un total de 10 espacios para una cuenta\nQue cuenta quieres consultar?: ");
		pos = Integer.parseInt(entrada.nextLine());
		System.out.println("Cuenta numero " + pos);
		mostrarCC(cc[pos-1]);
		volver = Principal.volver();
		return volver;
	}

	static boolean listarCuentas() {
		System.out.println();
		boolean volver = false;
		for (int i = 0; i < cc.length; i++) {
			// mostrarCC(cc[i]);
			System.out.println("Cuenta numero " + (i + 1));
			if (cc[i] == null)
				System.out.println("CUENTA VACIA");
			else {
				//System.out.println(g.toJson(cc[i]));
				mostrarCC(cc[i]);
			}

		}
		volver = Principal.volver();
		return volver;

	}

	static void modificarDato(int cuenta, int opc) {
		int opc2;
		int nuevoDatoInt;
		String nuevoDatoString;
		TipoCC tipo = null;
		
		System.out.println("Cuenta numero " + cuenta);
		cuenta--;
		switch (opc) {
		case 1:
			System.out.println("Saldo actual: " + cc[cuenta].getSaldo());
			System.out.print("Nuevo saldo: ");
			nuevoDatoInt = Integer.parseInt(entrada.nextLine());
			cc[cuenta].setSaldo(nuevoDatoInt);
			break;
		case 2:
			System.out.println("Limite de descubrimiento actual: " + cc[cuenta].getLimiteDeDescubrimiento());
			System.out.print("Nuevo limite de descubrimiento: ");
			nuevoDatoInt = Integer.parseInt(entrada.nextLine());
			cc[cuenta].setLimiteDeDescubrimiento(nuevoDatoInt);
			break;
		case 3:
			System.out.println("Tipo de cuenta actual: " + cc[cuenta].getTipo());
			System.out.println("Nuevo tipo de cuenta\n 1. Credito 2. Debido 3. Black");
			opc2 = Integer.parseInt(entrada.nextLine());
			if (opc2 == 1)
				tipo = TipoCC.CREDITO;
			if (opc2 == 2)
				tipo = TipoCC.DEBITO;
			if (opc2 == 3)
				tipo = TipoCC.BLACK;
			cc[cuenta].setTipo(tipo);
			break;
		case 4:
			System.out.println("Nombre del banco actual: " + cc[cuenta].getBanco().getNombre());
			System.out.print("Nuevo nombre del banco:");
			nuevoDatoString = entrada.nextLine();
			cc[cuenta].getBanco().setNombre(nuevoDatoString);
			break;
		case 5:
			System.out.println("Capital del banco actual: " + cc[cuenta].getBanco().getCapital());
			System.out.print("Nuevo capital del banco: ");
			nuevoDatoInt = Integer.parseInt(entrada.nextLine());
			cc[cuenta].getBanco().setCapital(nuevoDatoInt);
			break;
		case 6:
			System.out.println("Calle del banco actual: " + cc[cuenta].getBanco().getDireccionPostal().getCalle());
			System.out.print("Nueva calle del banco: ");
			nuevoDatoString = entrada.nextLine();
			cc[cuenta].getBanco().getDireccionPostal().setCalle(nuevoDatoString);
			break;
		case 7:
			System.out.println(
					"Numero de la calle del banco actual: " + cc[cuenta].getBanco().getDireccionPostal().getNumero());
			System.out.print("Nuevo numero de la calle del banco: ");
			nuevoDatoInt = Integer.parseInt(entrada.nextLine());
			cc[cuenta].getBanco().getDireccionPostal().setNumero(nuevoDatoInt);
			break;
		case 8:
			System.out.println("Codigo postal actual: " + cc[cuenta].getBanco().getDireccionPostal().getCodPostal());
			System.out.print("Nuevo codigo postal: ");
			nuevoDatoInt = Integer.parseInt(entrada.nextLine());
			cc[cuenta].getBanco().getDireccionPostal().setCodPostal(nuevoDatoInt);
			break;
		case 9:
			System.out.println("Nombre del titular actual: " + cc[cuenta].getTitular().getNombre());
			System.out.print("Nuevo nombre del titular: ");
			nuevoDatoString = entrada.nextLine();
			cc[cuenta].getTitular().setNombre(nuevoDatoString);
			break;
		case 10:
			System.out.println("Apellidos del titular actual: " + cc[cuenta].getTitular().getApellidos());
			System.out.print("Nuevos apellidos del titular: ");
			nuevoDatoString = entrada.nextLine();
			cc[cuenta].getTitular().setApellidos(nuevoDatoString);
			break;
		case 11:
			System.out.println("Dni del titular actual: " + cc[cuenta].getTitular().getDni());
			System.out.print("Nuevo DNI del titular: ");
			nuevoDatoString = entrada.nextLine();
			cc[cuenta].getTitular().setDni(nuevoDatoString);
			break;
		case 12:
			System.out.println("Calle del titular actual: " + cc[cuenta].getTitular().getDireccionFiscal().getCalle());
			System.out.print("Nueva calle del titular: ");
			nuevoDatoString = entrada.nextLine();
			cc[cuenta].getTitular().getDireccionFiscal().setCalle(nuevoDatoString);
			break;
		case 13:
			System.out.println("Numero de la calle del titular actual: "
					+ cc[cuenta].getTitular().getDireccionFiscal().getNumero());
			System.out.print("Nuevo numero de la calle del titular: ");
			nuevoDatoInt = Integer.parseInt(entrada.nextLine());
			cc[cuenta].getTitular().getDireccionFiscal().setNumero(nuevoDatoInt);
			break;
		case 14:
			System.out.println("Codigo postal actual: " + cc[cuenta].getTitular().getDireccionFiscal().getCodPostal());
			System.out.print("Nuevo codigo postal: ");
			nuevoDatoInt = Integer.parseInt(entrada.nextLine());
			cc[cuenta].getTitular().getDireccionFiscal().setCodPostal(nuevoDatoInt);
		}

	}

	static CuentaCorriente pedirDatosCC() {
		CuentaCorriente ccFinal = null;
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

		switch (cuentaCorrienteTipo) {
		case 1:
			tipo = TipoCC.CREDITO;
			break;
		case 2:
			tipo = TipoCC.DEBITO;
			break;
		case 3:
			tipo = TipoCC.BLACK;
		}
		ccFinal = new CuentaCorriente(cuentaCorrienteSaldo, cuentaCorrientelimiteDeDescubrimiento,
				new Persona(personaNombre, personaApellidos, personaDni,
						new Direccion(direccionPersonaCalle, direccionPersonaNumero, direccionPersonaCodPostal)),
				tipo, new Banco(bancoNombre, bancoCapital,
						new Direccion(direccionBancoCalle, direccionBancoNumero, direccionBancoCodPostal)));
		return ccFinal;
	}


	static void mostrarCC(CuentaCorriente cc) {
		System.out.println("---Datos de la cuenta corriente---");
		System.out.println("Saldo: " + cc.getSaldo());
		System.out.println("Limite de descubrimiento: " + cc.getLimiteDeDescubrimiento());
		System.out.println("Tipo de cuenta: " + cc.getTipo());
		System.out.println("---Datos del titular de la cuenta---");
		System.out.println("Nombre del titular: " + cc.getTitular().getNombre());
		System.out.println("Apellidos del titular: " + cc.getTitular().getApellidos());
		System.out.println("Dni del titular: " + cc.getTitular().getDni());
		System.out.print("Direccion del titular: ");
		System.out.println("Calle " + cc.getTitular().getDireccionFiscal().getCalle() + " Numero "
				+ cc.getTitular().getDireccionFiscal().getNumero() + " CP: "
				+ cc.getTitular().getDireccionFiscal().getCodPostal());
		System.out.println("---Datos del Banco asociado---");
		System.out.println("Nombre del banco: " + cc.getBanco().getNombre());
		System.out.println("Capital del banco: " + cc.getBanco().getCapital());
		System.out.print("Direccion del banco: ");
		System.out.println("Calle " + cc.getBanco().getDireccionPostal().getCalle() + " Numero "
				+ cc.getBanco().getDireccionPostal().getNumero() + " CP: "
				+ cc.getBanco().getDireccionPostal().getCodPostal());
	}

	
	
}

