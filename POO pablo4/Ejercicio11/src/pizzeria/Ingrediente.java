package pizzeria;

public class Ingrediente {
	private String ingrediente;
	private int calorias;

	public Ingrediente() {
		setIngrediente("Queso");
		setCalorias(250);
	}

	public Ingrediente(String ingrediente) {
		setIngrediente(ingrediente);
		setCalorias(250);
	}

	public Ingrediente(String ingrediente, int calorias) {
		setIngrediente(ingrediente);
		setCalorias(calorias);
	}

	public String getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	@Override
	public String toString() {
		return "Ingrediente [getIngrediente()=" + getIngrediente() + ", getCalorias()=" + getCalorias() + "]";
	}

}
