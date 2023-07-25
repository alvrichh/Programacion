package model;

import java.io.Serializable;
import java.util.Objects;

public class Medicion implements Comparable<Medicion>, Serializable {

	private Integer temperatura;
	private Integer humedad;
	private Integer presion;

	public Medicion() {
		this(0, 0, 0);
	}

	public Medicion(Integer temperatura, Integer humedad, Integer presion) {
		setTemperatura(temperatura);
		setHumedad(humedad);
		setPresion(presion);
	}

	public Integer getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Integer temperatura) {
		this.temperatura = temperatura;
	}

	public Integer getHumedad() {
		return humedad;
	}

	public void setHumedad(Integer humedad) {
		this.humedad = humedad;
	}

	public Integer getPresion() {
		return presion;
	}

	public void setPresion(Integer presion) {
		this.presion = presion;
	}
	
	@Override
	public int compareTo(Medicion o) {
		return this.getTemperatura().compareTo(o.getTemperatura());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getHumedad(), getPresion(), getTemperatura());
	}

	@Override
	public boolean equals(Object obj) {
		Medicion other = (Medicion) obj;
		return Objects.equals(this.getHumedad(), other.getHumedad())
			&& Objects.equals(this.getPresion(), other.getPresion())
			&& Objects.equals(this.getTemperatura(), other.getTemperatura());
	}

	@Override
	public String toString() {
		return "[Temperatura=" + getTemperatura() + ", Humedad=" + getHumedad() + ", Presion=" + getPresion() + "]";
	}

}