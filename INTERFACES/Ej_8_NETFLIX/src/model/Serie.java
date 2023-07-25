package model;

public class Serie extends Multimedia implements Reproducible {

	private String creador;
	private Integer numTemporadas;
	private String[] capitulo;
	
	public Serie() {
		super();
		setNumTemporadas(1);
		setCapitulo(new String[10]);
		
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String[] getCapitulo() {
		return capitulo;
	}

	public void setCapitulo(String[] capitulo) {
		this.capitulo = capitulo;
	}

	public Integer getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(Integer numTemporadas) {
		this.numTemporadas = numTemporadas;
	}
}
