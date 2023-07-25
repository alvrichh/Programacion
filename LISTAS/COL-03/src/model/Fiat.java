package model;

public class Fiat extends Divisa {

	private static final long serialVersionUID = 1L;

	private String pais;

	public Fiat() {
		this("", "");
	}

	public Fiat(String nombre, String simbolo) {
		super(nombre, simbolo);
		setPais("");
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return super.toString() + "Pais=" + getPais() + "]";
	}
	
}