package start;

import banco.CuentaCorriente;
import banco.Direccion;
import banco.Persona;
import banco.TipoCC;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import banco.Banco;

public class Principal {

	public static void main(String[] args) {		
		CuentaCorriente[] cuentas = new CuentaCorriente[10];
		
		menu(cuentas);
	}
	
	
	private static void menu(CuentaCorriente[] cc) {
		Scanner entrada = new Scanner(System.in);
		int opc;
		boolean salir = false;
		do {
			System.out.println("-----Menú-----");
			System.out.println("1. Dar de alta una cuenta corriente");
			System.out.println("2. Dar de baja una cuenta corriente");
			System.out.println("3. Consulta una cuenta corriente");
			System.out.println("4. Lista todas las cuentas corrientes");
			System.out.println("5. Modificar un dato de una cuenta corriente");
			System.out.println("0. SALIR");
			opc = Integer.parseInt(entrada.nextLine());
			switch(opc) {
			case 0: salir = true; break;
			case 1: salir = altaCuenta(cc); break;
			case 2: salir = bajaCuenta(cc); break;
			case 3: salir = consultarCuenta(cc); break;
			case 4: salir = listarCuentas(cc); break;
			case 5: salir = modificarDato(cc); break;
			}
		} while (!salir);
		msgSalida();
		
	}
	
