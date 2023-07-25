package controller;

@SuppressWarnings("serial")
public class ProductoNoEncontradoException extends Exception {

	public ProductoNoEncontradoException(String code) {
		super("No se ha podido encontrar el producto: " + code);
	}

}