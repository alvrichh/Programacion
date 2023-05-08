package model.bco;

public class Direccion {

	private String calle;
	private Integer numero;
	private String codPost;

	public Direccion() {
		setCalle("");
		setNumero(0);
		setCodPost("");
	}

	public Direccion(String calle, Integer numero, String codPost) {
		setCalle(calle);
		setNumero(numero);
		setCodPost(codPost);
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCodPost() {
		return codPost;
	}

	public void setCodPost(String codPost) {
		this.codPost = codPost;
	}

	@Override
	public String toString() {
		return "Direccion [getCalle()=" + getCalle() + ", getNumero()=" + getNumero() + ", getCodPost()=" + getCodPost()
				+ "]";
	}

}