	private static boolean altaCuenta(CuentaCorriente[] cc) {
		Scanner entrada = new Scanner(System.in);
		boolean volver = false;
		int pos;
		System.out.print("Hay un total de 10 espacios para una cuenta\nQue espacio quieres guardar?: ");
		pos = Integer.parseInt(entrada.nextLine());
		cc[pos] = pedirDatosCC();
		System.out.println("Datos recopilados correctamente");
		volver = volver();
		return volver;
		
	}
	private static boolean bajaCuenta(CuentaCorriente[] cc) {
		Scanner entrada = new Scanner(System.in);
		boolean volver = false;
		int pos;
		System.out.print("Hay un total de 10 espacios para una cuenta\nQue espacio quieres eliminar?: ");
		pos = Integer.parseInt(entrada.nextLine());
		cc[pos] = null;
		System.out.println("Has eliminado la cuenta numero: " + pos);
		volver = volver();
		return volver;
		
	}
	private static boolean consultarCuenta(CuentaCorriente[] cc) {
		Scanner entrada = new Scanner(System.in);
		Gson g = new GsonBuilder().setPrettyPrinting().create();
		boolean volver = false;
		int pos;
		System.out.print("Hay un total de 10 espacios para una cuenta\nQue cuenta quieres consultar?: ");
		pos = Integer.parseInt(entrada.nextLine());
		System.out.println("Cuenta numero " + pos);
		System.out.println(g.toJson(cc[pos]));
		volver = volver();
		return volver;
		//mostrarCC(cc[pos]);
	}
	private static boolean listarCuentas(CuentaCorriente[] cc) {
		boolean volver = false;
		Gson g = new GsonBuilder().setPrettyPrinting().create();

		for (int i = 1; i < cc.length; i++) {
			//mostrarCC(cc[i]);
			System.out.println("Cuenta numero " + i);
			System.out.println(g.toJson(cc[i]));
		}
		volver = volver();
		return volver;
		
	}
	private static boolean modificarDato(CuentaCorriente[] cc) {
		Scanner entrada = new Scanner(System.in);
		boolean volver = false;
		int cuenta;
		int opc;
		int opc2;
		int nuevoDatoInt;
		String nuevoDatoString;
		TipoCC tipo = null;
		System.out.println("----Menu de modificacion de dato----");
		System.out.print("Que cuenta quieres modificar?: ");
		cuenta = Integer.parseInt(entrada.nextLine());
		System.out.println("Cuenta numero " + cuenta);
		opc = menuDatoAModificar();
		switch(opc) {
		case 1: System.out.print("Nuevo saldo: "); nuevoDatoInt = Integer.parseInt(entrada.nextLine());  cc[cuenta].setSaldo(nuevoDatoInt); break;
		case 2: System.out.print("Nuevo limite de descubrimiento: "); nuevoDatoInt = Integer.parseInt(entrada.nextLine()); cc[cuenta].setLimiteDeDescubrimiento(nuevoDatoInt); break;
		case 3: 
			System.out.println("Nuevo tipo de cuenta\n 1. Credito 2. Debido 3. Black");
			opc2 = Integer.parseInt(entrada.nextLine());
			if(opc2 == 1) tipo = TipoCC.CREDITO;
			if(opc2 == 2) tipo = TipoCC.DEBITO;
			if(opc2 == 3) tipo = TipoCC.BLACK;
			cc[cuenta].setTipo(tipo);
			break;
		case 4: System.out.print("Nuevo nombre del banco:"); nuevoDatoString = entrada.nextLine(); cc[cuenta].getBanco().setNombre(nuevoDatoString); break;
		case 5: System.out.print("Nuevo capital del banco: "); nuevoDatoInt = Integer.parseInt(entrada.nextLine()); cc[cuenta].getBanco().setCapital(nuevoDatoInt); break;
		case 6: System.out.print("Nueva calle del banco: "); nuevoDatoString = entrada.nextLine(); cc[cuenta].getBanco().getDireccionPostal().setCalle(nuevoDatoString); break;
		case 7: System.out.print("Nuevo numero de la calle del banco: "); nuevoDatoInt = Integer.parseInt(entrada.nextLine()); cc[cuenta].getBanco().getDireccionPostal().setNumero(nuevoDatoInt); break;
		case 8: System.out.print("Nuevo codigo postal: "); nuevoDatoInt = Integer.parseInt(entrada.nextLine()); cc[cuenta].getBanco().getDireccionPostal().setCodPostal(nuevoDatoInt); break;
		case 9: System.out.print("Nuevo nombre del titular: "); nuevoDatoString = entrada.nextLine(); cc[cuenta].getTitular().setNombre(nuevoDatoString); break;
		case 10: System.out.print("Nuevos apellidos del titular: "); nuevoDatoString = entrada.nextLine(); cc[cuenta].getTitular().setApellidos(nuevoDatoString); break;
		case 11: System.out.print("Nuevo DNI del titular: "); nuevoDatoString = entrada.nextLine(); cc[cuenta].getTitular().setDni(nuevoDatoString); break;
		case 12: System.out.print("Nueva calle del titular: "); nuevoDatoString = entrada.nextLine(); cc[cuenta].getTitular().getDireccionFiscal().setCalle(nuevoDatoString); break;
		case 13: System.out.print("Nuevo numero de la calle del titular: "); nuevoDatoInt = Integer.parseInt(entrada.nextLine()); cc[cuenta].getTitular().getDireccionFiscal().setNumero(nuevoDatoInt); break;
		case 14: System.out.print("Nuevo codigo postal: ");nuevoDatoInt = Integer.parseInt(entrada.nextLine()); cc[cuenta].getTitular().getDireccionFiscal().setCodPostal(nuevoDatoInt); break;
		}
		
		volver = volver();
		return volver;
	}
	private static int menuDatoAModificar() {
		Scanner entrada = new Scanner(System.in);
		int opc;
		
		System.out.println("Que dato quieres modificar??");
		System.out.println("1. Saldo de la cuenta corriente");
		System.out.println("2. Limite de descubrimiento");
		System.out.println("3. Tipo de cuenta");
		System.out.println("4. Nombre del banco");
		System.out.println("5. Capital del banco");
		System.out.println("6. Calle del banco");
		System.out.println("7. Numero de la calle del banco");
		System.out.println("8. Codigo postal del banco");
		System.out.println("9. Nombre del titular");
		System.out.println("10. Apellidos del titular");
		System.out.println("11. Dni del titular");
		System.out.println("12. Calle del titular");
		System.out.println("13. Numero de la calle del titular");
		System.out.println("14. Codigo postal del titular");
		opc = Integer.parseInt(entrada.nextLine());
		return opc;
	}
	
	private static boolean volver() {
		Scanner entrada = new Scanner(System.in);
		boolean resultado = false;
		int opc;
		System.out.println("Desea volver al menú anterior?\n1. Si\n2. No");
		opc = Integer.parseInt(entrada.nextLine()); 
		switch(opc) {
		case 1: resultado = false; break;
		case 2: resultado = true;
		}
		return resultado;
	
	}
	
	private static void msgSalida() {
		System.out.println("Fin del programa. Buen dia");
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
