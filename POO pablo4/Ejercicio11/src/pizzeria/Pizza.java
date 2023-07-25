package pizzeria;

import java.util.Arrays;

enum TamañoPizza {
	MEDIANA, FAMILIAR;
}

public class Pizza {

	private TamañoPizza tamañoPizza;
	private Ingrediente[] ingredientes = new Ingrediente[3];

	public Pizza() {
		setTamañoPizza(TamañoPizza.FAMILIAR);
		this.ingredientes[0] = new Ingrediente("Jamon Serrano");
		this.ingredientes[1] = new Ingrediente("Queso");

	}

	public Pizza(Ingrediente[] ingredientes) {
		setTamañoPizza(TamañoPizza.FAMILIAR);
		for (int i = 0; i < ingredientes.length; i++) {
			this.ingredientes[i] = ingredientes[i];
		}
	}

	// Metodos
	public int numeroIngredientes() {
		int resultado = 0;
		for (int i = 0; i < ingredientes.length; i++) {
			if (ingredientes[i] != null)
				resultado++;
		}
		return resultado;

	}

	public boolean añadirIngrediente(String nombreIngrediente, int calorias) {
		boolean resultado = false;
		if (numeroIngredientes() < 3) {
			resultado = true;
			for (int i = 0; i < ingredientes.length; i++) {
				if (ingredientes[i] == null)
					ingredientes[i] = new Ingrediente(nombreIngrediente, calorias);
			}
		}

		return resultado;

	}

	public boolean añadirIngrediente(String nombreIngrediente) {
		boolean resultado = false;
		if (numeroIngredientes() < 3) {
			resultado = true;
			for (int i = 0; i < ingredientes.length; i++) {
				if (ingredientes[i] == null)
					ingredientes[i] = new Ingrediente(nombreIngrediente);
			}
		}

		return resultado;

	}

	public TamañoPizza getTamañoPizza() {
		return tamañoPizza;
	}

	public void setTamañoPizza(TamañoPizza tamañoPizza) {
		this.tamañoPizza = tamañoPizza;
	}

	public Ingrediente[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Ingrediente[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return "Pizza [getTamañoPizza()=" + getTamañoPizza() + ", getIngredientes()="
				+ Arrays.toString(getIngredientes()) + "]";
	}

}
