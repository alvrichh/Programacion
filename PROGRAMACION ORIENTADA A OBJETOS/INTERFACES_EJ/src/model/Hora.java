package model;

public class Hora {

	private Integer hora;
	private Integer minutos;

	public Hora() {
	}

	public Hora(Integer h, Integer min) {
		setHora(h);
		setMinutos(min);
	}

	public void inc() {
		if (getMinutos() + 1 > 59) {
			setMinutos(0);
			if (getHora() + 1 > 23) {
				setHora(0);
			} else {
				setHora(getHora() + 1);
			}
		} else {
			setMinutos(getMinutos() + 1);
		}
	}

	public Integer getHora() {
		return hora;
	}

	@Override
	public String toString() {
		String str = "";
		str += getHora() < 10 ? "0" + getHora() : getHora();
		str += ":";
		str += getMinutos() < 10 ? "0" +getMinutos() : getMinutos();
		return str;
	}
	public int compareTo(Hora obj) { //COMPARE TO SOLAMENTE CON ATRIBUTOS PRIMITIVOS SORRY
		int ret;
		
		ret = this.getHora().compareTo(obj.getHora());
		if( ret == 0) {
			ret = this.getMinutos().compareTo(obj.getMinutos());
		}
		return ret;
	}

	public void setHora(Integer hora) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
	}

	public Integer getMinutos() {
		return minutos;
	}

	public void setMinutos(Integer minutos) {
		if (minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
		}
	}
	

}
