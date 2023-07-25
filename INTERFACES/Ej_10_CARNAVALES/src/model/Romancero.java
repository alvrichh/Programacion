package model;

public class Romancero extends Agrupacion implements Callejera {
	
	private String tematicaCartelon;
	
	public Romancero(){
		
	}

	public String getTematicaCartelon() {
		return tematicaCartelon;
	}

	public void setTematicaCartelon(String tematicaCartelon) {
		this.tematicaCartelon = tematicaCartelon;
	}
	

}
