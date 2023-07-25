package controller;

import model.Vehiculo;

public class Garaje {

	private Vehiculo[] almacen;

	public Garaje() {
		this(10);
	}

	public Garaje(int capacidad) {
		almacen = new Vehiculo[capacidad];
		for (int i = 0; i < almacen.length; i++) {
			almacen[i] = null;
		}
	}

	public boolean anadirVehiculo(Vehiculo v) {
		boolean isOK;
		isOK = true;
		for (int i = 0; i < almacen.length; i++) {
			if (almacen[i] != null && almacen[i].equals(v)) {
				isOK = false;
				break;
			}
		}
		if (isOK) {
			isOK = false;
			for (int i = 0; i < almacen.length; i++) {
				if (almacen[i] == null) {
					almacen[i] = v;
					isOK = true;
					break;
				}
			}
		}
		return isOK;
	}
	public boolean sacarVehiculo(Vehiculo v) {
		boolean isOK = false;
		for (int i = 0; i < almacen.length; i++) {
			if (almacen[i].equals(v)) {
				almacen[i] = null;
				isOK = true;
				break;
			}
		}
		return isOK;
	}
	public Vehiculo[] verVehiculos() {
		return almacen;
	}
}
