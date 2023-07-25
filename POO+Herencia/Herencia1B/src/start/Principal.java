package start;

import model.Hora;
import model.Hora12;
import model.Hora12.Meridian;

public class Principal {

	public static void main(String[] args) {

		Hora12 h12 = new Hora12(11, Meridian.AM);

		System.out.println(h12);
	}

}
