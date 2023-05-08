package model;

public class Ciudad {

	private String capital;
	private String cod_ine;
	private String cod_ine_m;
	private String nombre;
	private Integer tmax;
	private Integer tmin;

	public Ciudad() {
		this(null, null, null, null, null, null);
	}

	public Ciudad(String capital, String cod_ine, String cod_ine_m, String nombre, Integer tmax, Integer tmin) {
		setCapital(capital);
		setCod_ine(cod_ine);
		setCod_ine_m(cod_ine_m);
		setNombre(nombre);
		setTmax(tmax);
		setTmin(tmin);
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getCod_ine() {
		return cod_ine;
	}

	public void setCod_ine(String cod_ine) {
		this.cod_ine = cod_ine;
	}

	public String getCod_ine_m() {
		return cod_ine_m;
	}

	public void setCod_ine_m(String cod_ine_m) {
		this.cod_ine_m = cod_ine_m;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getTmax() {
		return tmax;
	}

	public void setTmax(Integer tmax) {
		this.tmax = tmax;
	}

	public Integer getTmin() {
		return tmin;
	}

	public void setTmin(Integer tmin) {
		this.tmin = tmin;
	}

	@Override
	public String toString() {
		return "Ciudad [Capital=" + getCapital() + ", cod_ine=" + getCod_ine() + ", cod_ine_m=" + getCod_ine_m()
				+ ", Nombre=" + getNombre() + ", Tmax=" + getTmax() + ", Tmin=" + getTmin() + "]";
	}

}