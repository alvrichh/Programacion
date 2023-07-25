package model;

public class Hora12 extends Hora {

	public enum Meridian {
		AM, PM
	};

	private Meridian meridian;

	public Hora12() {

		super();
		setMeridian(Meridian.AM);
	}

	public Hora12(int hora, int mint) {
		setMeridian(meridian);
		super.setMinutos(0);
		if (hora < 0 || hora > 12) {
			hora = 0;
		}
		if (meridian == Meridian.PM) {
			super.setHora(hora + 12);
		} else {
			super.setHora(hora);

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
