package ferroviaria.personal;

public class Mecanico {

	public enum especialidad {
		FRENOS, HIDRAULICA, ELECTRICIDAD

	}

	private String nombre;
	private String tlf;
	private especialidad esp;

	public Mecanico() {
	}

	// =========GETTERS Y SETTERS==========
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public especialidad getEsp() {
		return esp;
	}

	public void setEsp(especialidad esp) {
		this.esp = esp;
	}
}
