package controller;

import model.Producto;

@SuppressWarnings("serial")
public class InsertarProductoException extends Exception {

	public InsertarProductoException(Producto p) {
		super("No se ha podido eliminar el producto: " + p.getProductCode());
	}

}