package controller;

@SuppressWarnings("serial")
public class CantidadProductosNoValidoException extends Exception {

	public CantidadProductosNoValidoException() {
		super("No se puede tener una tienda con una cantidad negativa de productos.");
	}

}