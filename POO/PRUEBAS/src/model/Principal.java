package model;

public class Principal {

	public static void main(String[] args) {

		hacerTest();
	
	}

	private static void hacerTest() {
		Prueba p1 = new Prueba();

		Prueba p2 = new Prueba();
		
		p1.v = 2;
		
		p1.a = 20;
		
		p2.v = 3;
		p2.a = 30;
		
		System.out.println(p1.v);
		System.out.println(p2.v);
		
		
	
		System.out.println(p1.a);
		System.out.println(p2.a);
	}

}
