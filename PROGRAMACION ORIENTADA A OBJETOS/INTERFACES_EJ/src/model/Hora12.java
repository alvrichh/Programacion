package model;

public class Hora12 extends Hora {

	public enum Meridian {
		AM, PM
	};

	private Meridian meridian;

	public Hora12() {
		setMeridian(Meridian.AM);
		setHora(0);
		setMinutos(0);
	}

	public Hora12(int hora, int mint) {
		if (hora < 0 || hora > 12) {
			setHora(0);
			setMeridian(Meridian.AM);
			
		} else {
			
			setMinutos(0);
			setMeridian(Meridian.PM);

		}
	}

	public Meridian getMeridian() {
		return meridian;
	}

	public void setMeridian(Meridian meridian) {
		this.meridian = meridian;
	}

	@Override
	public String toString() {
		return super.toString() + " " + getMeridian();
	}
}
