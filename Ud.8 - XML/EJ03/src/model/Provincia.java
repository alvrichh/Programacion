package model;

import java.util.List;

public class Provincia {
	String ccaa;
	Integer id;
	String nombre;
	List<Ciudad> Ciudad;

	public String getCcaa() {
		return ccaa;
	}
	public void setCcaa(String ccaa) {
		this.ccaa = ccaa;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Ciudad> getCiudad() {
		return Ciudad;
	}
	public void setCiudad(List<Ciudad> ciudad) {
		Ciudad = ciudad;
	}
}
