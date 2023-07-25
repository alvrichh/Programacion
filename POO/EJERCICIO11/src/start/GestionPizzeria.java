package start;

import java.util.Arrays;

import pizzeria.Pedido;

public class GestionPizzeria {

	private Pedido pedido[];
	private Integer maxPedidos;
	private Integer contPedidos;

	public GestionPizzeria(Integer maxPedidos) {
		setMaxPedidos(maxPedidos);
		pedido = new Pedido[maxPedidos];
		contPedidos = 0;
	}

	public Pedido[] getPedido() {
		return pedido;
	}

	public boolean addPedido(Pedido pedido) {
		boolean correcto = false;
		if (getContPedidos() + 1 <= getMaxPedidos()) {
			correcto = true;
			this.pedido[getContPedidos()] = pedido;
			setContPedidos(getContPedidos() + 1);
		}
		return correcto;
	}

	public Integer getMaxPedidos() {
		return maxPedidos;
	}

	public void setMaxPedidos(Integer maxPedidos) {
		this.maxPedidos = maxPedidos;
	}

	public Integer getContPedidos() {
		return contPedidos;
	}

	public void setContPedidos(Integer contPedidos) {
		this.contPedidos = contPedidos;
	}

	@Override
	public String toString() {
		return "GestionPizzeria [pedido=" + Arrays.toString(pedido) + ", maxPedidos=" + maxPedidos + ", contPedidos="
				+ contPedidos + "]";
	}

}
