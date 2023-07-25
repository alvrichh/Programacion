package obra;


public class Estancia {

	private TipoEstancia tipoEstancia;

	public Estancia() {

	}

	public Estancia(TipoEstancia tipoEstancia) {
		setTipoEstancia(tipoEstancia);
	}

	public String mostrarInformacion() {
		return "Tipo de estancia: " + getTipoEstancia();
	}

	@Override
	public String toString() {
		return "Estancia [getTipoEstancia()=" + getTipoEstancia() + "]";
	}

	public TipoEstancia getTipoEstancia() {
		return tipoEstancia;
	}

	public void setTipoEstancia(TipoEstancia tipoEstancia) {
		this.tipoEstancia = tipoEstancia;
	}

}
