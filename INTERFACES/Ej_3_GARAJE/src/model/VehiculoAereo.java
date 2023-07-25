package model;

public abstract class VehiculoAereo extends Vehiculo {
	
	private Integer altitudMaxima;
	private Integer altitudActual;
	private String OACI;
	
	public VehiculoAereo() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Integer getAltitudMaxima() {
		return altitudMaxima;
	}
	public void setAltitudMaxima(Integer altitudMaxima) {
		this.altitudMaxima = altitudMaxima;
	}
	public Integer getAltitudActual() {
		return altitudActual;
	}
	public void setAltitudActual(Integer altitudActual) {
		this.altitudActual = altitudActual;
	}
	public String getOACI() {
		return OACI;
	}
	public void setOACI(String oACI) {
		OACI = oACI;
	}
	

}
