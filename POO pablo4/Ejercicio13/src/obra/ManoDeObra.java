package obra;

public class ManoDeObra {

	private String nombreEmpresa;
	private String descripcionTrabajo;
	private int horasRealizadas;
	private int obrerosImplicados;

	public ManoDeObra() {
		setNombreEmpresa("SINDATOS");
		setDescripcionTrabajo("SINDATOS");
		setHorasRealizadas(0);
		setObrerosImplicados(0);
	}

	public String mostrarInformacion() {
		return "\nNombre de la empresa: " + getNombreEmpresa() + "\nDescipcion del trabajo: " + getDescripcionTrabajo()
				+ "\nHoras realizadas: " + getHorasRealizadas() + "\nObreros implicados: " + getObrerosImplicados();
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getDescripcionTrabajo() {
		return descripcionTrabajo;
	}

	public void setDescripcionTrabajo(String descripcionTrabajo) {
		this.descripcionTrabajo = descripcionTrabajo;
	}

	public int getHorasRealizadas() {
		return horasRealizadas;
	}

	public void setHorasRealizadas(int horasRealizadas) {
		this.horasRealizadas = horasRealizadas;
	}

	public int getObrerosImplicados() {
		return obrerosImplicados;
	}

	public void setObrerosImplicados(int obrerosImplicados) {
		this.obrerosImplicados = obrerosImplicados;
	}

}
