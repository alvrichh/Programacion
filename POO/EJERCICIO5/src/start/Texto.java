package start;

public class Texto {

	private String cadena;
	private int longitudMaxima;

	public Texto(int longitudMaxima) {
		setLongitudMaxima(longitudMaxima);
	}

	public void addCaracterAntes(char c) {

		if (getCadena().length() + 1 <= getLongitudMaxima() + 1) {

			setCadena(c + getCadena());
		}
	}

	public void addCaracterDetras(char c) {
		if (getCadena().length() + 1 <= getLongitudMaxima() + 1) {
			setCadena(getCadena() + c);
		}
	}

	public void addCadenaAntes(String s) {

		if (getCadena().length() + 1 <= getLongitudMaxima() + 1) {

			setCadena(s + getCadena());
		}
	}

	public void addCadenaDetras(String s) {
		if (getCadena().length() + 1 <= getLongitudMaxima() + 1) {
			setCadena(getCadena() + s);
		}
	}
	//CONTADOR DE VOCALES AQUÍ
	public int totalVocales() {
		int cont = 0;
		for(int pos = 0; pos < getCadena().length(); pos++) {
			String letra = "" + getCadena().charAt(pos);
			if(        letra.equalsIgnoreCase("A") 
					|| letra.equalsIgnoreCase("E")
					|| letra.equalsIgnoreCase("I")
					|| letra.equalsIgnoreCase("O")
					|| letra.equalsIgnoreCase("U")
				) {
		cont ++;
			}
		}
		return cont;
		
	}
	
	

	@Override
	public String toString() {
		return "Texto [cadena=" + cadena + ", longitudMaxima=" + longitudMaxima + "]";
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	private int getLongitudMaxima() {
		return longitudMaxima;
	}

	private void setLongitudMaxima(int longitudMaxima) {
		this.longitudMaxima = longitudMaxima;
	}
}