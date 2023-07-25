package model;

import java.io.Serializable;
import java.util.Objects;

public class Coordenada implements Serializable {

	private Integer latitud;
	private Integer longitud;

	public Coordenada() {
		this(0, 0);
	}

	public Coordenada(Integer latitud, Integer longitud) {
		setLatitud(latitud);
		setLongitud(longitud);
	}

	public Integer getLatitud() {
		return latitud;
	}

	public void setLatitud(Integer latitud) {
		this.latitud = latitud;
	}

	public Integer getLongitud() {
		return longitud;
	}

	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getLatitud(), getLongitud());
	}

	@Override
	public boolean equals(Object obj) {
		Coordenada other = (Coordenada) obj;
		return Objects.equals(this.getLatitud(), other.getLatitud())
			&& Objects.equals(this.getLongitud(), other.getLongitud());
	}

	@Override
	public String toString() {
		return "<Latitud=" + getLatitud() + ", Longitud=" + getLongitud() + ">";
	}

}