package pizzeria;

public class Ingrediente {
	
	private String nombre;
	private int calorias;
	
//	private boolean res;

	public Ingrediente() {
		setNombre("Queso");
		setCalorias(250);

	}
	public Ingrediente(String nombre, int caloriaas) {
		setNombre(nombre);
		setCalorias(calorias);

	}

	// =========GETTERS Y SETTERS==========

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

}
