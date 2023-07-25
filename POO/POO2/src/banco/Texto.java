package banco;

public class Texto {

	private String cadena;
	private final int LongitudMaxima = 10;
	

	
	


	public String getCadena() {
		return cadena;
	}


	public void setCadena(String cadena) {
		setCadena(cadena);
		}
	public void addCadenaDetras(String s) {
		if (getCadena().length() + s.length() <= getLongitudMaxima()) {
			setCadena(getCadena() + s);
		}
	}


	public int getLongitudMaxima() {
		return LongitudMaxima;
	}
}
