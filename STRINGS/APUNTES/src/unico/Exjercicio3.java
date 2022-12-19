package unico;

public class Exjercicio3 {
	/*
	 * Escribir un programa que solicite al usuario un número de tarjeta de crédito
	 * del banco MYMONEY y que valide lo siguiente mediante un método que devuelva
	 * true/false: public static boolean validarNumeroTarjetaCredito(String ntc) El
	 * formato del número que debe ser (incluyendo los guiones) así:
	 * 2222-3333-44-0123456789 Los 4 primeros dígitos corresponde a la entidad, el
	 * banco MYMONEY, por lo que debe ser obligatoriamente igual a 2222 Los 4
	 * siguientes dígitos corresponden a la sucursal, que debe ser obligatoriamente
	 * igual a 3333. Los 2 siguientes dígitos es el número de control, que debe ser
	 * obligatoriamente igual a 44. Los 10 últimos dígitos corresponden al número de
	 * cuenta. En todas las cuentas del banco MYMONEY obligatoriamente debe ser un
	 * número primo. validarNumeroTarjetaCredito("1233342341234124123") -> false
	 * validarNumeroTarjetaCredito("1111-2222-33-0000000007") -> false
	 * validarNumeroTarjetaCredito("2222-3333-44-0000000012") -> false
	 * validarNumeroTarjetaCredito("2222-3333-44-0000000007") -> true
	 * 
	 * ATENCIÓN: Como el carácter separador de cada bloque puede ser cualquiera, NO
	 * SE PUEDE USAR SLIPT EN ESTE EJERCICIO.
	 * 
	 */

	public static void main(String[] args) {
		System.out.println(validarNumeroTarjetaCredito("2222-3333-44-0000000007"));

	}

	public static boolean validarNumeroTarjetaCredito(String ntc) {
		boolean res;
		int v;
		res = ntc.substring(0, 4).equals("2222") ? (ntc.substring(5, 9).equals("3333") ? (ntc.substring(10, 12).equals("44") ? true : false) : false): false;
//		res = ntc.charAt(5) == '-' ? (ntc.charAt(9)== '-' ? (ntc.charAt(13) == '-') :false ): false;
		String primos = ntc.substring(13, ntc.length());
		v = Integer.valueOf(primos);
		if (primos.length() != 10) {
			res = false;
			for (int i = 2; i < v; i++) {
				if (v % i == 0) {
					res = false;
				}
			}
		}
		return res;
	}
}

//		switch(ntc.substring()) {
//		
//		}
