package model;

public class Hora12 extends Hora {
	public enum Meridian {
		AM, PM;
	};

	private Meridian meridian;

	public Hora12() {
		super(0, 0);
		setMeridian(Meridian.AM);

	}

	public Hora12(int hora, Meridian meridian) {
		setMeridian(meridian);
		if (meridian == Meridian.PM)
			setHora(hora + 12);
		else {
			setHora(hora);
		}
		setMinuto(0);
	}

	public Meridian getMeridian() {
		return meridian;
	}

	public void setMeridian(Meridian meridian) {
		this.meridian = meridian;
	}

}
