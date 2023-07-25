package unico;

public class Principal {

	public static void main(String[] args) {

		
		Emisora emisora1 = new Emisora();
		
		emisora1.down();
		emisora1.down();
		
		System.out.println("La frecuencia actual es: " + emisora1.display());

		
		
		
	}

}
