package model;

/*
 * La clase Medicion tendrá estos atributos:
temperatura, humedad, presion. Consideramos que los 3 son valores enteros.
Un constructor que reciba los valores de todos sus atributos.
Deberá incluir los métodos necesarios para poder hacer las comparaciones entre objetos de ese tipo que necesitemos para desarrollar la clase EstacionMeteorologica fácilmente.
El orden natural de los objetos de esta clase es por temperaturas ascendentes, como dijimos antes: Un objeto [temperatura=30, humedad=83, presion=1011] se considera mayor que un objeto [temperatura=15, humedad=85, presion=1000] puesto que la temperatura del primero es mayor que la del segundo.
 */

public class Medicion implements Comparable<Medicion> {
	
	private Integer temperatura; 
	private Integer humedad;
	private Integer presion;
	
	
	
	public Medicion(Integer t, Integer h, Integer p){
		setTemperatuta(t);
		setHumedad(h);
		setPresion(p);
	}
	
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatuta(Integer temperatura) {
		this.temperatura = temperatura;
	}
	public int getHumedad() {
		return humedad;
	}
	public void setHumedad(Integer humedad) {
		this.humedad = humedad;
	}
	public int getPresion() {
		return presion;
	}
	public void setPresion(Integer presion) {
		this.presion = presion;
	}
	
	@Override
	public boolean equals(Object o) {
		return(this.getTemperatura() == ((Medicion)o).getTemperatura()
				&& this.getHumedad() == ((Medicion)o).getHumedad()
				&& this.getPresion() == ((Medicion)o).getPresion());	
	}
	@Override
	public int compareTo(Medicion o) {
		return getTemperatura();
		}
	}



