package model;

public class Coordenadas {

	private int longitud;
	private int latitud;
	
	
	Coordenadas(){
		
	}
	Coordenadas(int longitud, int latitud){
		setLatitud(latitud);
		setLongitud(longitud);
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public int getLatitud() {
		return latitud;
	}
	public void setLatitud(int latitud) {
		this.latitud = latitud;
	}
}
