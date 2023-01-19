package ferroviaria.personal;

public class Maquinista {
	public enum rango {
		JEFE, AYUDANTE
		}

	private String nombre;
	private String dni;
	private double saldo;
	private rango rango;
	
	public Maquinista() {
		
	}
	
	//=========GETTERS Y SETTERS==========

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public rango getRango() {
		return rango;
	}
	public void setRango(rango rango) {
		this.rango = rango;
	}
	
	
}
