package banco;

public class Direccion {

	private String calle;
	private int numero;
	private int codPostal;
	
	public Direccion() {
		setCalle("Vacio");
		setNumero(0);
		setCodPostal(0);
	}
	

	public Direccion(String calle, int numero, int codPostal) {
		this.calle = calle;
		this.numero = numero;
		this.codPostal = codPostal;
	}


	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	@Override
	public String toString() {
		return "Direccion [getCalle()=" + getCalle() + ", getNumero()=" + getNumero() + ", getCodPostal()="
				+ getCodPostal() + "]";
	}

	
	
	
	
	
}
