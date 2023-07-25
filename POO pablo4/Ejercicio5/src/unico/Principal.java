package unico;

public class Principal {

	public static void main(String[] args) {
		Texto texto1 = new Texto(10);
		
		
		System.out.println(texto1);
		texto1.añadirAlPrincipio("pablo");
		System.out.println(texto1);
		texto1.añadirAlFinal('a');
		System.out.println(texto1);
		
		texto1.añadirAlPrincipio('d');
		System.out.println(texto1);
		
		texto1.añadirAlPrincipio("iez");
		System.out.println(texto1);


		
		
		System.out.println(texto1.vocales());
	}

}
