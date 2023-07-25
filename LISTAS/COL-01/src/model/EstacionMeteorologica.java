package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class EstacionMeteorologica implements Serializable {

	private List<Medicion> mediciones = new ArrayList<Medicion>();

	private Coordenada coord;

	public EstacionMeteorologica() {
		setCoord(new Coordenada());
	}

	public EstacionMeteorologica(Integer latitud, Integer longitud) {
		setCoord(new Coordenada(latitud, longitud));
	}

	public List<Medicion> getMediciones() {
		return mediciones;
	}

	public Coordenada getCoord() {
		return coord;
	}

	public void setCoord(Coordenada coord) {
		this.coord = coord;
	}

	public void addMedicion(Medicion medicion) {
		mediciones.add(medicion);
	}

	public void ordenaTemperaturasAsc() {
		Collections.sort(mediciones);
	}

	public void ordenaHumedadesDesc() {
		Collections.sort(mediciones, new CompMedicionPorHumedad().reversed());
	}

	public Integer presionMaxima() {
		return mediciones.stream().max(Comparator.comparing(Medicion::getPresion)).get().getPresion();
	}

	public boolean buscaMedicion(Medicion medicion) {
		return mediciones.contains(medicion);
	}

	public void updateTemperatura(int pos, Integer temperatura) {
		mediciones.get(pos).setTemperatura(temperatura);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getCoord());
	}

	@Override
	public boolean equals(Object obj) {
		EstacionMeteorologica other = (EstacionMeteorologica) obj;
		return Objects.equals(this.getCoord(), other.getCoord());
	}

	@Override
	public String toString() {
		return "Estación Meteorológica [Coord=" + getCoord() + " Mediciones=" + getMediciones() + "]";
	}

}