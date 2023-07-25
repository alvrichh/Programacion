package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Criptomoneda extends Divisa {

	private static final long serialVersionUID = 1L;
	
	private Double precioUSD;
	private Long volumen24;
	private Date fechaCreacion;
	private Integer ranking;

	public Criptomoneda() {
		this("", "");
	}

	public Criptomoneda(String nombre, String simbolo) {
		super(nombre, simbolo);
		setPrecioUSD(0.0);
		setVolumen24(0L);
		setFechaCreacion(new Date());
		setRanking(0);
	}

	public Double getPrecioUSD() {
		return precioUSD;
	}

	public void setPrecioUSD(Double precioUSD) {
		this.precioUSD = precioUSD;
	}

	public Long getVolumen24() {
		return volumen24;
	}

	public void setVolumen24(Long volumen24) {
		this.volumen24 = volumen24;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String date = simpleDateFormat.format(getFechaCreacion());
		
		return super.toString() + "PrecioUSD=" + getPrecioUSD() + ", Volumen24=" + getVolumen24() + ", FechaCreacion="
				+ date + ", Ranking=" + getRanking() + "]";
	}

}