package start;

public class Principal_Emisora {

	public static void main(String[] args) {

		SintonizadorFM radio = new SintonizadorFM();
		
		System.out.println(radio.display());
	}
}
