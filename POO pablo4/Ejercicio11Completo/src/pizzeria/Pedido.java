package pizzeria;

import java.util.Date;

public class Pedido {

	private Pizza pizza;
	Date fecha;

	public Pedido() {
		setPizza(new Pizza());
		fecha = new Date();
	}

	public Pedido(Ingrediente[] ingredientes) {
		setPizza(new Pizza(ingredientes));
		fecha = new Date();

	}

	// Metodos

	public String infoPedido() {
		return "Se ha pedido una pizza: \n" + pizza.toString() + "\nen: " + fecha;
	}

	// SETGET
	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String toString() {
		return "Pedido [getPizza()=" + getPizza() + "]";
	}

}
