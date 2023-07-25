package controller;

import java.util.Arrays;

import model.Vehiculo;

public class Garaje {

	private Vehiculo[] vehiculos;

	public Garaje() {
		vehiculos = new Vehiculo[10];
	}

	public Garaje(int tamañoMaxVeh) {
		vehiculos = new Vehiculo[tamañoMaxVeh];
	}

	public boolean addVehiculo(Vehiculo v) {
		boolean resultado = false;
		for (int i = 0; i < vehiculos.length; i++) {
			if (vehiculos[i] == null) {
				vehiculos[i] = v;
				resultado = true;
				break;
			}
		}
		return resultado;
	}

	public void delVehiculo(Vehiculo v) {
		for (int i = 0; i < vehiculos.length; i++) {
			if(vehiculos[i] != null) {
				if(vehiculos[i].getNombreVehiculo().equals(v.getNombreVehiculo())) {
					vehiculos[i] = null;
					break;
				}
			}
		}
	}

	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Vehiculo[] vehiculos) {
		this.vehiculos = vehiculos;
	}

	@Override
	public String toString() {
		return "Garaje [vehiculos=" + Arrays.toString(vehiculos) + "]";
	}

}
