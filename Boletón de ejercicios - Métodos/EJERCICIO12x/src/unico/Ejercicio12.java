package unico;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		
		boolean sobrepasa;
		int n1;
		int n2;
		int n3;
		String mensaje;
				
		n1 = Util.leerInt("Indica el numero 1");
		n2 = Util.leerInt("Indica el numero 2");
		n3 = Util.leerInt("Indica el numero 3");
		
		sobrepasa = conversion(n1,n2,n3);
		mensaje = sobrepasa ? "Sobrepasa las 24h" : "No sobrepasa las 24h";
		System.out.println(mensaje);
	}

	private static boolean conversion(int n1, int n2, int n3) {
		boolean sobrepasa;
		int n1Base;
		int n2Base;
		int n3Base;
		
		
		sobrepasa = false;
		n1Base = n1;
		n2Base = n2;
		n3Base = n3;
		
		while(n3 > 60) {
			n2++;
			n3-= 60;
		}
		while(n2 > 60) {
			n1++;
			n2-=60;
		}
		if(n1 >= 24) {
			n1 = 0;
			n2 = 0;
			n3 = 0;
			sobrepasa = true;
		}
		
		System.out.println("dada la medida de " + n1Base + "h " + n2Base + "m " + n3Base + "s,"
				+ "la función deberá mostrar " + n1 + "h " + n2 + "m " + n3 + "s");
		
		
		return sobrepasa;
	}

}
