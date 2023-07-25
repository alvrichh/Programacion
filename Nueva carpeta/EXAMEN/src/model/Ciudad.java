package model;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {

	private String nombre;
	private Integer numTotalHabitantes;
	List<Lugar> lugares;

	public Ciudad(String nombre, int habitantes) {
		setNombre(nombre);
		setNumTotalHabitantes(numTotalHabitantes);
		lugares = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumTotalHabitantes() {
		return numTotalHabitantes;
	}

	public void setNumTotalHabitantes(Integer numTotalHabitantes) {
		this.numTotalHabitantes = numTotalHabitantes;
	}
	public void setLugares(List<Lugar> lugares) {
		this.lugares = lugares;
		
	}
	public List<String> getLugares() {
		return getLugares();
	}
	@Override
	public String toString() {
		return "Ciudad [getNombre()=" + getNombre() + ", getNumTotalHabitantes()=" + getNumTotalHabitantes() + "]";
	}


}
