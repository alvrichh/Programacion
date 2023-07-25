package model;

public class Perro {

	private String raza;
	private Double peso;
	private Double altura;
	
	
	/*public Perro() {
		setRaza("");
		setAltura(0.0);
		setPeso(0.0);
	}*/
	public Perro(String raza, Double peso, Double altura) throws IllegalAccessException {
		setRaza(raza);
		setAltura(altura);
		setPeso(peso);
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) throws IllegalAccessException {
		if (raza == null || raza.isEmpty()){
			throw new IllegalArgumentException("La raza del perro no puede estar vacía. ");
		}
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Perro [getRaza()=" + getRaza() + ", getPeso()=" + getPeso() + ", getAltura()=" + getAltura() + "]";
	}
	
	
}
