package model;

import java.util.ArrayList;
import java.util.List;

public class CCAA {

	private String id;
	private String nombre;
	private List<Provincia> provincia;

	public CCAA() {
		this(null, null, new ArrayList<Provincia>());
	}

	public CCAA(String id, String nombre) {
		this(id, nombre, new ArrayList<Provincia>());
	}

	public CCAA(String id, String nombre, List<Provincia> provincia) {
		setId(id);
		setNombre(nombre);
		setProvincia(provincia);
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

	public List<Provincia> getProvincia() {
		return provincia;
	}

	public void setProvincia(List<Provincia> provincia) {
		this.provincia = provincia;
	}
	
	public void addProvincia(Provincia p) {
		this.provincia.add(p);
	}

	@Override
	public String toString() {
		return "CCAA [Id=" + getId() + ", Nombre=" + getNombre() + "]";
	}

	
}