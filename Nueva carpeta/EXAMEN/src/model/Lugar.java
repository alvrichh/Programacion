package model;

public class Lugar {

	private String nombre;

	public Lugar() {

	}

	public Lugar(String string) {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Lugar [getNombre()=" + getNombre() + "]";
	}

}
