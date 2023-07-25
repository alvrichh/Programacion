package model;

public class Comparsa extends AgrupacionOficial {

	private String empresaAtrezzo;

	public Comparsa() {
		this("", 0, "", "", "", "", "");
	}

	public Comparsa(String empresaAtrezzo, int puntosObtenidos, String nombre, String autor, String autorMusica,
			String autorLetra, String tipo) {
		super(puntosObtenidos, nombre, autor, autorMusica, autorLetra, tipo);
		this.empresaAtrezzo = empresaAtrezzo;
	}

	public String getEmpresaAtrezzo() {
		return empresaAtrezzo;
	}

	public void setEmpresaAtrezzo(String empresaAtrezzo) {
		this.empresaAtrezzo = empresaAtrezzo;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación de la Comparsa de nombre " + getNombre();
	}

	@Override
	public String hacerTipo() {
		return "La Comparsa " + getNombre() + " va de " + getTipo();
	}

	@Override
	public String caminitoFalla() {
		return "La Comparsa " + getNombre() + " va caminito del Falla";
	}

	@Override
	public String toString() {
		return "Comparsa [getEmpresaAtrezzo()=" + getEmpresaAtrezzo() + ", toString()=" + super.toString() + "]";
	}

}
