package pizzeria;

import java.time.LocalDate;

public class Pedido {
	
	private Pizza pizza;
	private LocalDate momento;
	
	public Pedido() {
		setPizza(new Pizza());
		setMomento(LocalDate.now());
	}
	
	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	public LocalDate getMomento() {
		return momento;
	}

	public void setMomento(LocalDate momento) {
		this.momento = momento;
	}

}
