package model;

import java.util.ArrayList;
import java.util.List;

//EL PAÍS SOLO CON SABER SU NOMBRE YA SE SABRÁ TODAS LAS DEMÁS COSAS COMO
//CIUDADES Y LUGARES FAMOSOS, ENTONCES PAIS DEBE SER OTRA COSA

public class Pais {

	private String nombre;
	
    List<Ciudad> ciudades;
	
    public Pais(String nombre) {
        setNombre(nombre);
        ciudades = new ArrayList<>();
    }

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Pais [getNombre()=" + getNombre() + "]";
	}


	public List<Ciudad> getCiudades() {
		return ciudades;
	}


	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

	

	
}
