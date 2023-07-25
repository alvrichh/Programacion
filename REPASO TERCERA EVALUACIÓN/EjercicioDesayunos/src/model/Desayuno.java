package model;

public class Desayuno {
	
	private String food;
	private String name;
	private Double price;
	private String descripcion;
	private int calories;
	
	public Desayuno(String food,String name, Double price, String descripcion, int calories) {
		setFood(food);
		setName(name);
		setPrice(price);
		setDescripcion(descripcion);
		setCalories(calories);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	
	

}
