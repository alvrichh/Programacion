package unico;

public class Texto {

	private String cadena = "";
	private int longitudMax;

	Texto(int longitudMax) {
		setLongitudMax(longitudMax);
	}

	// Metodos de la clase

	public void añadirAlPrincipio(String cadena) {
		if (cadena.length() + getCadena().length() <= longitudMax) {
			setCadena(cadena + getCadena());
		}

	}

	public void añadirAlFinal(String cadena) {
		if (cadena.length() + getCadena().length() <= longitudMax) {
			setCadena(getCadena() + cadena);
		}

	}

	public void añadirAlPrincipio(char cadena) {
		if (1 + getCadena().length() <= longitudMax) {
			setCadena(cadena + getCadena());

		}
	}

	public void añadirAlFinal(char cadena) {
		if (1 + getCadena().length() <= longitudMax) {
			setCadena(getCadena() + cadena);
		}
	}

	public int vocales() {
		int n = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o'
					|| cadena.charAt(i) == 'u') {
				n++;
			}
		}
		return n;
	}

	// Getters and setters

	public String getCadena() {
		return cadena;
	}

	private int getLongitudMax() {
		return longitudMax;
	}

	private void setLongitudMax(int longitudMax) {
		this.longitudMax = longitudMax;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	@Override
	public String toString() {
		return "Texto [cadena=" + cadena + ", longitudMax=" + longitudMax + "]";
	}

}
