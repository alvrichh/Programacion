package unico;

public class Apuntes {

	public static void main(String[] args) {
		
		
		boolean respuestaa = confirmar();
		System.out.println(respuestaa);
		
		
		//===============================================
		String resultado = convertirMayusculas("Sevillanita", 'i');
		System.out.println(resultado);
		
	}

	private static boolean confirmar() {
		boolean r = false;
		boolean salir;
		String resp;
		do {
			resp = Util.leerString("¿Confirmar?");
			switch(resp.toUpperCase()){
				case "S","SI": r = true; salir = true; break;
				case "N","NO": r = false; salir = true; break;
				default: salir = false;
			}
		}
		while(!salir);
		return r;
	}
		


	private static String convertirMayusculas(String texto, char letra) {
		String txt = "";
		
		for(int pos = 0; pos< texto.length(); pos++) {
			txt += (texto.charAt(pos)==letra) ? (""+letra).toUpperCase(): texto.charAt(pos);
		}
		return txt;
	}
	

}
