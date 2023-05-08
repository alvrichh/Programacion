package model;

import java.util.ArrayList;
import java.util.List;

public class Provincia {

	private String ccaa;
	private String id;
	private String nombre;
	private List<Ciudad> ciudad;

	public Provincia() {
		this(null, null, null, new ArrayList<Ciudad>());
	}

	public Provincia(String ccaa, String id, String nombre) {
		this(ccaa, id, nombre, new ArrayList<Ciudad>());
	}

	public Provincia(String ccaa, String id, String nombre, List<Ciudad> ciudad) {
		setCcaa(ccaa);
		setId(id);
		setNombre(nombre);
		setCiudad(ciudad);
	}

	public String getCcaa() {
		return ccaa;
	}

	public void setCcaa(String ccaa) {
		this.ccaa = ccaa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Ciudad> getCiudad() {
		return ciudad;
	}

	public void setCiudad(List<Ciudad> ciudad) {
		this.ciudad = ciudad;
	}
	
	public void addCiudad(Ciudad c) {
		this.ciudad.add(c);
	}

	@Override
	public String toString() {
		return "Provincia [CCAA=" + getCcaa() + ", Id=" + getId() + ", Nombre=" + getNombre() + "]";
	}
	
}