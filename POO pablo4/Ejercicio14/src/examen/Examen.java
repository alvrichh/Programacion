package examen;

import java.util.Calendar;

public class Examen {

	private Calendar calendar;
	private Sede sede;
	private String enlaceConvocatoria;

	public Examen(Sede sede) {
		super();
		setSede(sede);
		setEnlaceConvocatoria("URL");
		// TODO Auto-generated constructor stub
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public String getEnlaceConvocatoria() {
		return enlaceConvocatoria;
	}

	public void setEnlaceConvocatoria(String enlaceConvocatoria) {
		this.enlaceConvocatoria = enlaceConvocatoria;
	}

	@Override
	public String toString() {
		return "Examen [getCalendar()=" + getCalendar() + ", getSede()=" + getSede() + ", getEnlaceConvocatoria()="
				+ getEnlaceConvocatoria() + "]";
	}

}
