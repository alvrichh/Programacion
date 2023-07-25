package banco;

public class Banco {

	private String nombre;
	private double capital;
	private Direccion direccionPostal;
	
	Banco(){
		setDireccionPostal(new Direccion());
		setNombre("Vacio");
		setCapital(0);
	}
	
	
	public Banco(String nombre, double capital, Direccion direccionPostal) {
		this.nombre = nombre;
		this.capital = capital;
		this.direccionPostal = direccionPostal;
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



	public Direccion getDireccionPostal() {
		return direccionPostal;
	}

	public void setDireccionPostal(Direccion direccionPostal) {
		this.direccionPostal = direccionPostal;
	}

	@Override
	public String toString() {
		return "Banco [getNombre()=" + getNombre() + ", getCapital()=" + getCapital() + ", \ngetDireccionPostal()="
				+ getDireccionPostal() + "]\n";
	}

	
	
	
}
