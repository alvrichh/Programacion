package banco;

public class Direccion {
	private String calle;
	private String numero;
	private String codpostal;
	
	public Direccion() {
		setCalle("?");
		setNumero("?");
		setCodpostal("?");	
	}
	public Direccion(String calle, String numero, String codpostal) {
		setCalle(calle);
		setNumero(numero);
		setCodpostal(codpostal);
	}
	//======================================
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCodpostal() {
		return codpostal;
	}
	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
	}
	@Override
	public String toString() {
		return "Direccion [getCalle()=" + getCalle() + ", getNumero()=" + getNumero() + ", getCodpostal()="
				+ getCodpostal() + "]";
	}
}
