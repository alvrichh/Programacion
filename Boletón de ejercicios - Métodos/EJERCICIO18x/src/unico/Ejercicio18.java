package unico;

public class Ejercicio18 {

	public static void main(String[] args) {
		String opc;
		String mensaje;
		opc = Util.leerString("Indica un numero del mes o su nombre");
		
		mensaje = calculoMes(opc);
		System.out.println(mensaje);
	}

	private static String calculoMes(String opc) {
		String mensaje;
		
		mensaje = "";
		
		switch(opc) {
		case "1":
		case "Enero": mensaje = "Enero, con 31 días" ; break;
		case "2":
		case "Febrero": mensaje = "Febrero, con 28 días"; break;
		case "3":
		case "Marzo": mensaje = "Marzo, con 31 días"; break;
		case "4":
		case "Abril": mensaje = "Abril, con 30 días"; break;
		case "5":
		case "Mayo": mensaje = "Mayo, con 31 días"; break;
		case "6":
		case "Junio": mensaje = "Junio, con 30 días"; break;
		case "7":
		case "Julio": mensaje = "Julio, con 31 días"; break;
		case "8":
		case "Agosto": mensaje = "Agosto, con 31 días"; break;
		case "9":
		case "Septiembre": mensaje = "Septiembre, con 30 días"; break;
		case "10":
		case "Octubre": mensaje = "Octubre, con 31 días"; break;
		case "11":
		case "Noviembre": mensaje = "Noviembre, con 30 días"; break;
		case "12":
		case "Diciembre": mensaje = "Diciembre, con 31 días"; break;
		}
		
		return mensaje;
		
	}

}
