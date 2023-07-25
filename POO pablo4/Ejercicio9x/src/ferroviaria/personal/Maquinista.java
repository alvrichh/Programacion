package ferroviaria.personal;

enum Rango{
	JEFE, AYUDANTE;
}

public class Maquinista {
	
	private String nombreCompleto;
	private String dni;
	private double sueldoMensual;
	private Rango rango;
	
	
	
	public Maquinista() {
		
	}



	public String getNombreCompleto() {
		return nombreCompleto;
	}



	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public double getSueldoMensual() {
		return sueldoMensual;
	}



	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}



	public Rango getRango() {
		return rango;
	}



	public void setRango(Rango rango) {
		this.rango = rango;
	}



	@Override
	public String toString() {
		return "Maquinista [getNombreCompleto()=" + getNombreCompleto() + ", getDni()=" + getDni()
				+ ", getSueldoMensual()=" + getSueldoMensual() + ", getRango()=" + getRango() + "]";
	}
	
	
	
	

}
