package model;

public class Arbitro {
	private Integer colegiado;
	private String nombre;
	private String ciudad;

	public Arbitro() {
	}

	public Arbitro(Integer colegiado, String nombre, String ciudad) {
		setColegiado(colegiado);
		setNombre(nombre);
		setCiudad(ciudad);
	}

	public Integer getColegiado() {
		return colegiado;
	}

	public void setColegiado(Integer colegiado) {
		this.colegiado = colegiado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Arbitro [Colegiado=" + getColegiado() + ", Nombre=" + getNombre() + ", Ciudad=" + getCiudad() + "]";
	}

}
