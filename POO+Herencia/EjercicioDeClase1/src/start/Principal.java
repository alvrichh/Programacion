package start;

import model.Asiatico;
import model.Europeo;
import model.Fijo;
import model.Internacional;
import model.Nacional;
import model.Temporal;

public class Principal {

	public static void main(String[] args) {

		Fijo f = new Fijo("Contratop", 200, "pepe", "c. FEnicios", "343434B");
		Temporal t = new Temporal("22/05/2002", "2323-2-3", 200, "pepe", "c. FEnicios", "343434B");

		Internacional asi = new Asiatico("Dictadura", "España", "Cuentajeje", "Pablo", "FEnicios", "344353B");
		Internacional eu = new Europeo("Dictadura", "España", "Cuentajeje", "Pablo", "FEnicios", "344353B");
		Nacional n = new Nacional("Andalucia", "Cuenta2", "luis", "San uaun de dios", "23455343P");

		System.out.println(eu);
		System.out.println(n.preMax());

	}

}
