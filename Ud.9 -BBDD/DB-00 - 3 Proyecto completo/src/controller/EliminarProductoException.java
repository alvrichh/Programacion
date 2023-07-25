package controller;

import model.Producto;

@SuppressWarnings("serial")
public class EliminarProductoException extends Exception {

	public EliminarProductoException(Producto p) {
		super("No se ha podido eliminar el producto: " + p.getProductCode());
	}

}