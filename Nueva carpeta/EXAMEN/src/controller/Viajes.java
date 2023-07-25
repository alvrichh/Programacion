package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.*;

public class Viajes {

	private Map<String, Pais> paises;

	public Viajes() {
		this.paises = new HashMap<>();
	}

	public boolean addPais(Pais pais) {
		boolean a = false;
		if (!this.paises.containsKey(pais.getNombre())) {
			this.paises.put(pais.getNombre(), pais);
			a= true;
		}
		return a;
	}

	public void addCiudad(String paisNombre, Ciudad ciudad) {
		if (this.paises.containsKey(paisNombre)) {
			this.paises.get(paisNombre).getCiudades().add(ciudad);
		}
	}

	public void addLugar(String paisNombre, String ciudadNombre, String lugar) {
		if (this.paises.containsKey(paisNombre)) {
			Pais pais = this.paises.get(paisNombre);
			for (Ciudad ciudad : pais.getCiudades()) {
				if (ciudad.getNombre().equals(ciudadNombre)) {
					ciudad.getLugares().add(lugar);
					break;
				}
			}
		}
	}

	public List<String> getCiudades(String paisNombre) {
		List<String> ciudades = new ArrayList<>();
		if (this.paises.containsKey(paisNombre)) {
			for (Ciudad ciudad : this.paises.get(paisNombre).getCiudades()) {
				ciudades.add(ciudad.getNombre());
			}
		}
		return ciudades;
	}

	public List<String> getLugares(String ciudadNombre) {
		List<String> lugares = new ArrayList<>();
		for (Pais pais : this.paises.values()) {
			for (Ciudad ciudad : pais.getCiudades()) {
				if (ciudad.getNombre().equals(ciudadNombre)) {
					for (String lugar : ciudad.getLugares()) {
						lugares.add(lugar.getNombre());
					}
					break;
				}
			}
		}
		lugares.sort(String::compareToIgnoreCase);
		return lugares;
	}

	public String getUbicacion(String lugarNombre) { //lugar es lugar y ya, luego tiene dentro su nombre
		for (Pais pais : this.paises.values()) {
			for (Ciudad ciudad : pais.getCiudades()) {
				for (Lugar lugar : ciudad.getLugares()) {
					if (lugar.getNombre().equals(lugarNombre)) {
						return ciudad.getNombre() + " (" + pais.getNombre() + ")";
					}
				}
			}
		}
		return "";
	}

	public List<Ciudad> getCiudadesConHabitantes(String paisNombre, int habitantes) {
		List<Ciudad> ciudades = new ArrayList<>();
		if (this.paises.containsKey(paisNombre)) {
			for (Ciudad ciudad : this.paises.get(paisNombre).getCiudades()) {
				if (ciudad.getNumTotalHabitantes() < habitantes) {
					ciudades.add(ciudad);
				}
			}
			ciudades.sort((c1, c2) -> Integer.compare(c1.getNumTotalHabitantes(), c2.getNumTotalHabitantes()));
		}
		return ciudades;
	}
}