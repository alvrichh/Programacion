package banco;

public class Banco {

	private String nombre = "";
	private double capital;
	private String direccionCentral;
	
	Banco(String nombre){
		setNombre(nombre);
		setCapital(5200000);
		
	}

	//Metodos de la clase
	
	public void cambiarCapital(int capital) {
		setCapital(capital);
	}
	
	public void cambiarDireccionCentral(int direccionCentral) {
		setDireccionCentral(direccionCentral);
	}
	
	public void cambiarNombre(String nombre) {
		setNombre(nombre);
	}
	
	
	
	
	//Getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public String getDireccionCentral() {
		return direccionCentral;
	}

	public void setDireccionCentral(int direccionCentral2) {
		this.direccionCentral = direccionCentral;
	}

	@Override
	public String toString() {
		return "Banco: " + getNombre() + "\nCapital: " + getCapital() + "\nDireccion: "
				+ getDireccionCentral();
	}
	
	
}
