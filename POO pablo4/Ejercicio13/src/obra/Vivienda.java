package obra;

public class Vivienda {

	private String direccion;
	private int metrosCuadrados;
	Estancia[] estancia;

	public Vivienda() {
		setDireccion("SINDATOS");
		setMetrosCuadrados(0);
		estancia = new Estancia[10];
	}

	public void insertarEstancia(TipoEstancia tipoEstancia) {
		for (int i = 0; i < estancia.length; i++) {
			if (estancia[i] == null) {
				estancia[i] = new Estancia(tipoEstancia);
				i = estancia.length;
			}

		}
	}

	public void eliminarEstancia(int pos) {
		estancia[pos] = null;
	}

	public String verEstancias() {
		String resultado = "";
		for (int i = 0; i < estancia.length; i++) {
			if (estancia[i] != null)
				resultado += "\n" + estancia[i].mostrarInformacion();

		}
		return resultado;
	}

	public String mostrarInformacion() {
		return "Direccion: " + getDireccion() + "\nMetros Cuadrados: " + getMetrosCuadrados() + "\nEstancias: "
				+ verEstancias();

	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public Estancia[] getEstancia() {
		return estancia;
	}

	public void setEstancia(Estancia[] estancia) {
		this.estancia = estancia;
	}

}
