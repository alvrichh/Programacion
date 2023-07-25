package model;

import java.io.Serializable;
import java.util.Objects;

public class Unidad implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer curso;
	private String letra;

	public Unidad() {
		this(0, "");
	}

	public Unidad(Integer curso, String letra) {
		setCurso(curso);
		setLetra(letra);
	}

	public String getUnidad() {
		return getCurso() + "º" + getLetra();
	}

	public Integer getCurso() {
		return curso;
	}

	public void setCurso(Integer curso) {
		this.curso = curso;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public static Unidad convertStrToUnidad(String strUnidad) {
		final String separador = "º";
		String curso;
		String letra;
		Unidad unidad = null;

		curso = strUnidad.substring(0, strUnidad.indexOf(separador));
		letra = strUnidad.substring(strUnidad.indexOf(separador) + 1);
		unidad = new Unidad(Integer.parseInt(curso), letra);

		return unidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getUnidad());
	}

	@Override
	public boolean equals(Object obj) {
		Unidad other = (Unidad) obj;
		return Objects.equals(this.getUnidad(), other.getUnidad());
	}

	@Override
	public String toString() {
		return "Unidad [" + getUnidad() + "]";
	}

}