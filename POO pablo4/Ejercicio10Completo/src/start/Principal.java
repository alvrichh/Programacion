package start;

public class Principal {

	public static void main(String[] args) {
		
		Hora hora1 = new Hora(24,34,2);
		
		System.out.println(hora1);

		hora1.sumarSegundos(6000);
		System.out.println();
		System.out.println(hora1);
		
	}

}
