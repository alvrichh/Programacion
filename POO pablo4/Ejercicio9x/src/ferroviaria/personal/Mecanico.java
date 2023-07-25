package ferroviaria.personal;

enum Especialidad {
	FRENOS, HIDRAULICA, ELECTRICIDAD;
}

public class Mecanico {

	private String nombreCompleto;
	private String numeroTelefono;
	private Especialidad especialidad;
	
	public Mecanico() {
		
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Mecanico [getNombreCompleto()=" + getNombreCompleto() + ", getNumeroTelefono()=" + getNumeroTelefono()
				+ ", getEspecialidad()=" + getEspecialidad() + "]";
	}
	
	
}
