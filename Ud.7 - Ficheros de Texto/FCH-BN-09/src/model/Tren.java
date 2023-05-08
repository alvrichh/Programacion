package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Tren implements Serializable {

	private String nombre;
	private Integer capacidad;

	public Tren(String nombre, Integer capacidad) {
		setNombre(nombre);
		setCapacidad(capacidad);
	}
	/*
	 * En este ejemplo, la clase Tren implementa la interfaz Serializable. 
	 * Esto significa que los objetos de esta clase se pueden guardar en un
	 * archivo o enviar a través de una red. 
	 * Para hacer esto, se puede usar un ObjectOutputStream para escribir 
	 * el objeto en un archivo o enviarlo a través de una red, y
	 * luego un ObjectInputStream para leer el objeto desde el archivo o la red.

	En resumen, la interfaz Serializable se utiliza en Java para marcar una clase como serializable,
	lo que permite guardar y enviar objetos de la clase en forma de secuencia de bytes.
	 */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Tren [Nombre=" + getNombre() + ", Capacidad=" + getCapacidad() + "]";
	}

}