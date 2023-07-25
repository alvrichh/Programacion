package model;

public class Prueba {
	
	//SI ES STATIC, LA MEMORIA SE SOBRE ESCRIBE.
	//SOLO TIENE UNA VEZ SOLO EXISTE UNA VARIABLE V
	public static int cont = 0;
	
	
	
	public static int v;
	
	public int a;
	
	public Prueba() {
		cont++;
		
	}
	public int getCont(){
		return cont;
	}

}
