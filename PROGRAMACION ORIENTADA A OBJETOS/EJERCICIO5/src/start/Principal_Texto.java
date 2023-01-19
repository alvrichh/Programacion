package start;

public class Principal_Texto {

	public static void main(String[] args) {

		Texto txt = new Texto(10);
		txt.setCadena("Hola");
		txt.setCadena("HolaHolaHolaHolaHolaHolaHola");
		System.out.println("VOCALES = " + txt.totalVocales());
		System.out.println(txt);
	}
}
