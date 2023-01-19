package start;

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

	public void setPedido(Pedido[] pedido) {
		this.pedido = pedido;
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

	
}
