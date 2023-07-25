package exam;

import java.time.LocalDateTime;

public class Alumno {

	public enum Tipo {
		NORMAL, REPETIDOR, OYENTE
	}

	private DatoPers datosP;
	private String segSoc;
	private DatoContact datosC;
	private LocalDateTime fecha;
	private Tipo tipo;

	public Alumno() {
		setDatosP(getDatosP());
		setSegSoc("");
		setDatosC(getDatosC());
		setFecha(getFecha());
		setTipo(Tipo.NORMAL);
	} 
	public Alumno(DatoPers d, String ss, DatoContact dc, LocalDateTime f, Tipo t) {
		setDatosP(d);
		setSegSoc(ss);
		setDatosC(dc);
		setFecha(f);
		setTipo(t);
	}
	public Alumno(DatoPers p) {
		
	}

	public DatoPers getDatosP() {
		return datosP;
	}

	public void setDatosP(DatoPers datosP) {
		this.datosP = datosP;
	}

	public String getSegSoc() {
		return segSoc;
	}

	public void setSegSoc(String segSoc) {
		this.segSoc = segSoc;
	}

	public DatoContact getDatosC() {
		return datosC;
	}

	public void setDatosC(DatoContact datosC) {
		this.datosC = datosC;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Alumno [datosP=" + datosP + ", segSoc=" + segSoc + ", datosC=" + datosC + ", fecha=" + fecha + ", tipo="
				+ tipo + "]";
	}

}
