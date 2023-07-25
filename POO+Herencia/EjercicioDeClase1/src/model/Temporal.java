package model;

public class Temporal extends Empleado{

	private String fechaInicio;
	private String fechaFinal;
	
	public Temporal() {
		super();
	}
	
	public Temporal(String fechaInicio, String fechaFinal,double sueldo, String nombre, String direccion, String dni) {
		super(sueldo,nombre,direccion,dni);
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	@Override
	public String toString() {
		return "Temporal [fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", getSueldo()=" + getSueldo()
				+ ", getNombre()=" + getNombre() + ", getDireccion()=" + getDireccion() + ", getDni()=" + getDni()
				+ "]";
	}
	
	
	
	
	
	
}
