package banco;

public class Banco {

	private String nombre = "";
	private double capital;
	private String direccionCentral;
	
	public Banco(String nombre){
		setNombre(nombre);
		setCapital(5200000);
		
	}

	//Metodos de la clase

	
	
	
	
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

	public void setDireccionCentral(String direccionCentral) {
		this.direccionCentral = direccionCentral;
	}

	@Override
	public String toString() {
		return "Banco: " + getNombre() + "\nCapital: " + getCapital() + "\nDireccion: "
				+ getDireccionCentral();
	}
	
	
}
