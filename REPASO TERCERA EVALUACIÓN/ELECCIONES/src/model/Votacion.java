package model;

public class Votacion {
	
	private String municipio;
	private String partido;
	private Integer votos;
	
	public Votacion() {
		
	}
	public Votacion(String municipio, String partido, Integer votos) {
		setMunicipio(municipio);
		setPartido(partido);
		setVotos(votos);
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public Integer getVotos() {
		return votos;
	}
	public void setVotos(Integer votos) {
		this.votos = votos;
	}
	
	

}
