package model;

import java.util.Arrays;

public class Vivienda extends Propiedad{

	private int nBaños;
	private int nHabitaciones;
	private int capacidadMax;
	private double precio;
	private Persona[] personasViviendo;

	public Vivienda() {
		this(0, 0, 0, 0,0,"",0);
	}

	public Vivienda(int nBaños, int nHabitaciones, int capacidadMax, double precio,int añoConstruccion, String direccion, double metrosCuadrados) {
		super(añoConstruccion, direccion, metrosCuadrados);
		this.nBaños = nBaños;
		this.nHabitaciones = nHabitaciones;
		this.capacidadMax = capacidadMax;
		this.precio = precio;
		personasViviendo = new Persona[capacidadMax];
	}

	public boolean addPerson(Persona persona) {
		boolean isAdded = false;
		boolean isRep = false;
		int tamañoActual = 0;
		for (int i = 0; i < personasViviendo.length; i++) {
			if (personasViviendo[i] != null)
				tamañoActual++;
		}
		if (tamañoActual + 1 <= capacidadMax) {
			for (int i = 0; i < personasViviendo.length; i++) {
				if (personasViviendo[i] != null && getPersonasViviendo()[i].getNif().equals(persona.getNif()))
					isRep = true;
			}
			if (!isRep) {
				for (int i = 0; i < personasViviendo.length; i++) {
					if (getPersonasViviendo()[i] == null) {
						personasViviendo[i] = persona;
						isAdded = true;
						break;
					}

				}
			}
		}

		return isAdded;
	}

	public boolean delPerson(Persona persona) {
		boolean isDeleted = false;
		for (int i = 0; i < personasViviendo.length; i++) {
			if (personasViviendo[i] != null && getPersonasViviendo()[i].getNif().equals(persona.getNif())) {
				personasViviendo[i] = null;
				isDeleted = true;
				break;
			}
		}
		return isDeleted;

	}

	public int getnBaños() {
		return nBaños;
	}

	public void setnBaños(int nBaños) {
		this.nBaños = nBaños;
	}

	public int getnHabitaciones() {
		return nHabitaciones;
	}

	public void setnHabitaciones(int nHabitaciones) {
		this.nHabitaciones = nHabitaciones;
	}

	public int getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Persona[] getPersonasViviendo() {
		return personasViviendo;
	}

	public void setPersonasViviendo(Persona[] personasViviendo) {
		this.personasViviendo = personasViviendo;
	}

	@Override
	public String toString() {
		return "Vivienda [getnBaños()=" + getnBaños() + ", getnHabitaciones()=" + getnHabitaciones()
				+ ", getCapacidadMax()=" + getCapacidadMax() + ", getPrecio()=" + getPrecio()
				+ ", getPersonasViviendo()=" + Arrays.toString(getPersonasViviendo()) + ", toString()="
				+ super.toString() + "]";
	}


}