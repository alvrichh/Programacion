package model;

public class Etiqueta {

	private static int contEtiqueta = 0;
	private int idEtiqueta;
	private String cliente;
	private String direccionEnvio;

	public Etiqueta() {
		contEtiqueta++;
		setIdEtiqueta(contEtiqueta);

		this.cliente = "SINDATOS";
		this.direccionEnvio = "SINDATOS";
	}

	public Etiqueta(String cliente, String direccionEnvio) {
		super();
		contEtiqueta++;
		setIdEtiqueta(contEtiqueta);

		this.cliente = cliente;
		this.direccionEnvio = direccionEnvio;
	}

	private static int getNumEtiqueta() {
		return contEtiqueta;
	}

	private static void setNumEtiqueta(int numEtiqueta) {
		Etiqueta.contEtiqueta = numEtiqueta;
	}

	private String getCliente() {
		return cliente;
	}

	private void setCliente(String cliente) {
		this.cliente = cliente;
	}

	private String getDireccionEnvio() {
		return direccionEnvio;
	}

	private void setDireccionEnvio(String direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}

	@Override
	public String toString() {
		return "Numero de la etiqueta: " + getIdEtiqueta() + " Etiqueta [getCliente()=" + getCliente()
				+ ", getDireccionEnvio()=" + getDireccionEnvio() + "]";
	}

	public int getIdEtiqueta() {
		return idEtiqueta;
	}

	public void setIdEtiqueta(int idEtiqueta) {
		this.idEtiqueta = idEtiqueta;
	}

}
