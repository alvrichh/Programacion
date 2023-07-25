package model;

public class HoraExacta extends Hora {
	private int segundo;
	
	public HoraExacta() {
		
	}

	public Integer getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = (segundo >= 0 && segundo <= 59 ) ? segundo : 0;
	}

	@Override
	public String toString() {
		String str = "";
		str += getSegundo() < 10 ? "0" + getSegundo() : getSegundo();
		return super.toString() + ":" + str;
	}
	public int compareTo(HoraExacta obj) {
		int ret ;
		ret = getHora().compareTo(obj.getHora());
		if (ret == 0) {
			ret = getMinutos().compareTo(obj.getMinutos());
			if (ret == 0) {
				ret = getSegundo().compareTo(obj.getSegundo());
			}			
		}
		return ret;
	}
	
	
}
