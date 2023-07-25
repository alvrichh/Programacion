package controller;

import model.OrderDetail;

@SuppressWarnings("serial")
public class InsertarProductoEnPedidoException extends Exception {

	public InsertarProductoEnPedidoException(OrderDetail od) {
		super("No se ha podido insertar el producto " + od.getProductCode() + " en el pedido: " + od.getOrderNumber());
	}

}