package start;

import java.util.Arrays;

import model.Color;
import model.ComparacionColor;
import model.Cuadrado;
import model.PoligonoRegular;
import model.Triangulo;

public class Principal {

	public static void main(String[] args) {
		PoligonoRegular[] p = new PoligonoRegular[5];

		for (int i = 0; i < p.length; i++) {
			if ((Math.random() * 10 + 1) < 5)
				p[i] = new Triangulo();
			else {
				p[i] = new Cuadrado();
			}
		}

		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
		System.out.println(p[0].getContadorPoligonos());
		
		
		
		Triangulo[] t = new Triangulo[3];
		t[0] = new Triangulo();
		t[2] = new Triangulo(50,Color.ROJO,20);
		t[1] = new Triangulo(20,Color.AMARILLO,10);
		
		System.out.println(Arrays.toString(t));
		Arrays.sort(t);
		System.out.println(Arrays.toString(t));
		Arrays.sort(t, new ComparacionColor());
		System.out.println(Arrays.toString(t));
		
		
	}
	
	
	

}
