package start;


enum TipoPersonaje{
	SONIC, TAILS, KNUCKLES;
}
public class Personaje {
	
	private double velocidadMovimiento;
	private double dañoPuñetazo;
	private double dañoPatada;
	private TipoPersonaje tipoPersonaje;
	
	public Personaje(){
		setTipoPersonaje(TipoPersonaje.SONIC);
		setVelocidadMovimiento(100.00);
		setDañoPuñetazo(100);
		setDañoPatada(200);
	}
	public Personaje(TipoPersonaje tipoPersonaje) {
		setTipoPersonaje(tipoPersonaje);
		setVelocidadMovimiento(100.00);
		setDañoPuñetazo(100);
		setDañoPatada(200);
	}
	
	//Metodos
	public String infoPersonaje() {
		return "El personaje es tipo: " + getTipoPersonaje() + "\nVelocidad de movimiento: " + getVelocidadMovimiento() + "\nDaño por puñetazo: " + 
				getDañoPuñetazo() + "\nDaño por patada: " + getDañoPatada();
	}

	public double getVelocidadMovimiento() {
		return velocidadMovimiento;
	}

	public void setVelocidadMovimiento(double velocidadMovimiento) {
		this.velocidadMovimiento = velocidadMovimiento;
	}

	public double getDañoPuñetazo() {
		return dañoPuñetazo;
	}

	public void setDañoPuñetazo(double dañoPuñetazo) {
		this.dañoPuñetazo = dañoPuñetazo;
	}

	public double getDañoPatada() {
		return dañoPatada;
	}

	public void setDañoPatada(double dañoPatada) {
		this.dañoPatada = dañoPatada;
	}

	public TipoPersonaje getTipoPersonaje() {
		return tipoPersonaje;
	}

	public void setTipoPersonaje(TipoPersonaje tipoPersonaje) {
		this.tipoPersonaje = tipoPersonaje;
	}
	
	
	
	
	

}
