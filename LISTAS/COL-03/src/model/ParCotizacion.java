package model;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Objects;

public class ParCotizacion implements Serializable {

	private static final long serialVersionUID = 1L;

	private Divisa divBase;
	private Divisa divCotizada;
	private Double precio;
	private Double variacion;

	public ParCotizacion() {
		this(new Divisa(), new Divisa());
	}

	public ParCotizacion(Divisa divBase, Divisa divCotizada) {
		setDivBase(divBase);
		setDivCotizada(divCotizada);
		setPrecio(0.0);
		setVariacion(0.0);
	}

	public Divisa getDivBase() {
		return divBase;
	}

	public void setDivBase(Divisa base) {
		this.divBase = base;
	}

	public Divisa getDivCotizada() {
		return divCotizada;
	}

	public void setDivCotizada(Divisa cotizada) {
		this.divCotizada = cotizada;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getVariacion() {
		return variacion;
	}

	public void setVariacion(Double variacion) {
		this.variacion = variacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getDivBase(), this.getDivCotizada());
	}

	@Override
	public boolean equals(Object obj) {
		ParCotizacion other = (ParCotizacion) obj;
		return (Objects.equals(this.getDivBase(), other.getDivBase()) && Objects.equals(this.getDivCotizada(), other.getDivCotizada()))
			|| (Objects.equals(this.getDivBase(), other.getDivCotizada()) && Objects.equals(this.getDivCotizada(), other.getDivBase()));
	}

	@Override
	public String toString() {
		// Ajustando el número de decimales
		String precio;
		String variacion;
		DecimalFormat decimals2 = new DecimalFormat("0.00");
		DecimalFormat decimals4 = new DecimalFormat("+#,##0.0000;-#");
		precio = decimals2.format(this.getPrecio());
		variacion = decimals4.format(this.getVariacion());
		return "ParCotizacion [Base:" + this.getDivBase().getSimbolo() + ", Cotizada:" + this.getDivCotizada().getSimbolo() + ", Precio:" + precio + " Variacion: " + variacion + "]";
	}

}