package pizzeria;

import static pizzeria.Pizza.tipo.FAMILIAR;

import java.util.Iterator;

public class Pizza {
	public enum tipo {
		MEDIANA, FAMILIAR
	}

	private final Integer MAX_ING = 3;

	private tipo tipo;
	private Ingrediente ingrediente[];
	private Integer contIng;

	public Pizza() {
		setTipo(FAMILIAR);
		ingrediente = new Ingrediente[MAX_ING];
		contIng = 0;
		addIngrediente(new Ingrediente("Jamon Iberico", 75));
		addIngrediente(new Ingrediente());
	}

	public Pizza(tipo tipo) {
		setTipo(tipo);
		ingrediente = new Ingrediente[MAX_ING];
		contIng = 0;
	}
	public boolean addIngrediente(Ingrediente ingrediente) {
		boolean correcto = false;
		if (getToIng() + 1 <= getMAX_ING()) {
			correcto = true;
			this.ingrediente[getToIng()] = ingrediente;
			setToIng(getToIng() +1);
		}
		return correcto;
	}

	private void setToIng(int i) {
		contIng++;
	}

	private int getToIng() {

		return contIng;
	}

	public tipo getTipo() {
		return tipo;
	}

	public void setTipo(tipo tipo) {
		this.tipo = tipo;
	}

	public Ingrediente[] getIngrediente() {
		return ingrediente;
	}

	private int getMAX_ING() {
		return MAX_ING;
	}
	

}
