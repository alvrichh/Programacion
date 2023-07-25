package model;

public class Aprobado implements Comparable <Aprobado>{

	private String nombre;
	private String dni;
	private Double media;

	public Aprobado(String nombre, String dni, Double media) {
		setNombre(nombre);
		setDNI(dni);
		setMedia(media);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return dni;
	}

	public void setDNI(String dni) {
		this.dni = dni;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	@Override
	public int compareTo(Aprobado o) {
		return getNombre().compareToIgnoreCase(o.getNombre());
	}
}